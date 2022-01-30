package util;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;

public class TakeScreenshot {

	public static void getscreenshot() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("", "");
		
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(("user.dir")+"screenshot" + timestamp() + ".png");
        FileUtils.copyFile(scr, dest);
        Thread.sleep(3000);
    }
	
	public static void main(String[] args) throws Exception {
		getscreenshot();
	}
	
	public static Timestamp timestamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp;
	}
}
