package practice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe" );
		
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.guru99.com/");
		
		WebElement we= wd.findElement(By.xpath("//*[text()='Learn Selenium']"));
		
		
		//--------------------Implicitly wait------------------------------
		//wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		//----------- Explicit Wait--------------------------
		
		/*WebDriverWait wait =new WebDriverWait(wd, 20);
		wait.until(ExpectedConditions.elementToBeClickable(we)); */
		
		//------------------ Fluent wait------------------------
		
		/*FluentWait wait = new FluentWait(wd);
		wait.withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		*/
		
		
		we.click();
		
		System.out.println("complete");
	}

}
