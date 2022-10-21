package com.crm.Vtiger.testcases3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.ContactsPageclass;
import ObjectRepository.HomePageclass;
import ObjectRepository.LoginPageclass;
import ObjectRepository.NewContactPageclass;
import generalUtilities.BaseClass;
import generalUtilities.ExcelFileUtility;
import generalUtilities.JavaUtility;
import generalUtilities.ListImp;
import generalUtilities.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListImp.class)
public class ContactBCPOMTest extends BaseClass
{
	ExcelFileUtility efu=new ExcelFileUtility();
	@Test(groups="smoke")
	public void ContactBCPOM() throws Throwable
	{
	
	
	String orgName=efu.readDataFromExcelFile("Sheet1", 1, 1)+JavaUtility.generateRannum(); 
	 String fNAME=efu.readDataFromExcelFile("Sheet1", 3, 1);
	 String fNAMETF=efu.readDataFromExcelFile("Sheet1", 4, 1);
	 String lNAMETF=efu.readDataFromExcelFile("Sheet1", 5, 1);
	 
	
	
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
	}
}


