package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver wd= new FirefoxDriver();
	wd.get("http://newtours.demoaut.com/mercurywelcome.php");
	
	tours.username(wd).sendKeys("123");
	tours.password(wd).sendKeys("123");
	tours.login(wd).click();
	Thread.sleep(1000);
	tours.logout(wd).click();
	tours.homelink(wd).click();
	System.out.println("complted");
	wd.close();
	
	}

}
