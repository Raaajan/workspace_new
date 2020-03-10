package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tours 
{
 public static WebElement we;
 
 public static WebElement username(WebDriver wd)
 {
	we= wd.findElement(By.name("userName"));
	return we;
 }
 
 public static WebElement password(WebDriver wd)
 {
	 we=wd.findElement(By.name("password"));
	 return we;
 }
	
 public static WebElement login(WebDriver wd)
 {
	 we=wd.findElement(By.name("login"));
	 return we;
 }
 
 public static WebElement logout(WebDriver wd)
{
	 we=wd.findElement(By.linkText("SIGN-OFF"));
	 return we;

}
 
 public static WebElement  homelink(WebDriver wd)
 
 {
	 we=wd.findElement(By.linkText("Home"));
	 return we;
 }



}
