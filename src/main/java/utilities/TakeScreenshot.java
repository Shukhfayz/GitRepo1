package utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

//	public static void getscreenshot(String name) throws Exception {
//		
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//		
//        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File dest = new File(("user.dir")+"screenshot_" + name + timestamp() + ".png");
//        FileUtils.copyFile(scr, dest);
//        Thread.sleep(3000);
//    }
//	
//	public static Timestamp timestamp() {
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		return timestamp;
//	}
	
	public static String captureScreenShot() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = "C:\\Users\\shuhr\\eclipse-workspace\\Cucumber-java\\screenshots\\" + getcurrentdateandtime() + ".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
	}
	
	private static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {
		}
		return str;
	}
}
