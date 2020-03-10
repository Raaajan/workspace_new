package d;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Newtours
{
	WebDriver driver;
  @Test(dataProvider="cre")
  public void login(String usr,String pwd) throws InterruptedException 
  {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  WebElement un=driver.findElement(By.xpath("//input[@name='userName']"));
	  WebElement pw=driver.findElement(By.xpath("//input[@name='password']"));
	  un.sendKeys(usr);
	  pw.sendKeys(pwd);
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  
  }
  
  @DataProvider(name="cre")
  public Object[][] credentials() 
  {
    return new Object[][] 
    		{
      new Object[] { "123", "123" },
      new Object[] { "squad", "12" },
      new Object[] { "123", "123" },
      
      
    };
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
	  
  }

}
