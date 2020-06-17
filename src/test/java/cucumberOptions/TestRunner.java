package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", tags = "@example", strict = true, monochrome = true, plugin = {
        "pretty", "html:target/reports/cucumber", "json:target/reports/cucumber.json",
        "junit:target/reports/cucumberReport.xml" })

public class TestRunner {

}