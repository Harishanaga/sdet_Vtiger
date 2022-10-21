package com.crm.Vtiger.testcases2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ObjectRepository.HomePageclass;
import ObjectRepository.LoginPageclass;
import ObjectRepository.NeworgPageclass;
import ObjectRepository.OrganisationsPageclass;
import generalUtilities.ExcelFileUtility;
import generalUtilities.JavaUtility;
import generalUtilities.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganisationPOMTest {
	public static void main(String[] args) throws Throwable {
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
		driver.get(uRL);
		
		LoginPageclass lpc=new LoginPageclass(driver);
		lpc.login(username, Pwd);
		
		HomePageclass hpc=new HomePageclass(driver);
		hpc.getorglink().click();
		
		OrganisationsPageclass opc=new OrganisationsPageclass(driver);
		opc.getcreorg().click();
		 
	       NeworgPageclass npc=new NeworgPageclass(driver);
	       npc.orgTF(orgName);
	       npc.Sbutton();
	        
      Thread.sleep(3000);
      
      hpc.signout(driver);
      
			 
			  driver.close();

}
}
