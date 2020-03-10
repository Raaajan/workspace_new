package pagelibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testbase.Testbase;

public class logintoautomationpractice extends Testbase {
  
  @Test
  public void loginPass() throws InterruptedException 
  {
	 
	  driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dubeyrajan9154@gmail.com");
	  driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("RAJAN@123");
	  driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
	  driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
	  Thread.sleep(5000);
	  
  }
  @Test
  public void loginFail() 
  {
	
	  driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dubeyrajan9154@gmail.com");
	  driver.findElement(By.xpath(".//*[@id='passw']")).sendKeys("RAJAN@123");
	  driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
	  driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
	  
	  
  }

@BeforeTest
public void setup()
{
	try {
		initialisation();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}

@AfterTest
public void close()
{
	closebrowser();
}
}