package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"
        },

        features = "src/test/resources/features",
        glue = {
                "techproed/stepDefinitions",
                "techproed/hooks"
        },
        tags = "@US013",
        dryRun = false,

        monochrome = false
)
public class Runner {
}