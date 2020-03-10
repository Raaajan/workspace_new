package screenshot;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen 
{
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver latest\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("http://automationpractice.com/index.php");
		  driver.findElement(By.linkText("Sign in")).click();
		  driver.findElement(By.name("email")).sendKeys("dubeyrajan9154@gmail.com");
		  Screenshotjar.screen(driver, "emailentered");
		  driver.findElement(By.name("passwd")).sendKeys("RAJAN@123");
		  Screenshotjar.screen(driver, "passwordentered");
		  driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
		  Screenshotjar.screen(driver, "Signin");
		  driver.findElement(By.linkText("Sign out")).click();
		  Screenshotjar.screen(driver, "Logout");
		 
		  Thread.sleep(5000);
		
		  
		  driver.close();
	}
		  
}



