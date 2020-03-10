package data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Dataproviders 
{ WebDriver wd;
  @Test(dataProvider = "credentials")
  public void login(String name, String pass) 
  {
	  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement username=wd.findElement(By.xpath("//input[@name='userName']"));
	  WebElement password=wd.findElement(By.xpath("//input[@name='password']"));
	  username.clear();
	  username.sendKeys(name);
	  password.clear();
	  password.sendKeys(pass);
	  Reporter.log("data entered");
	  wd.findElement(By.xpath("//input[@name='login']")).click();
	  wd.findElement(By.linkText("SIGN-OFF")).click();
	  wd.findElement(By.linkText("Home")).click();
	  
  }

  @DataProvider
  public Object[][] credentials() 
  {
    return new Object[][] 
    		{
      new Object[] { "123", "123" },
      new Object[] { "squad", "12" },
      new Object[] { "1234", "1234" },
      
      
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe" );
	 wd=new ChromeDriver(); 
	 wd.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("execution done");
  }

}
