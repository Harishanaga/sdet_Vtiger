package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewContactPageclass 
{
	@FindBy(name="salutationtype")
	private WebElement fNameDD;
	
	@FindBy(name="firstname")
	private WebElement fNameTF;
	
	@FindBy(name="lastname")
	private WebElement lNameTF;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement orgName;
	
	@FindBys({@FindBy(name="button"),@FindBy(xpath="//input[@class='crmbutton small save']")})
	private WebElement savebtn;
	
	public NewContactPageclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getfNameDD()
	{
		return fNameDD;
	}
	
	public WebElement getfNameTF()
	{
		return fNameTF;
		
	}
	public WebElement getlNameTF()
	{
		return lNameTF;
	}
	
	public WebElement getorgName()
	{
		return orgName;
	}
	
	public WebElement getsavebtn()
	{
		return savebtn;
	}
	
	public void getfNameDD(String FirstNameDD)
	{
		Select select=new Select(fNameDD);
		select.selectByVisibleText(FirstNameDD);
	}
	
	public void FirstName(String FName)
	{
		fNameTF.sendKeys(FName);
	}
	
	public void LastName(String LName)
	{
		lNameTF.sendKeys(LName);
	}
	
	public void Sbutton()
	{
		savebtn.click();
	}
	
}
