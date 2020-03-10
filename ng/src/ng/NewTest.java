package ng;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest 
{ 
WebDriver wd;

  @Test(dataProvider = "dp")
  public void one(String a)
  {
	  wd.findElement(By.id("search_query_top")).clear();
	  wd.findElement(By.id("search_query_top")).sendKeys(a);
	  System.out.println(a);
  }

  @Test(dataProvider = "dp")
  public void two(String b)
  {
	  wd.findElement(By.id("search_query_top")).clear();
	  wd.findElement(By.id("search_query_top")).sendKeys(b);
	  System.out.println(b);
	  
  }
  
  @DataProvider 
  
  public Object[][] dp(Method m) 
  { 	
	  if(m.getName().equalsIgnoreCase("one"))
	  {
    return new Object[][] {
      new Object[] {"tops" },
      new Object[] { "Blouse" },};
    }
	  
    else
    {
    	return new Object[][] {
    	      new Object[] { "pants" },
    	      new Object[] { "skirt" },};
    }
    
  }
  @BeforeTest
  public void beforeClass() 
  {
	  
	  wd=new FirefoxDriver();
	  wd.get("http://automationpractice.com/index.php?");
  }

  @AfterTest
  public void afterClass() throws InterruptedException 
  {
	  System.out.println("Completed");
	  Thread.sleep(3000);
	  
	  wd.close();
  }

}
