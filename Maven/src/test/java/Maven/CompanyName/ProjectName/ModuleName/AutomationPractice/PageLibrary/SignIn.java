package Maven.CompanyName.ProjectName.ModuleName.AutomationPractice.PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	WebDriver driver;

	By signinlink = By.linkText("Sign in");
	By emailforsignin = By.xpath("//input[@id='email']");
	By passwordforsignin = By.id("passwd");
	By signinbutton = By.name("SubmitLogin");
	By logoutlink = By.linkText("Sign out");

	public SignIn(WebDriver driver) {
		this.driver = driver;
	}

	public void signinlink() {
		driver.findElement(signinlink).click();
	}

	public void enteremail(String emailadd) {
		driver.findElement(emailforsignin).sendKeys(emailadd);
	}

	public void enterpassword(String pass) {
		driver.findElement(passwordforsignin).sendKeys(pass);
	}

	public void clicksubmit() {
		driver.findElement(signinbutton).click();
	}

	public void clicklogout() {
		driver.findElement(logoutlink).click();
	}

	public void loginToApplication(String email, String password) {
		signinlink();
		enteremail(email);
		enterpassword(password);
		clicksubmit();
		clicklogout();

	}

}
