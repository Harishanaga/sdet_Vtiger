package com.crm.Vtiger.testcases3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.HomePageclass;
import ObjectRepository.LoginPageclass;
import ObjectRepository.NeworgPageclass;
import ObjectRepository.OrganisationInfoPage;
import ObjectRepository.OrganisationsPageclass;
import generalUtilities.BaseClass;
import generalUtilities.ExcelFileUtility;
import generalUtilities.JavaUtility;
import generalUtilities.ListImp;
import generalUtilities.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListImp.class)
public class OrgNameValidateBCPOMTest extends BaseClass
{
	ExcelFileUtility efu=new ExcelFileUtility();
	@Test(groups="smoke")
	public void OrgNameValidateBCPOM() throws Throwable
	{

	
	String orgName=efu.readDataFromExcelFile("Sheet1", 1, 1)+JavaUtility.generateRannum();
	String indname=efu.readDataFromExcelFile("Sheet1", 1, 2);
	

	HomePageclass hpc=new HomePageclass(driver);
	hpc.getorglink().click();

	OrganisationsPageclass opc=new OrganisationsPageclass(driver);
	opc.getcreorg().click();

	NeworgPageclass npc=new NeworgPageclass(driver);
	npc.orgTF(orgName);


	npc.industryDD(indname);

	Thread.sleep(5000);


	npc.Sbutton();

	OrganisationInfoPage oip=new OrganisationInfoPage(driver);
	
	Assert.assertEquals(orgName, oip.hText());
	
	}
	
}

