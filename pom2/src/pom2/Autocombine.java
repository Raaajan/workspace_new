package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import POM.Combine;


public class Autocombine {

	public static void main(String[] args)
	{
		WebDriver wd= new FirefoxDriver();
		wd.get("http://automationpractice.com/index.php");
		
		Combine c= PageFactory.initElements(wd, Combine.class);
		
		c.signin.click();
		c.Action("dubeyrajan9154@gmail.com", "RAJAN@123");
		c.logout.click();
		
		System.out.println("completed");
	}

}
