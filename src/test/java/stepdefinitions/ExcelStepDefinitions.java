package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    // Page objelerini olustur

    HomePage blueRentalHomePage;
    LoginPage blueRentalLoginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelDatalari;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) {

        String path = "./src/test/java/resources/mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        excelUtils = new ExcelUtils(path,sayfa);
        excelDatalari = excelUtils.getDataList();


    }

}
