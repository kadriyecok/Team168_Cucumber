package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[.='Allow all cookies'])[3]")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//input[@*='email']")
    public WebElement loginSayfasiEmailKutusu;

    @FindBy(xpath = "//input[@*='pass']")
    public WebElement loginSayfasiPasswordKutusu;

    @FindBy(xpath = "//div[@*='Log in']")
    public WebElement loginSayfasiLoginButonu;
}
