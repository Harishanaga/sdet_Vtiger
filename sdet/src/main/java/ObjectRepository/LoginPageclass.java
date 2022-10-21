package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageclass 
{
	WebDriver driver;

	@FindBy(name = "user_name")
	private WebElement uName;

	@FindBy(name = "user_password")
	private WebElement pswd;

	@FindBy(id = "submitButton")
	private WebElement sButton;

	public LoginPageclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getuNameTF()
	{
		return uName;
	}

	public WebElement getpswdTF()
	{
		return pswd;

	}

	public WebElement getsButton()
	{
		return sButton;
	}

	public void login(String usernametext,String Passwordtext)
	{
		uName.sendKeys(usernametext);
		pswd.sendKeys(Passwordtext);
		sButton.click();
	}
}
