package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features", // features folder path
        glue = "stepdefinitions", //stepdefinitions path
        tags = "@iphone or @tesla"
)
public class Runner {
}
// Bu sinif Test Case leri RUN etmek icin kullanilir, main method gibi
// Ve konfigurasyonlar icin kullanilir
// Runner class'i, features file'lar ile step definitions'i birbirine baglar
