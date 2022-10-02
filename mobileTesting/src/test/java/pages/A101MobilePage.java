package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101MobilePage {

    public A101MobilePage()  {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getBrowserDriver()),this);
    }

    @FindBy (xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public MobileElement cerezKabulEt;

    @FindBy (xpath = "//a[@title='Menü']")
    public MobileElement menu;

    @FindBy(xpath = "//a[@title='GİYİM & AKSESUAR']")
    public MobileElement giyimAksesuar;

    @FindBy(xpath = "(//ul[@class='sub-navigation js-sub-navigation shown']//a)[3]")
    public MobileElement kadinIcGiyim;

    @FindBy(xpath = "//a[contains(text(),'Dizaltı')]")
    public MobileElement dizAltiCorap;

    @FindBy(xpath = "(//a[@class='name-price'])[1]")
    public MobileElement ilkUrun;

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public MobileElement urunSepetEkleme;

    @FindBy(xpath = "//h1[text()='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public  MobileElement urununRenginiDogrulama;

    @FindBy(xpath = "//a[@class='go-to-shop']")
    public MobileElement sepetiGoruntulemeButonu;

    @FindBy(xpath = "//a[contains(text(),'Sepeti Onayla')]")
    public MobileElement sepetiOnaylamaButonu;

    @FindBy (xpath = "//a[contains(text(),'ÜYE OLMADAN')]")
    public MobileElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    public MobileElement gecerliMailAdresi;

    @FindBy(xpath = "//button[@class='button block green']")
    public MobileElement devamEtButonu;

    @FindBy(xpath = "//a[@title='Yeni adres oluştur']")
    public MobileElement yeniAdresOlustur;

    @FindBy(xpath = "//input[@name='title']")
    public MobileElement adresBasligi;

    @FindBy(xpath = "//input[@name='first_name']")
    public MobileElement isim;

    @FindBy(xpath = "//input[@name='last_name']")
    public MobileElement soyisim;

    @FindBy(xpath = "//input[@name='phone_number']")
    public MobileElement telefon;

    @FindBy(xpath = "//select[@name='city']")
    public MobileElement il;

    @FindBy(xpath = "//select[@name='township']")
    public MobileElement ilce;

    @FindBy (xpath = "//select[@name='district']")
    public MobileElement mahalle;

    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public MobileElement adres;

    @FindBy(xpath = "//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public MobileElement kaydet;

    @FindBy(xpath = "(//label[@class='js-checkout-cargo-item'])[1]")
    public MobileElement sendeoKargo;

    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public MobileElement kaydetVeDevamEt;

    @FindBy (xpath = "//*[text()='2. ÖDEME SEÇENEKLERİ']")
    public MobileElement odemeSayfasiDogrulama;

}
