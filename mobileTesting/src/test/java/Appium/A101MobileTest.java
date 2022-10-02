package Appium;

import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A101MobilePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static utilities.Driver.getBrowserDriver;
import static utilities.ReusableMethods.selectByVisibleText;
import static utilities.ReusableMethods.waitFor;

public class A101MobileTest {
    A101MobilePage a101MobilePage=new A101MobilePage();
    Actions actions = new Actions(getBrowserDriver());
    Faker faker = new Faker();
    Select select;


    @Test
    public void test() throws InterruptedException {
        // 1- Kullanici a101 sitesine gider
        getBrowserDriver().get(ConfigReader.getProperty("a101Url"));
        waitFor(5);
        getBrowserDriver().context("CHROMIUM");

        // 2- Kullanici cerezi kabul eder
        waitFor(5);
        a101MobilePage.cerezKabulEt.click();
        waitFor(5);

        TouchAction ta=new TouchAction<>(getBrowserDriver());
        ta.tap(PointOption.point(885,1347)).perform();

        // 3- Kullanici Menu butonuna tiklar
        a101MobilePage.menu.click();
        waitFor(5);

        // 4- Kullanici Giyim & Aksesuar butonuna tiklar
        a101MobilePage.giyimAksesuar.click();
        waitFor(5);

        // 5- Kullanici Kadın İç Giyim butonuna tiklar
        a101MobilePage.kadinIcGiyim.click();
        waitFor(5);

        // 6- Kullanici Dizalti Corap butonuna tiklar
        a101MobilePage.dizAltiCorap.click();
        waitFor(5);

        // 7- Kullanici ilk urune tiklar
        a101MobilePage.ilkUrun.click();
        waitFor(5);

        // 8- Kullanici urun renginin siyah oldugunu dogrular
        ReusableMethods.waitFor(5);
        Assert.assertTrue(a101MobilePage.urununRenginiDogrulama.getText().contains("Siyah"));
        System.out.println("urunun siyah rengi oldugu dogrulandi");

        // 9- Kullanıcı urunu sepete ekler
        a101MobilePage.urunSepetEkleme.click();
        waitFor(5);

        // 10- Kullanici Sepeti Goruntule butonuna tiklar
        a101MobilePage.sepetiGoruntulemeButonu.click();
        waitFor(5);

        // 11- Kullanici Sepeti Onayla butonuna tiklar
        a101MobilePage.sepetiOnaylamaButonu.click();
        waitFor(5);

        // 12- Kullanici Uye olmadan Devam et butonuna tiklar
       a101MobilePage.uyeOlmadanDevamEt.sendKeys(Keys.ENTER);
        waitFor(5);

        // 13- Kullanici gecerli bir e-posta girer ve devam et butonuna tiklar
        Faker faker=new Faker();
        a101MobilePage.gecerliMailAdresi.sendKeys(faker.internet().emailAddress());
        waitFor(5);
        a101MobilePage.devamEtButonu.click();
        waitFor(5);

        // 14- Kullanici Yeni Adres Olustur butonuna tiklar
        a101MobilePage.yeniAdresOlustur.click();
        waitFor(5);

        // 15- Kullanici gerekli teslimat bilgilerini doldurur ve kaydet butonuna tiklar
        a101MobilePage.adresBasligi.sendKeys("Ev Adresi");
        waitFor(5);
        a101MobilePage.isim.sendKeys(faker.name().firstName());
        waitFor(5);
        a101MobilePage.soyisim.sendKeys(faker.name().lastName());
        waitFor(10);
        a101MobilePage.telefon.sendKeys(faker.phoneNumber().cellPhone());
        waitFor(15);
        selectByVisibleText(a101MobilePage.il,"ISTANBUL");
        waitFor(6);
        selectByVisibleText(a101MobilePage.ilce,"BESIKTAŞ");
        waitFor(6);
        selectByVisibleText(a101MobilePage.mahalle,"DIKILITAS");
        waitFor(6);
        a101MobilePage.adres.sendKeys(faker.address().fullAddress());
        waitFor(5);
        a101MobilePage.kaydet.click();
        waitFor(5);

        // 16- Kullanici kargo firmasini secer ve kaydet ve Devam et butonuna tiklar
        a101MobilePage.sendeoKargo.click();
        waitFor(5);
        a101MobilePage.kaydetVeDevamEt.click();

        // 17- Kullanici odeme ekraninda oldugunu dogrular
         waitFor(5);
        Assert.assertTrue(a101MobilePage.odemeSayfasiDogrulama.getText().contains("2. ÖDEME SEÇENEKLERİ"));
        System.out.println("Odeme sayfasinda oldugu dogrulandi");

        // 18- Kullanici mobil sayfayi kapatir
        getBrowserDriver().close();


    }
    }
