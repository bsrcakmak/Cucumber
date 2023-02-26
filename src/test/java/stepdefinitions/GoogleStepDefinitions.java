package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {   // Her site icin farkli StepDefinitions class'i olusturulur

    GooglePage googlePage = new GooglePage();
    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

        // Cerez cikma durumu icin cerezi okeyleme
        try{
            googlePage.popUpAccept.click();
        }catch(Exception e){
        }
    }
    @When("kullanici iphone icin arama yapar")
    public void kullanici_iphone_icin_arama_yapar() {
        googlePage.searchBox.sendKeys("iPhone", Keys.ENTER);
    }
    @Then("sonuclarin iphone icerdigini dogrular")
    public void sonuclarin_iphone_icerdigini_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("iPhone"));
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("kullanici tesla icin arama yapar")
    public void kullanici_tesla_icin_arama_yapar() {

        googlePage.searchBox.sendKeys("tesla", Keys.ENTER);
    }
    @Then("sonuclarin tesla icerdigini dogrular")
    public void sonuclarin_tesla_icerdigini_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
    }

    @When("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String string) {
        googlePage.searchBox.sendKeys(string, Keys.ENTER);
    } // Bu kod daha dinamik oldu


    @Then("sonuclarin {string} icerdigini dogrular")
    public void sonuclarin_icerdigini_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));
    }


}
