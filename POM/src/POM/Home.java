package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home 
{
	public static WebDriver wd;
	
	
	
	@FindBy(how=How.LINK_TEXT,using="Sign in")
	public static WebElement signin;
	
	@FindBy(how=How.LINK_TEXT,using="Sign out")
	public static WebElement logout;
	
}
