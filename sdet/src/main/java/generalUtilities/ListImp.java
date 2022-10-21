package generalUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListImp implements ITestListener
{

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getThrowable());
		TakesScreenshot ts=((TakesScreenshot)BaseClass.odriver);
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File("./Screenshot/"+result.getMethod().getMethodName()+".PNG");
		try
		{
			Files.copy(scr, desc);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This will start when @Test will start");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Good Job");
		System.out.println("this will execute when @test is gonna pass");
	}
	
}
