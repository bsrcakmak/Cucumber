package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "./src/test/resources/features",//features folder path
        glue = {"stepdefinitions","hooks"},   //stepdefinitions path
        tags = "@failed_scenario",
        dryRun = false
)

        // dryRun= true da browser acilmaz sadece eksik kod var mi ona bakar,
        //         gecmeyen adim var mi diye hizli bir kontroldur
        // dryRun= false da dryRun yokmus gibi normal sekilde calisir,
        //         yani tum adimlari tek tek browserda acar,
        //         test case'in gecip gecmedigini gorebilmek icin her zaman false'a cevirmeliyiz


public class Runner {
}

// Bu sinif Test Case leri RUN etmek icin kullanilir, main method gibi
// Ve konfigurasyonlar icin kullanilir
// Runner class'i, features file'lar ile step definitions'i birbirine baglar
