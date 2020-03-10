package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Screenshot {
  @Test
  public void sc() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver latest\\chromedriver.exe" );
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://automationpractice.com/index.php");
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.name("email")).sendKeys("dubeyrajan9154@gmail.com");
	  driver.findElement(By.name("passwd")).sendKeys("RAJAN@123");
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File sou= ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(sou, new File("E:\\automation\\screenshot\\login.png"));
	  
	  driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
	  driver.findElement(By.linkText("Sign out")).click();
	  driver.findElement(By.linkText("Contact us")).click();
	  Thread.sleep(5000);
	  TakesScreenshot ts1= (TakesScreenshot)driver;
	  File sou1= ts1.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(sou1, new File("E:\\automation\\screenshot\\contact.png"));
	  
	  driver.close();
  }


}

