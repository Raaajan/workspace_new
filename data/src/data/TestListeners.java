package data;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

  
public class TestListeners {
  @Test
  public void f() 
  {
	  System.out.println("Test_ng");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before method_ng");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("after method_ng");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforetest_ng");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("aftertest_ng");
  }

}
