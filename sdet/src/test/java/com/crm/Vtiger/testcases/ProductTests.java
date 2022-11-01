package com.crm.Vtiger.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys("hello1");
		WebElement option1 = driver.findElement(By.xpath("//input[@value='U']"));
	
		WebElement option2 = driver.findElement(By.xpath("//input[@value='T']"));
		
		   option2.click();
		
		
		if(option1.isSelected())
		{
		option1.click();
		WebElement userDD = driver.findElement(By.name("assigned_user_id"));
		Select select1=new Select(userDD);
		select1.selectByVisibleText("assigned_user_id");
		}
		else if(option2.isSelected())
		{
			option2.click();
			WebElement groupDD = driver.findElement(By.name("assigned_group_id"));
			Select select2=new Select(groupDD);
			select2.selectByVisibleText("Marketing Group");
		}
		else
		{
			System.out.println();
		}
		driver.findElement(By.name("button")).click();
		WebElement signout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions action1=new Actions(driver);
		action1.moveToElement(signout).click().perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
		driver.close();
		driver.quit();
	}

}
