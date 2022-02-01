package testRunners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/login.feature"},
		glue = {"stepDefinitions"},
		monochrome = true,
		dryRun = false,
		tags = "",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })
public class JUnitRunner {
}
