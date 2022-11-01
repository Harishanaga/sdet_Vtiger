package testNG;

import java.io.File;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentReport 
{
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	
	@Test
	public void createReports()
	{
		reporter = new ExtentSparkReporter("./ExtentReports/SDET9.html");
		reporter.config().setDocumentTitle("NEW FB");
		reporter.config().setTheme(Theme.STANDARD);
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Build", "10.3.5");
		reports.setSystemInfo("Reporter Name","harisha");
		reports.setSystemInfo("Env","QA");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		test = reports.createTest("harisha facebook");
		
		TakesScreenshot ts= ((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="./Screenshot/FB1.png";
		File dest=new File(path);
	    try {
	    FileUtils.copyFile(src, dest);
	    }
	    catch(Exception ex)
	    {
	    	System.out.println("exception");
	    }
		
	    
		test.addScreenCaptureFromPath(path);
		reports.flush();
	}
}
