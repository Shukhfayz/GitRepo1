package utilities;

import java.io.File;
import java.sql.Timestamp;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void getscreenshot(String name) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(("user.dir")+"screenshot_" + name + timestamp() + ".png");
        FileUtils.copyFile(scr, dest);
        Thread.sleep(3000);
    }
	
	public static Timestamp timestamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp;
	}
}
