package com.crm.Vtiger.testcases2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.HomePageclass;
import ObjectRepository.LeadsPageclass;
import ObjectRepository.LoginPageclass;
import ObjectRepository.NewLeadsPageclass;
import generalUtilities.ExcelFileUtility;
import generalUtilities.JavaUtility;
import generalUtilities.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadsPOMtest {

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
		String orgName=efu.readDataFromExcelFile("Sheet1", 1, 1); 
		 String fNAME=efu.readDataFromExcelFile("Sheet1", 3, 1);
		 String fNAMETF=efu.readDataFromExcelFile("Sheet1", 4, 1);
		 String lNAMETF=efu.readDataFromExcelFile("Sheet1", 5, 1);
		 String leNAME=efu.readDataFromExcelFile("Sheet1", 1, 3);
		 String InNAME=efu.readDataFromExcelFile("Sheet1", 1, 2);
		driver.get(uRL);
		
		LoginPageclass lpc=new LoginPageclass(driver);
		lpc.login(username, Pwd);
		
		HomePageclass hpc=new HomePageclass(driver);
		hpc.getleadslink().click();
		
		LeadsPageclass lepc=new LeadsPageclass(driver);
		lepc.leadsbtn();
		
		NewLeadsPageclass nlpc =new NewLeadsPageclass(driver);
		nlpc.getfNameDD(fNAME);
		nlpc.FirstName(fNAMETF);
		nlpc.LastName(lNAMETF);
		nlpc.ComName(orgName);
		nlpc.Leaddd(leNAME);
		nlpc.industryDD(InNAME);
		nlpc.Sbutton();
		hpc.signout(driver);
	}

}
