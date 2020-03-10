package screenshot;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Failscreen 
{
	 WebDriver driver;
	@Test
  public void Login() throws InterruptedException 
  {
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("8766879809");
	  
	  driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("vbdtrd");
	  
	  driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	  
	  Thread.sleep(2000);
  }
	@Test
	public void Logout()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='u_0_a']/div[1]/div[1]/div/a")));
		 
		element.click();
		
		driver.findElement(By.xpath(".//*[@id='js_u']/div/div/div[1]/div[1]/h1/a/span")).click();
				
	}
	
  @AfterMethod
  public void afterMethod(ITestResult result) 
  {
	  if(ITestResult.FAILURE==result.getStatus())
	  {
		  Screenshotjar.screen(driver, result.getName());
	  }
	  
  }  
	  
	  @AfterTest
	  public void close()
	  {
		  driver.close();
		  System.out.println("executed");
	  }
	  
	
	  
  }


