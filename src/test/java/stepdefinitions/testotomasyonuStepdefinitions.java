package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.Driver;

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
}
