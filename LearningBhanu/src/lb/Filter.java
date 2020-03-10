package lb;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Filter 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver latest\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://automationpractice.com/index.php?id_category=8&controller=category#/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Select s= new Select(driver.findElement(By.id("selectProductSort")));
		s.selectByVisibleText("Price: Lowest first");
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[1]/span[1]"));
		System.out.println(li.size());
			Iterator<WebElement> itr = li.iterator();
			while(itr.hasNext())
			{
				String value = itr.next().getText();
				System.out.println(value);
			}
		
		
		
	}
	
}
