package dkb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autopracticesigninclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		 
		  driver.get("http://automationpractice.com/index.php");
		  driver.findElement(By.linkText("Sign in")).click();
		  Thread.sleep(5000);

	}

}
