package tooltiptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lenskarthashovertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
		String str=driver.findElement(By.xpath("//a[text()='Do More, Be More']")).getAttribute("title");
	System.out.println(str);
	}

}
