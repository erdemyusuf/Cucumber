package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC07steps {

    PracticeTC07Page practiceTC07Page=new PracticeTC07Page();
    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @When("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String homeUrl="https://automationexercise.com/";
        Assert.assertEquals("home url esit degil",homeUrl,Driver.getDriver().getCurrentUrl());
    }

    @And("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
        practiceTC07Page.testCaseLink.click();
    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendirildiginiDogrulayin() {
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());
    }

    @And("ilgili sayfanin ekran goruntusunu alin")
    public void ilgiliSayfaninEkranGoruntusunuAlin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
