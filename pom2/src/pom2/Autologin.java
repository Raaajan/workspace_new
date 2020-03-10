package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import POM.Home;
import POM.Register;

public class Autologin {

	public static void main(String[] args) throws InterruptedException
	{ 
	WebDriver wd= new FirefoxDriver();
	wd.get("http://automationpractice.com/index.php");
	Home ho=PageFactory.initElements(wd, Home.class);
	Register re=PageFactory.initElements(wd, Register.class);
	
	ho.signin.click();
	re.user.sendKeys("dubeyrajan9154@gmail.com");
	re.pass.sendKeys("RAJAN@123");
	re.login.click();
	Thread.sleep(1000);
	ho.logout.click();
	Thread.sleep(1000);
	wd.close();
	System.out.println("completed");
		
	}

}
