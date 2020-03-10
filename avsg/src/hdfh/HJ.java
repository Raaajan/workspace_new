package hdfh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HJ {

	WebDriver driver;

	@Test
	public void output() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dubeyrajan9154@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("RAJAN@123");
		driver.findElement(By.name("SubmitLogin")).click();
		driver.findElement(By.linkText("Sign out")).click();

	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("execution started");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dubeyrajan9154@gmail.com");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("complete");
	}

}
