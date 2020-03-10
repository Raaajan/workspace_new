package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Register 
{
	public static WebDriver wd;
	
	@FindBy(how=How.ID,using="email")
	public static WebElement user;
	
	@FindBy(how=How.NAME,using="passwd")
	public static WebElement pass;
	
	@FindBy(how=How.ID,using="SubmitLogin")
	public static WebElement login;
	
	
}
