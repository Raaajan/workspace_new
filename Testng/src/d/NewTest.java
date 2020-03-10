package d;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest 
{ WebDriver wd;
  @Test(dataProvider = "dp",dataProviderClass=data.class)
  public void search(String search) throws InterruptedException 
  {
	  wd.findElement(By.id("search_query_top")).clear();
	  Thread.sleep(1000);
	  wd.findElement(By.id("search_query_top")).sendKeys(search);
	  Thread.sleep(1000);
	  System.out.println(search);
	  
  }

 /* @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    		{
      new Object[] {"tops"},
      new Object[] {"skirts"},
    };
  } */
  @BeforeTest
  public void beforeTest() 
  {
	  wd=new FirefoxDriver();
	  wd.get("http://automationpractice.com/index.php");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Completed");
	  
  }

}
