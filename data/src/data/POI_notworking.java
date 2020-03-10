package data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class POI_notworking
{
	WebDriver driver;
  @Test
  public void Login() throws IOException, InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe" );
		driver=new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		 
		 FileInputStream f= new FileInputStream("E:\\automation\\Book1.xlsx");
		 XSSFWorkbook w= new XSSFWorkbook(f);
		 XSSFSheet s=w.getSheetAt(0);
		 int tr= s.getLastRowNum();
		 System.out.println("total rows= "+(tr+1));
		 int tc=s.getRow(0).getLastCellNum();
		 System.out.println("total column= "+tc);
		
		
		for(int i=0;i<=tr;i++)
		 {
			try
			{
			 
			  WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
			  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			  String un=s.getRow(i).getCell(0).toString();
			String pw=s.getRow(i).getCell(1).toString();	  
					  
					  
			  username.clear();
			  username.sendKeys(un);
			  password.clear();
			  password.sendKeys(pw);
			  Reporter.log("data entered");
			  driver.findElement(By.xpath("//input[@name='login']")).click();
			  Thread.sleep(2000);
			 
			 driver.findElement(By.linkText("SIGN-OFF")).click();
			
			 // driver.findElement(By.linkText("Home")).click();
			  
			 FileOutputStream o= new FileOutputStream("E:\\automation\\Book1.xlsx");
			 s.createRow(i).createCell(2).setCellValue("pass");
			 w.write(o);
			
			
			}
			
			
			catch (Exception e)
			 {
				 System.out.println("Invalid credentials");
				 
				 s.createRow(i).createCell(2).setCellValue("fail");	 
				 FileOutputStream o= new FileOutputStream("E:\\automation\\Book1.xlsx");
				 w.write(o);
			 }
		 }
		 
		 
	  
	  
  }

  /*
  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    		{
      new Object[] { "123", "123" },
      new Object[] { "a", "b" },
    };
  }
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe" );
		 driver=new ChromeDriver(); 
		 driver.get("http://newtours.demoaut.com/");
  }
*/
  @AfterTest
  public void afterTest() 
  {
	  System.out.println("done");
	  driver.close();
  }


}
