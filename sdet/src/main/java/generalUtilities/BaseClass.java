package generalUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import ObjectRepository.HomePageclass;
import ObjectRepository.LoginPageclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public static WebDriver odriver;
	PropertyFileUtility pfu=new PropertyFileUtility();
	
	@BeforeSuite(groups={"smoke","regression","integration"})
	public void DatabaseConnection()
	{
		System.out.println("....Connecting to database....");
	}

	@AfterSuite(groups={"smoke","regression","integration"})
	public void enddatabase()
	{
		System.out.println("....Database Connection ending....");
	}
	
	@Parameters("harisha")
	@BeforeClass(groups={"smoke","regression","integration"})
	public void launchBrowser(String Browser) throws Throwable 
	{
		String browser=pfu.readDataFromPropertyFile("harisha");
		if(Browser.equals(browser)) {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        odriver=driver;
		}
		else if(Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
	        driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("wrong browser");
		}
		odriver=driver;
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("http://localhost:8888/");
	}

//	@BeforeClass(groups={"smoke","regression","integration"})
//	
//	public void launchBrowser() 
//	{
//		
//		WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//		
//		odriver=driver;
//		WebDriverUtility wdu=new WebDriverUtility(driver);
//		wdu.maximize();
//		wdu.implicitlyWait();
//		driver.get("http://localhost:8888/");
//
//	}

	@AfterClass(groups={"smoke","regression","integration"})
	public void CloseBrowser()
	{
		driver.close();
	}

	@BeforeMethod(groups={"smoke","regression","integration"})
	public void Login() throws Throwable
	{

		String username=pfu.readDataFromPropertyFile("username");
		String Pwd=pfu.readDataFromPropertyFile("password");
		LoginPageclass loginPageclass=new LoginPageclass(driver);
		loginPageclass.login(username, Pwd);
	}

	@AfterMethod(groups={"smoke","regression","integration"})
	public void Logout()
	{
		HomePageclass hpc=new HomePageclass(driver);
		hpc.signout(driver);


	}

}
