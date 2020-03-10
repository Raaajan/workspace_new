package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Main 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver wd= new FirefoxDriver();
		wd.get("http://automationpractice.com/index.php");
		
		Home h=PageFactory.initElements(wd, Home.class);
		Register r=PageFactory.initElements(wd, Register.class);
		
		h.signin.click();
		r.user.sendKeys("dubeyrajan9154@gmail.com");
		r.pass.sendKeys("RAJAN@123");
		r.login.click();
		Thread.sleep(500);
		h.logout.click();
		Thread.sleep(1000);
		
		System.out.println("completed");
		wd.close();
		
		
		
	}
}
