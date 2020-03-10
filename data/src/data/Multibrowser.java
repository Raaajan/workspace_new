package data;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Multibrowser 
{
	WebDriver wd;
	
  @Test
  public void f() 
  {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement username=wd.findElement(By.xpath("//input[@name='userName']"));
		  WebElement password=wd.findElement(By.xpath("//input[@name='password']"));
		  username.clear();
		  username.sendKeys("123");
		  password.clear();
		  password.sendKeys("123");
		  Reporter.log("data entered");
		  wd.findElement(By.xpath("//input[@name='login']")).click();
		  wd.findElement(By.linkText("SIGN-OFF")).click();
		  wd.findElement(By.linkText("Home")).click();
	  
  }
  
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) 
  {
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  wd=new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		  wd=new ChromeDriver();
		  
	  }
	  wd.get("http://newtours.demoaut.com/");
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("done");
	  wd.close();
  }

}





