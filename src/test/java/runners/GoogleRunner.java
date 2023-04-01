package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/json-reports/cucumber.json", "junit:target/xml-report/cucumber.xml"},
        dryRun = false,
        tags = "@Google"
)
public class GoogleRunner {
}
