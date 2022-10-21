package tooltiptest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICC_tabletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com");
		driver.findElement(By.xpath("//button[normalize-space()='Rankings' and @class='linked-list__dropdown-label js-dropdown-btn']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Team Rankings']")).click();
		
		
		//driver.findElement(By.xpath("//a[normalize-space(text()='Team Rankings']")).click();
		/*
		 * to fetch all the names from the list of table
		 */
		String tablelist=driver.findElement(By.xpath("//table[@class='table']/tbody")).getText();
		System.out.println(tablelist);
		
		
		/*
		 * how many matches india played
		 */
		String matcheslist = driver.findElement(By.xpath("//span[.='India']/parent::td/following-sibling::td[1]")).getText();
		System.out.println(matcheslist);
		
		/*
		 * printing complete table with rows and columns
		 */
		List<WebElement> allrows1 = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		List<WebElement> allcol1 = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		{
			for(int i=1;i<=allrows1.size();i++)
			{
			for(int j=1;j<=5;j++)
			{
				
			
					String data = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+" ");
			}
			System.out.println();
		}
	
		
		/*
		 * printing all teams
		 */
		List<WebElement> allrows2 = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		{
			for(int i=1;i<=10;i++)
			{
			
					String team = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
					System.out.println(team);
			}
		}
		
		
		
		
		}
	}
}