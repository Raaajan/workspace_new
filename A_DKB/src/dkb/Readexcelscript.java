package dkb;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Readexcelscript 
{
	WebDriver driver;
	String[][] exceldata = null;
	
	static Logger log= Logger.getLogger(Readexcelscript.class.getName());
	
	
 @Test(dataProvider = "data")
  public void output(String sr,String email, String password,String runmode) throws InterruptedException
  {
  
	 // System.out.println(sr+" "+email+" "+password+" "+runmode);
	 
	 //System.out.println(email);
	 //System.out.println(password);
	 	
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.name("SubmitLogin")).click();
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		
  }

 
  public Object[][] fetchdata(String excelpath, int sheetno) throws IOException
  {
	  log.info("In fetchdata method");
	  Readexcel read= new Readexcel(excelpath);
		int rc=read.countrow(sheetno);
		System.out.println("Rows count ="+rc);
		int cc=read.countcolumn(sheetno);
		System.out.println("Column count ="+cc);
		Object [][]exceldata = new Object[rc-1][cc];
		for(int i=1;i<rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				exceldata[i-1][j]=read.datafetch(0, i, j);
			}
		}
		return exceldata;
  }
  
	  
 
  @DataProvider
  public Object[][] data() throws IOException
  {
	  log.info("In dataprovider");
	  Object[][] data=fetchdata("E:\\automation\\new.xlsx",0);
	return data;
	  
	  }
  
  
 /*@BeforeTest
 public void beforeTest() throws InterruptedException 
 {
	 	System.setProperty("webdriver.gecko.driver", "E:\\automation\\driver\\geckodriver_0.14_correct\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.get("http://automationpractice.com/index.php");
	  log.info("execution started");
	  Thread.sleep(5000);
 }*/
 
 @AfterTest
 public void aftertest()
 {
	 driver.close();
	 log.info("execution completed");
 }
  
/*  public Object[][] fetchdata(String excelpath, String sheetname) throws IOException
  {
	  Readexcel read= new Readexcel(excelpath);
		int rc=read.countrow(sheetname);
		int cc=read.countcolumn(sheetname);
		Object [][]exceldata = new Object[rc][cc];
		for(int i=0;i<rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				exceldata[i][j]=read.datafetch(0, i, j);
			}
		}
		return exceldata;
  }
  
	  
 
  @DataProvider
  public Object[][] data() throws IOException
  {
	  
	  Object[][] data=fetchdata("E:\\automation\\new.xlsx","Login");
	return data;
	  
	  }*/
  
 

 
}
