package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    // Page objelerini olustur

    HomePage homePage;
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelDatalari;

    @Given("kullanici {string} bilgileri ile giris yapar")   // TestNG de tek fark @Test annotations kullanmamiz
    public void kullanici_bilgileri_ile_giris_yapar(String sayfaAdi) throws IOException {

        String path = "./src/test/resources/testdata/mysmoketestdata.xlsx";
        //String sayfa = "customer_info";   --> her zaman customer_infoya gider
        excelUtils = new ExcelUtils(path,sayfaAdi);
        excelDatalari = excelUtils.getDataList();

        for(Map<String, String > data : excelDatalari){
            // Ana sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));
            homePage = new HomePage();
            loginPage = new LoginPage();

            // Ana sayfa login sayfasina tikla
            homePage.firstLogin.click();
            ReusableMethods.waitFor(3);

            // email'i gonder
            loginPage.email.sendKeys(data.get("username"));
            ReusableMethods.waitFor(3);

            // password gonder
            loginPage.password.sendKeys(data.get("password"));
            ReusableMethods.waitFor(3);

            //login butonuna tikla
            loginPage.login.click();
            ReusableMethods.waitFor(3);

            // GIRIS YAPILDI, giris yapildigini verify edelim
            // userID gorunur ise giris basarilidir
            Assert.assertTrue(homePage.userID.isDisplayed());

            // Ekran goruntusu alalim
            ReusableMethods.getScreenshot("Login_Goruntusu");

            // LOGOUT yapalim
            homePage.userID.click();
            ReusableMethods.waitFor(1);
            homePage.logOutLink.click();
            ReusableMethods.waitFor(1);
            homePage.OK.click();
            ReusableMethods.waitFor(1);
        }
        Driver.closeDriver();
    }
}
