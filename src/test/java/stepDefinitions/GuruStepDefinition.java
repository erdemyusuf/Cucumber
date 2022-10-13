package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {

    GuruPage guru=new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index=0;
        for (int i = 0; i < guru.basliklar.size(); i++) {
            if(guru.basliklar.get(i).getText().equals(baslik)){
                System.out.println(guru.basliklar.get(i).getText());
                index=i+1;  // locate edilenler 1 den baslıyor bu yuzden i+1 aldik
                List<WebElement> sutunElement= Driver.getDriver().findElements(By.xpath("//tbody//tr//td[]]"));
                //  sutunElement.forEach(t-> System.out.println(t.getText()));   LAMBDA ile cozumu

                for (WebElement w:sutunElement ) {
                    System.out.println(w.getText());
                }


            }

        }

    }
}
