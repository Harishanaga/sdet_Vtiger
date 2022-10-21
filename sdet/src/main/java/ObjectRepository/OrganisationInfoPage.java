package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfoPage 
{
	@FindBy(className="dvHeaderText")
	private WebElement Header;
	
	public OrganisationInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHeader()
	{
		return Header;
	}
	
	public String hText()
	{
		String arr=(String) Header.getText();
		String arr1[]=arr.split(" ");
		String value=arr1[0];
		String value1=arr1[1];
		String value2=arr1[2];
		String value3=arr1[3];
		return value3;
	}
}
