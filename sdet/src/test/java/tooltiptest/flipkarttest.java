package tooltiptest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.className("_3704LK")).sendKeys("iphone");
		
		driver.findElement(By.className("L0Z3Pu")).click();
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='V3C5bO']")).click();
		
		
	}

}
