package POM_Maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends Testbase {

	SignIn sign;

	@Test
	public void testlogin() {
		sign = new SignIn(driver);
		sign.signinlink();
		sign.enteremail("dubeyrajan9154@gmail.com");
		sign.enterpassword("RAJAN@123");
		sign.clicksubmit();
		sign.clicklogout();
	}

	@BeforeTest
	public void setup() throws IOException {
		initialisation();

	}

	@AfterTest
	public void teardown() {
		closebrowser();

	}

}
