package com.crm.Vtiger.testcases3;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.HomePageclass;
import ObjectRepository.LoginPageclass;
import ObjectRepository.NeworgPageclass;
import ObjectRepository.OrganisationsPageclass;
import generalUtilities.BaseClass;
import generalUtilities.ExcelFileUtility;
import generalUtilities.JavaUtility;
import generalUtilities.ListImp;
import generalUtilities.PropertyFileUtility;
@Listeners(ListImp.class)
public class CreataeOrganisationBCPOMTest extends BaseClass
{
	@Test(groups="integration")
	public void CreataeOrganisationBCPOM() throws Throwable
	{
		PropertyFileUtility pfu=new PropertyFileUtility();
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName=efu.readDataFromExcelFile("Sheet1", 1, 1)+JavaUtility.generateRannum();
		
		LoginPageclass lpc=new LoginPageclass(driver);
		HomePageclass hpc=new HomePageclass(driver);
		OrganisationsPageclass opc=new OrganisationsPageclass(driver);
		NeworgPageclass npc=new NeworgPageclass(driver);

		hpc.getorglink().click();

		opc.getcreorg().click();

		npc.orgTF(orgName);
		npc.Sbutton();

		Thread.sleep(4000);

	}
}
