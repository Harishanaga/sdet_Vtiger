package generalUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListImp implements ITestListener
{
	ExtentTest test;
	ExtentReports reports;

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.flush();
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReports/Vtiger.html");
		reporter.config().setDocumentTitle("V-TIGER");
		reporter.config().setTheme(Theme.STANDARD);

		reports = new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Build", "10.3.5");
		reports.setSystemInfo("Reporter Name", "Pavan");
		reports.setSystemInfo("Env", "QA");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String path=BaseClass.takeScreenShot(result.getMethod().getMethodName());
		test.log(Status.FAIL,result.getMethod().getMethodName()+"got Failed");
		test.log(Status.FAIL, result.getThrowable());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.SKIP, result.getMethod().getMethodName()+"got Skipped");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS,result.getMethod().getMethodName()+"got Passed");
	}
	
}
