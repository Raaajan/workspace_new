package autopractice;

import org.testng.annotations.Test;

import poi.Fileinput;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Readdata 
{
	WebDriver driver;
	
  @Test(dataProvider="data")
  public void Login(String un,String pw) throws InterruptedException 
  {
	 
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(pw);
	
		  driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
		 
		  Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
		System.out.println("title matched");
		driver.findElement(By.linkText("Sign out")).click();
	  
  }
  
  @DataProvider(name="data")
  public Object[][] data( )
  {
	  Fileinput f= new Fileinput("E:\\automation\\Book1.xlsx");
	  int count=f.Count(0);
	  System.out.println("total rows= "+ (count+1));
	  Object[][] data=new Object[(count+1)][2];
	  		
	  for(int i=0;i<=count;i++) 
	  {
	  		data[i][0]=f.getdata(0, i, 0);
	  		
	  		data[i][1]=f.getdata(0, i, 1);
			
	  }	
			return data;
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
	 driver.close();
  }

}
