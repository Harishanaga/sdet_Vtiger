package com.crm.Vtiger.testcases2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.ContactsPageclass;
import ObjectRepository.HomePageclass;
import ObjectRepository.LoginPageclass;
import ObjectRepository.NewContactPageclass;
import generalUtilities.ExcelFileUtility;
import generalUtilities.JavaUtility;
import generalUtilities.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactPOMtest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		generalUtilities.WebDriverUtility wdu=new generalUtilities.WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("http://localhost:8888/");
		
		PropertyFileUtility pfu=new PropertyFileUtility();
		String uRL=pfu.readDataFromPropertyFile("url");
		String username=pfu.readDataFromPropertyFile("username");
		String Pwd=pfu.readDataFromPropertyFile("password");
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName=efu.readDataFromExcelFile("Sheet1", 1, 1)+JavaUtility.generateRannum(); 
		 String fNAME=efu.readDataFromExcelFile("Sheet1", 3, 1);
		 String fNAMETF=efu.readDataFromExcelFile("Sheet1", 4, 1);
		 String lNAMETF=efu.readDataFromExcelFile("Sheet1", 5, 1);
		 
		driver.get(uRL);
		
		LoginPageclass lpc=new LoginPageclass(driver);
		lpc.login(username, Pwd);
		
		HomePageclass hpc=new HomePageclass(driver);
		hpc.getcontlink().click();
		
		 ContactsPageclass cpc=new ContactsPageclass(driver);
		 cpc.contactbtn();
		 
		
			
		 NewContactPageclass ncpc=new NewContactPageclass(driver);
		 ncpc.getfNameDD(fNAME);
		 
			
		 ncpc.FirstName(fNAMETF);
		 
		 ncpc.LastName(lNAMETF);
		 
		 ncpc.getorgName().click();
		 
		 String parentwin =driver.getWindowHandle();
		 System.out.println(parentwin);
		 Set<String> allwinHan =driver .getWindowHandles();
		 for(String awindowhandles:allwinHan) {
			 System.out.println(awindowhandles);
			 driver.switchTo().window(awindowhandles);
		 }
		 
		 WebElement orgSearchTf =driver.findElement(By.name("search_text"));
		 orgSearchTf.sendKeys("TestYantra180");
		 WebElement searchButton =driver.findElement(By.name("search"));
		 searchButton.click();
		 WebElement SelectGGc=driver .findElement(By.id("1"));
		 SelectGGc.click();
		 driver.switchTo().window(parentwin);
		 ncpc.Sbutton();
		 Thread.sleep(2000);
		 
		 hpc.signout(driver);
			 
		  driver.close();
	}

	}


