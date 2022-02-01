package stepDefinitions;

import org.openqa.selenium.WebDriver;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class LoginSteps extends TestBase {
	
	private static WebDriver driver;
	LoginPage lp;
	
	@Before
	public void setUp() {
		driver = TestBase.initialize();
	}

	@Given("User is on login page")
    public void user_is_on_login_page() throws Throwable {
		lp = new LoginPage(driver);
		driver.get("https://www.homedepot.com/auth/view/signin");
	}

	 @When("^User enters correct (.+)$")
	 public void user_enters_correct(String username) throws Throwable {
	    lp.setEmail(username);
	}

	 @And("^enters correct (.+)$")
	 public void enters_correct(String password) throws Throwable {
	   
	}

	@Then("User successfully login and see user information")
	public void user_successfully_login_and_see_user_information() {
	   System.out.println("successfylly logged in");
	}

	@When("User enters incorrect (.+)$")
	public void user_enters_incorrect(String username) {
	   System.out.println("I entered incorrect username");
	}
	
	@And("enters incorrect (.+)$")
	public void enters_incorrect(String password) {
	   System.out.println("I entered incorrect password");
	}
	@Then("User will see error message Wrong password, try again")
	public void user_will_see_error_message_wrong_password_try_again() {
	   
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
