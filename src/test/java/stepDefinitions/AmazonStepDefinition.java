package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
      amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
  }

  @And("sonuclarin Nutella icerdigini test eder")
  public void sonuclarinNutellaIcerdiginiTestEder() {
      String arananKelime="Nutella";
      String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
      Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
  }

  @And("sayfayi kapatir")
  public void sayfayiKapatir() {
      Driver.closeDriver();
  }


  @Then("kullanici Selenium icin arama yapar")
  public void kullaniciSeleniumIcinAramaYapar() {
      amazonPage.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);
  }

  @And("sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime="Selenium";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @When("url nin {string} icerdigini test edin")
    public void urlNinIcerdiginiTestEdin(String istenenUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenUrl));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String verilenUrl) {
        Driver.getDriver().get(verilenUrl);
    }
}