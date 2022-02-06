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
   
        })
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
