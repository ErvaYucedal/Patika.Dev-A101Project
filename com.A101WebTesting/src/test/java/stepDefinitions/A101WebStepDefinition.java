package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.selectRandomTextFromDropdown;
import static utilities.ReusableMethods.waitFor;

public class A101WebStepDefinition {
    A101Page a101Page=new A101Page();
    Faker faker=new Faker();
    Select select;
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    Actions actions=new Actions(Driver.getDriver());


    @Given("Kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String a101Url) {
        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
        a101Page.cerez.click();
        waitFor(3);
    }

    @And("Kullanici Kategoriler butonunu tiklar")
    public void kullaniciKategorilerButonunuTiklar() {
        if (!a101Page.kategorilerButonuList.isEmpty()) {
            a101Page.kategorilerButonuList.get(0).click();
        }
    }

    @And("Kullanici Giyim & Aksesuar butonuna tiklar")
    public void kullaniciGiyimAksesuarButonunaTiklar() {
        a101Page.giyimAksesuarButonu.click();
    }

    @Then("Kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String title) {
        ReusableMethods.titlesClick(title);
    }

    @Then("Kullanici ilk urune tiklar")
    public void kullanici_ilk_urune_tiklar() {
        a101Page.siyahCorap.click();
    }

    @Then("Kullanici urun renginin siyah oldugunu dogrular")
    public void kullanici_urun_renginin_siyah_oldugunu_dogrular() {
      waitFor(5);
        Assert.assertTrue(a101Page.urununRenginiDogrulama.getText().contains("Siyah"));
        System.out.println("urunun siyah rengi oldugu dogrulandi");

    }
    @When("Kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {
        a101Page.sepeteEklemeButonu.click();
        waitFor(3);
    }
    @Then("Kullanici Uye olmadan Devam et butonuna tiklar")
    public void kullanici_uye_olmadan_devam_et_butonunu_tiklar() {
        actions.sendKeys(Keys.DOWN).perform();
        a101Page.uyeOlmadanDevamEt.click();
        waitFor(3);
    }

    @Then("Kullanici gecerli bir e-posta girer ve devam et butonuna tiklar")
    public void kullanici_gecerli_bir_e_posta_girer_ve_devam_et_butonina_tiklar() {
        a101Page.gecerliEmail.sendKeys(faker.internet().emailAddress());
        waitFor(3);
        a101Page.devamEtButonu.click();
    }
    @Then("Kullanici gerekli teslimat bilgilerini doldurur ve kaydet butonuna tiklar")
    public void kullanici_gerekli_teslimat_bilgilerini_doldurur_ve_kaydet_butonuna_tiklar() {
        a101Page.yeniAdres.click();
        waitFor(3);
        actions.click(a101Page.adresBasligi).sendKeys("Ev adresim")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).perform();
        a101Page.cepTelefonu.sendKeys("1011011010");
        select=new Select(a101Page.il);
        selectRandomTextFromDropdown(select);
        select=new Select(a101Page.ilce);
        selectRandomTextFromDropdown(select);
        waitFor(3);
        select=new Select(a101Page.mahalle);
        selectRandomTextFromDropdown(select);
        a101Page.adresKutusu.sendKeys(faker.address().fullAddress());
        actions.sendKeys(Keys.DOWN);
        a101Page.kaydet.click();
    }

    @And("Kullanici kargo firmasini secer ve kaydet ve Devam et butonuna tiklar")
    public void kullaniciKargoFirmasiniSecerVeKaydetVeDevamEtButonunaTiklar() {
        a101Page.SendeoKargo.click();
        a101Page.kaydetVeDevamEt.click();
    }

    @When("Kullanici odeme ekraninda oldugunu dogrular")
    public void kullaniciOdemeEkranindaOldugunuDogrular() {
        Assert.assertTrue(a101Page.odemeSayfasiDogrulama.getText().contains("2. ÖDEME SEÇENEKLERİ"));
        System.out.println("Odeme sayfasinda oldugu dogrulandi");
    }



}

