package testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/features/login.feature"},
		glue = {"stepDefinitions"},
		monochrome = true,
		dryRun = false,
		tags = "",
		plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class TestNGRunner  extends AbstractTestNGCucumberTests {

}
