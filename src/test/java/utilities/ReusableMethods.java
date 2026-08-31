package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    public static void bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep komutu calismadi");
        }
    }

    public static List<String> stringListeDondur(List<WebElement> webElementListesi){

        List<String> stringList = new ArrayList<>();

        for ( WebElement eachElement : webElementListesi){

            stringList.add( eachElement.getText() );
        }

        return stringList;
    }


    public static void titleIleWindowGecisYap(WebDriver driver, String hedefWindowunTitle) {
        // 1- Acik olan tum windowlarin whd'lerini alip kaydedelim

        Set<String> acikWindowlarinWhdleri = driver.getWindowHandles();


        for (String eachWhd : acikWindowlarinWhdleri) {
            driver.switchTo().window(eachWhd);
            // gectigimiz window'un title'ini alip
            // gecmek istedigimiz window'un title'ina esit mi diye kontrol edelim

            if (driver.getTitle().equals(hedefWindowunTitle)) {
                // dogru windows'tayiz demektir, burada kalabiliriz
                break;
            }
        }
    }

    public static void urlIleWindowGecisYap(WebDriver driver, String hedefUrl) {

        // 1.adim acik tum window'lari whd'leri alip kaydedelim
        Set<String> acikTumWindowWhdSeti = driver.getWindowHandles();

        for (String eachWhd : acikTumWindowWhdSeti) {

            driver.switchTo().window(eachWhd);

            if (driver.getCurrentUrl().equals(hedefUrl)) {
                // actual url hedef url'e esit ise
                // dogru yerdeyiz demektir, orada kalalim

                break;
            }
        }
    }

    public static void tumSayfaResimCek(WebDriver driver) {


        // 1.adim tss objesini olusturalim
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // 2.adim resmi kaydedecegimiz file'i olusturalim
        String dosyaYolu = "target/screenshot/tumSayfaResmi.jpeg";
        File tumSayfaResmi = new File(dosyaYolu);

        // 3.adim screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya, tumSayfaResmi);
        } catch (IOException e) {
            System.out.println("Resim cekilemedi");
        }
    }

    public static void tumSayfaResimCek(WebDriver driver, String raporIsmi) {


        // 1.adim tss objesini olusturalim
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // 2.adim resmi kaydedecegimiz file'i olusturalim
        String dosyaYolu = "target/screenshot/" + raporIsmi + ".jpeg";
        File tumSayfaResmi = new File(dosyaYolu);

        // 3.adim screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya, tumSayfaResmi);
        } catch (IOException e) {
            System.out.println("Resim cekilemedi");

        }

    }

    public static void tarihliTumSayfaResmiCek(WebDriver driver){

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("_yyMMdd_HHmmss");
        String tarihEtiketi = localDateTime.format(format);

        // 1.adim tss objesini olusturalim
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // 2.adim resmi kaydedecegimiz file'i olusturalim
        String dosyaYolu = "target/screenshot/tumSayfaResmi " + tarihEtiketi + ".jpeg";
        File tumSayfaResmi = new File(dosyaYolu);

        // 3.adim screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya, tumSayfaResmi);
        } catch (IOException e) {
            System.out.println("Resim cekilemedi");
        }

    }

    public static void tarihliTumSayfaResmiCek(WebDriver driver, String raporIsmi){

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("_yyMMdd_HHmmss");
        String tarihEtiketi = localDateTime.format(format);

        // 1.adim tss objesini olusturalim
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // 2.adim resmi kaydedecegimiz file'i olusturalim
        String dosyaYolu = "target/screenshot/" + raporIsmi + tarihEtiketi + ".jpeg";
        File tumSayfaResmi = new File(dosyaYolu);

        // 3.adim screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya, tumSayfaResmi);
        } catch (IOException e) {
            System.out.println("Resim cekilemedi");

        }
    }

    public static void webElementResimCek(WebElement webElement){

        //1.Adim screenshot alacagimiz webEleemnti locate edip kaydedelim
        //                  biz parametre olarak gonderiyoruz


        //2.adim resmi kaydedecegimiz File'i olusturalim
        String dosyaYolu = "target/screenshot/WebElementResmi.jpeg";
        File webElementResim = new File(dosyaYolu);

        //3.adim webElementi kullanarak screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = webElement.getScreenshotAs(OutputType.FILE);

        //4.adim gecici dosyayi asil dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciDosya,webElementResim);
        } catch (IOException e) {
            System.out.println("Web element resmi cekilemedi");
        }

    }

    public static void webElementResimCek(WebElement webElement,String raporIsmi){

        //1.Adim screenshot alacagimiz webEleemnti locate edip kaydedelim
        //                  biz parametre olarak gonderiyoruz


        //2.adim resmi kaydedecegimiz File'i olusturalim
        String dosyaYolu = "target/screenshot/" + raporIsmi + ".jpeg";
        File webElementResim = new File(dosyaYolu);

        //3.adim webElementi kullanarak screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = webElement.getScreenshotAs(OutputType.FILE);

        //4.adim gecici dosyayi asil dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciDosya,webElementResim);
        } catch (IOException e) {
            System.out.println("Web element resmi cekilemedi");
        }

    }

    public static void tarihliWebElementResimCek(WebElement webElement){

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("_yyMMdd_HHmmss");

        String tarihEtiketi = localDateTime.format(format);
        //1.Adim screenshot alacagimiz webEleemnti locate edip kaydedelim
        //                  biz parametre olarak gonderiyoruz


        //2.adim resmi kaydedecegimiz File'i olusturalim
        String dosyaYolu = "target/screenshot/WebElementResmi" + tarihEtiketi + ".jpeg";
        File webElementResim = new File(dosyaYolu);

        //3.adim webElementi kullanarak screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = webElement.getScreenshotAs(OutputType.FILE);

        //4.adim gecici dosyayi asil dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciDosya,webElementResim);
        } catch (IOException e) {
            System.out.println("Web element resmi cekilemedi");
        }

    }

    public static void tarihliWebElementResimCek(WebElement webElement,String raporIsmi){

        LocalDateTime localDateTime= LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("_yyMMdd_HHmmss");
        String tarihEtiketi = localDateTime.format(format);

        //1.Adim screenshot alacagimiz webEleemnti locate edip kaydedelim
        //                  biz parametre olarak gonderiyoruz


        //2.adim resmi kaydedecegimiz File'i olusturalim
        String dosyaYolu = "target/screenshot/" + raporIsmi + tarihEtiketi + ".jpeg";
        File webElementResim = new File(dosyaYolu);

        //3.adim webElementi kullanarak screenshot'i alip gecici bir dosya olarak kaydedelim
        File geciciDosya = webElement.getScreenshotAs(OutputType.FILE);

        //4.adim gecici dosyayi asil dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciDosya,webElementResim);
        } catch (IOException e) {
            System.out.println("Web element resmi cekilemedi");
        }

    }

    public static String raporaResimEkle(String testIsmi) throws IOException {

        LocalDateTime localDateTime =LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("_yyyyMMdd_HHmmss");
        String date = localDateTime.format(format); // _241219_080623

        //1.adim takeScreenshot objesi olusturalim
        //  ve tss objesi ile gecici resmi kaydedelim
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File geciciDosya = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // Asil resmikaydedecegimiz dosya yolunu olusturup
        // bu dosya yolu ile resmi kaydedecegimiz asil dosyayi olusturalim
        String dosyaYolu = System.getProperty("user.dir") + "/test-output/Screenshots/"
                        + testIsmi + date + ".jpg";
        File asilResimDosyasi = new File(dosyaYolu);
        //gecici dosyayi asil dosyaya kopyalayalim
        FileUtils.copyFile(geciciDosya,asilResimDosyasi);
        return dosyaYolu;
    }

}


