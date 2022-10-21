package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generalUtilities.ExcelFileUtility;

public class Excel_DataProvider {
	
	@Test(dataProvider="exceloperation")
	public void data(String un,String pwd)
	{
		System.out.println(un + " "+ pwd);
	}
	@DataProvider
	public Object[][] exceloperation() throws Throwable
	{
		Object[][] arr=new Object[4][2];
		ExcelFileUtility efu=new  ExcelFileUtility();
		for(int i=0;i<=efu.getLastRowCount("Sheet2");i++)
		{
			arr[i][0]=efu.readDataFromExcelFile("Sheet2", i, 0);
			arr[i][1]=efu.readDataFromExcelFile("Sheet2", i, 1);
			
		}
		return arr;
	}
}
