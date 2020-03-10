package ng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
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
	  WebElement username=wd.findElement(By.xpath("//input[@name='userName']"));
	  WebElement password=wd.findElement(By.xpath("//input[@name='password']"));
	  username.sendKeys(name);
	  password.sendKeys(pass);
	  Reporter.log("data entered");
  }

  @DataProvider
  public Object[][] credentials() 
  {
    return new Object[][] 
    		{
      new Object[] { "123", "123" },
      new Object[] { "squad", "12" },
      
      
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("Driver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe" );
	 wd=new ChromeDriver(); 
	 wd.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("execution done");
  }

}
