package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By emailAddress = By.id("username");
	
	By continueButton = By.xpath("//*[text()='Continue']");
	
	By passwordLoc = By.id("password-input-field");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setEmail(String username) {
		driver.findElement(emailAddress).sendKeys(username);
	}

	public void clickContinue() {
		
		driver.findElement(continueButton).click();
	}
	
	public void setPassword(String password) {
		
		driver.findElement(passwordLoc).sendKeys(password);
	}
}
