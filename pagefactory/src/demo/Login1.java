package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
// page factory 
public class Login1
{
	public static WebDriver wd;
	
	@FindBy(how=How.NAME,using="userName")
	public static WebElement username;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	public static WebElement password;
	
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement login;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	public static WebElement logout;

	public static void main( String args[])
	{
		WebDriver wd= new FirefoxDriver();
		wd.get("http://newtours.demoaut.com/mercurywelcome.php");
		//Initialize page factory
		
		PageFactory.initElements(wd, Login1.class);
		username.sendKeys("123");
		password.sendKeys("123");
		login.click();
		logout.click();
		
		System.out.println("completed");
		
		
	}
	 
}	