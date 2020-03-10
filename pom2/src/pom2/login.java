package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.tours;
import screenshot.Screenshotjar;

public class login
{
  @Test
  public void Newtours() 
  {
	  WebDriver wd= new FirefoxDriver();
	  wd.get("http://newtours.demoaut.com/mercurywelcome.php");
	  Screenshotjar.screen(wd, "newtourbrowser");
	  tours.username(wd).sendKeys("123");
	  tours.password(wd).sendKeys("123");
	  Screenshotjar.screen(wd, "credential entered");
	  tours.login(wd).click();
	  tours.logout(wd).click();
	  tours.homelink(wd).click();
	  wd.close();
	  System.out.println("completed");
  
  }
}
