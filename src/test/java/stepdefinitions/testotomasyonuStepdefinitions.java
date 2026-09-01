package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class testotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get("https://www.testotomasyonu.com");
    }
    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {

        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
       String actualAramaSonucu = testotomasyonuPage.aramaSonucElementi.getText();
       String unExpectedAramaSonucu = "0 Products Found";

        Assertions.assertNotEquals(unExpectedAramaSonucu,actualAramaSonucu);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);

    }

    @When("arama kutusuna java yazip aratir")
    public void aramaKutusunaJavaYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("java" + Keys.ENTER);

    }

    @Then("arama sonucunda urun bulunamadigini test eder")
    public void aramaSonucundaUrunBulunamadiginiTestEder() {
        String actualAramaSonucu = testotomasyonuPage.aramaSonucElementi.getText();
        String expectedAramaSonucu = "0 Products Found";

        Assertions.assertEquals(expectedAramaSonucu,actualAramaSonucu);

    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String aranacakKelime) {
        testotomasyonuPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);


    }

    @And("senkronizasyon icin {int} saniye bekler")
    public void senkronizasyonIcinSaniyeBekler(int beklemeSuresi) {

        ReusableMethods.bekle(beklemeSuresi);
    }
}
