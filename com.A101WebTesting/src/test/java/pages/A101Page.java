package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class A101Page {

    public A101Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='hype-link hype-dropdown hype-categories-link']")
    public List<WebElement> kategorilerButonuList;

    @FindBy(xpath="(//a[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement giyimAksesuarButonu;

    @FindBy (xpath="//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerez;

    @FindBy(xpath = "(//div[@class='product-desc '])[1]")
    public WebElement siyahCorap;

    @FindBy(xpath = "//h1[text()='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public  WebElement urununRenginiDogrulama;

    @FindBy (xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEklemeButonu;

    @FindBy(xpath = "(//a[@title='ÜYE OLMADAN DEVAM ET'])[1]")
    public  WebElement uyeOlmadanDevamEt;

    @FindBy (xpath = "//input[@name='user_email']")
    public WebElement gecerliEmail;

    @FindBy (xpath = "//button[@class='button block green']")
    public WebElement devamEtButonu;

    @FindBy (xpath = "(//*[@title='Yeni adres oluştur'])[1]")
    public WebElement yeniAdres;

    @FindBy (xpath = "//input[@placeholder='Ev adresim, iş adresim vb.']")
    public WebElement adresBasligi;

    @FindBy (xpath = "//input[@name='phone_number']")
    public WebElement cepTelefonu;

    @FindBy (xpath = "//select[@name='city']")
    public WebElement il;

    @FindBy (xpath = "//select[@name='township']")
    public WebElement ilce;

    @FindBy (xpath = "//select[@name='district']")
    public WebElement mahalle;

    @FindBy (xpath = "//textarea[@class='js-address-textarea']")
    public WebElement adresKutusu;

    @FindBy (xpath = "//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']"
    )public WebElement kaydet;

    @FindBy(xpath = "(//label[@class='js-checkout-cargo-item'])[1]")
    public WebElement SendeoKargo;

    @FindBy (xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamEt;

    @FindBy (xpath = "//*[text()='2. ÖDEME SEÇENEKLERİ']")
    public WebElement odemeSayfasiDogrulama;

}
