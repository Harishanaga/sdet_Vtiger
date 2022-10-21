package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewLeadsPageclass 
{
	@FindBy(name="salutationtype")
	private WebElement fNameDD;
	
	@FindBy(name="firstname")
	private WebElement fNameTF;
	
	@FindBy(name="lastname")
	private WebElement lNameTF;
	
	@FindBy(name="company")
	private WebElement CName;
	
	@FindBy(name="leadsource")
	private WebElement LeadDD;
	
	@FindBy(name="industry")
	private WebElement indDD;
	
	@FindBys({@FindBy(name="button"),@FindBy(xpath="//input[@class='crmbutton small save']")})
	private WebElement savebtn;
	
	public NewLeadsPageclass(WebDriver driver)
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
	
	public WebElement getCName()
	{
		return CName;
	}
	
	public WebElement getLeadDD()
	{
		return LeadDD;
	}
	
	public WebElement getindDD()
	{
		return indDD;
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
	
	public void ComName(String CoName)
	{
		CName.sendKeys(CoName);
	}
	
	public void Leaddd(String lText)
	{
		Select select=new Select(LeadDD);
		select.selectByVisibleText(lText);
	}
	
	public void industryDD(String IndText)
	{
		Select select=new Select(indDD);
		select.selectByVisibleText(IndText);
	}
	
	public void Sbutton()
	{
		savebtn.click();
	}
	
	
}

