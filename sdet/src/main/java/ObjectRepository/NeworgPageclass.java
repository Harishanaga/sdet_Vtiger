package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NeworgPageclass {
	@FindAll({@FindBy(name="accountname"),@FindBy(xpath="//input[@class='detailedViewTextBox']")})
	private WebElement orgnameTF;
	
	@FindBys({@FindBy(name="button"),@FindBy(xpath="//input[@class='crmbutton small save']")})
	private WebElement savebtn;
	
	@FindBy(name="industry")
	private WebElement indDD;
	
	@FindBy(xpath="//option[@value='Chemicals']")
	private WebElement option;
	
	
	public NeworgPageclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getorgnameTF()
	{
		return orgnameTF;
		
	}
	
	public WebElement getsavebtn()
	{
		return savebtn;
	}
	
	public WebElement getindDD()
	{
		return indDD;
	}
	
	public WebElement getoption()
	{
		return option;
	}
	
	public void orgTF(String OrgText)
	{
		orgnameTF.sendKeys(OrgText);
	}
	
	public void Sbutton()
	{
		savebtn.click();
	}
	
	public void industryDD(String IndText)
	{
		Select select=new Select(indDD);
		select.selectByValue(IndText);
		
	}
}
