package d;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		 
		  driver.get("http://automationpractice.com/index.php");
		//  System.out.println("main page title= "+driver.getTitle());
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  FileInputStream fi=new FileInputStream("E:\\automation\\Book1.xlsx");
		  try {
			XSSFWorkbook w = new XSSFWorkbook(fi);
			XSSFSheet s=w.getSheetAt(0);
			int count=s.getLastRowNum();
			System.out.println("total no of rows= "+(count+1));
			for(int i=0;i<=count;i++)
			{
			String un=s.getRow(i).getCell(0).toString();
			String pw=s.getRow(i).getCell(1).toString();
			System.out.println("username= "+un);
			System.out.println("password= "+pw);
			
			
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
		  ;
	}
		  }
	catch (Exception e) 
	  {
		System.out.println("exception is "+ e);
	}
	  
driver.close();
}
}
