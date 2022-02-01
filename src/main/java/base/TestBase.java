package base;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utilities.PropertiesFileReader;

public class TestBase extends PropertiesFileReader {
	
	protected static WebDriver driver;
	
	public static WebDriver initialize() {
		
		readProperties();

		String browser = prop.get("browser").toString();
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		String baseUrl = prop.get("url").toString();
		
		driver.get(baseUrl);
		
		return driver;
	}
}
