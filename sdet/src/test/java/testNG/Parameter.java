package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	
	@Test
	@Parameters("harisha")
	public void parame(String browser) {
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
	}
	

}
