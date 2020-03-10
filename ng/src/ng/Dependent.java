package ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependent {
  @Test (dependsOnMethods="browser")
  public void login() 
  {
	  System.out.println("log in");
	  Reporter.log("login successfull");
  }
  
  @Test(dependsOnMethods="action")
  public  void logout()
  {
	  System.out.println("log out");
	  Reporter.log("logout successfull");
  }
  
  @Test(dependsOnMethods="login")
  public void action()
  
  {
	System.out.println("some action performed");  
  }
  
  @Test
  public void browser()
  {
	  System.out.println("browser opened");
  }
}
