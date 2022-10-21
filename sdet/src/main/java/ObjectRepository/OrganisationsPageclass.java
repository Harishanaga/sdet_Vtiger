package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationsPageclass 
{


@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement creorg;

public OrganisationsPageclass(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
}
public WebElement getcreorg()
{
	return creorg;
}

}
