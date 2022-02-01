package testRunners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.TakeScreenshot;


public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.print("Test started");
		String name = result.getName();
		try {
			TakeScreenshot.getscreenshot(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successful");
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		try {
			TakeScreenshot.getscreenshot(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

	public void onFinish(ITestContext context) {
	}

}
