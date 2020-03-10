package autopractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Writeexcel 
{
	WebDriver driver;
	XSSFWorkbook w;
	XSSFSheet s;
  @Test(dataProvider="data")
  public void login(String un,String pw) throws IOException
  {
	  System.out.println("username=  "+un);
	  System.out.println("password=  "+pw);
	  FileOutputStream fo=new FileOutputStream("E:\\automation\\Book1.xlsx");
	  
	  int rows=s.getLastRowNum();
		rows=rows+1;
	  for(int i=0;i<rows;i++)
	  {
	  s.createRow(i).createCell(2).setCellValue("done");
	  w.write(fo);
	  }
  }
  

  @DataProvider(name="data")
 
  public Object[][] data() throws IOException
  {
	  
	  FileInputStream fi=new FileInputStream("E:\\automation\\Book1.xlsx");
	  
		XSSFWorkbook w= new XSSFWorkbook(fi);
		
		XSSFSheet s=w.getSheetAt(0);
		
		int rows=s.getLastRowNum();
		rows=rows+1;
		System.out.println("total rows= "+(rows));
	
		
	  
	  Object data[][]=new Object[rows][2];
	  for(int i=0;i<rows;i++)
	  {
	  data[i][0]=s.getRow(i).getCell(0).toString();
	  data[i][1]=s.getRow(i).getCell(1).toString();
	  
	  }
	  return data; 
  }

  


	  
  @BeforeTest
  public void beforetest()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
  }


@AfterTest
public void aftertest()
{
	driver.close();
	System.out.println("done");
}

}