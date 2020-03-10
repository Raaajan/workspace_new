package lb;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.Windows;

public class Scroll {

	public static void main(String[] args) 
	{
		//WebDriver driver= new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver latest\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement e = driver.findElement(By.xpath(".//*[@id='homefeatured']/li[5]/div/div[2]/h5/a"));
		//js.executeScript("arguments[0].scrollIntoView(true)", e);
		
		//js.executeScript("document.body.style.zoom='40%'");
		
		/*
		WebElement a = driver.findElement(By.xpath("//*[contains(text(),'Automation Practice Website')]"));
		
		Actions action = new Actions(driver).doubleClick(a);
		action.build().perform();
		*/
		
		
	/*	try {
			for(int i=0;i<=5;i++)
			{
				driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);
				
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}*/
		
	/*	for(int i=0;i<=4;i++)
		{
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);
		}*/
		
		//driver.close();
		
		
		
	System.out.println("end");	
	}

}
