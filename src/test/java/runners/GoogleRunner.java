package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/json-reports/cucumber.json", "junit:target/xml-report/cucumber.xml"},
        dryRun = false,
        tags = "@Google"
)
public class GoogleRunner extends AbstractTestNGCucumberTests {
}
