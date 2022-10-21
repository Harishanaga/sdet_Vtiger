package ObjectRepository;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalUtilities.WebDriverUtility;

public class HomePageclass {
	
	@FindBy(linkText="Organizations")
	private WebElement orglink;
	
	@FindBy(linkText="Leads")
	private WebElement leadslink;
	
	@FindBy(linkText="Contacts")
	private WebElement contlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminimg;
	
	@FindBy(linkText="Sign Out")
	private WebElement sout;
	
	public HomePageclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getorglink()
	{
		return orglink;
	}
	
	
	
	public WebElement getcontlink()
	{
		return contlink;
	}
	
	public WebElement getadminimg()
	{
		return adminimg;
	}
	
	public WebElement getsout()
	{
		return sout;
	}
	
	public void signout(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(adminimg).perform();
		sout.click();
	}

	public WebElement getleadslink() {
		// TODO Auto-generated method stub
		return leadslink;
	}
}
