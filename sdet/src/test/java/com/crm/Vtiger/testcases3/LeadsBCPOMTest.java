package com.crm.Vtiger.testcases3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.HomePageclass;
import ObjectRepository.LeadsPageclass;
import ObjectRepository.LoginPageclass;
import ObjectRepository.NewLeadsPageclass;
import generalUtilities.BaseClass;
import generalUtilities.ExcelFileUtility;
import generalUtilities.ListImp;
import generalUtilities.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListImp.class)
public class LeadsBCPOMTest extends BaseClass
{
	
	@Test(groups="regression")
	public void LeadsBCPOM() throws Throwable
	{
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName=efu.readDataFromExcelFile("Sheet1", 1, 1); 
		 String fNAME=efu.readDataFromExcelFile("Sheet1", 3, 1);
		 String fNAMETF=efu.readDataFromExcelFile("Sheet1", 4, 1);
		 String lNAMETF=efu.readDataFromExcelFile("Sheet1", 5, 1);
		 String leNAME=efu.readDataFromExcelFile("Sheet1", 1, 3);
		 String InNAME=efu.readDataFromExcelFile("Sheet1", 1, 2);
		
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
	
	}
}
