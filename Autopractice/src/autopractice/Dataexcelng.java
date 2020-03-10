package autopractice;

import org.testng.annotations.Test;

import poi.Fileinput;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dataexcelng 
{
	WebDriver driver;
  @Test(dataProvider="cre")
  public void Login(String un,String pw) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		  driver.get("http://automationpractice.com/index.php");
	  
	  
	  driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(pw);
	
		  driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
		  String title=driver.getTitle();
		//  System.out.println("title= "+title);
		  Thread.sleep(1000);
		  if(title.equalsIgnoreCase("My account - My Store"))
		  {
		  driver.findElement(By.linkText("Sign out")).click();
		  }
		  
		  
		  driver.close();  
	  
	  
  }

  
   
  @DataProvider(name="cre")
  public Object[][] dp() 
  {
	  Fileinput f=new Fileinput("E:\\automation\\Book1.xlsx");
	  int count=f.Count(0);
	  System.out.println("totals rows+ "+(count+1));
	  
	  Object[][] data=new Object[count][2];
    
	  for(int i=0;i<=count;i++)
	  {
	  data[i][0]=f.getdata(0, i, 0);
	  data[i][1]=f.getdata(0, i, 1);
    		
	  }
	  return data;
  }
  
}