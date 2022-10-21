package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPageclass 
{
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement contbtn;
	
	public ContactsPageclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getcontbtn()
	{
		return contbtn;
	}
	
	public void contactbtn()
	{
		contbtn.click();
	}
}
