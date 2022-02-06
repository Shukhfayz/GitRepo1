package testRunners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.TakeScreenshot;


public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.print("Test started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successful");
	}

	public void onTestFailure(ITestResult result) {
//		String name = result.getName();
		
//			try {
//				TakeScreenshot.captureScreenShot();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		System.out.println("Test Failed");
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start ");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}

}
