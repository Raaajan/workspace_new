package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Combine
{
public static WebDriver wd;
	
   	@FindBy(how=How.LINK_TEXT,using="Sign in")
   	public static WebElement signin;

	@FindBy(how=How.ID,using="email")
	public static WebElement user;
	
	@FindBy(how=How.NAME,using="passwd")
	public static WebElement pass;
	
	@FindBy(how=How.ID,using="SubmitLogin")
	public static WebElement login;
	
	
	@FindBy(how=How.LINK_TEXT,using="Sign out")
	public static WebElement logout;
	
	
	public void Action(String name, String password)
	{
		user.sendKeys(name);
		pass.sendKeys(password);
		login.click();
		
	}

}
