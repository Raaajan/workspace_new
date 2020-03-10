package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		 driver= new FirefoxDriver();
		  driver.get("http://automationpractice.com/index.php");
		  System.out.println("execution started");
		
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dubeyrajan9154@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("RAJAN@123");
		driver.findElement(By.name("SubmitLogin")).click();
		driver.findElement(By.linkText("Sign out")).click();
		
	}

}
