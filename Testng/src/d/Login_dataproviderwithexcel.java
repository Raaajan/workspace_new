package d;

import org.testng.annotations.Test;

import poi.Fileinput;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

public class Login_dataproviderwithexcel 
{
	
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void Login(String TestCaseName, String Email,String Password,String runMode) 
  {
	 /* PageLibrary_Signin_autoprac signin= new PageLibrary_Signin_autoprac(driver);
	  if(runMode.equalsIgnoreCase("N"))
		{
			throw new SkipException("runMode=N,TC skipped");
		}
	  signin.signinlink();
	  signin.enteremail(Email);
	  signin.enterpassword(Password);
	  signin.clicksubmit();
	  signin.clicklogout();*/

 // System.out.println(TestCaseName+" "+Email+" "+Password+" "+runMode);
  
  }

  @DataProvider
  public Object[][] dp() {
    
	  
	  	Fileinput file=new Fileinput("E:\\automation\\LoginCredentials.xlsx");
		int rowcount=file.Countrows(0);
		rowcount=rowcount+1;
		System.out.println("rows= "+rowcount);
		int columncount=file.Countcolumn(0);
		System.out.println("columns= "+columncount);
		
		Object data[][]=new Object[rowcount][columncount];
		for(int i=0;i<rowcount;i++)                                  
		{
			for(int j=0;j<columncount;j++)
			{
				data[i][j]=file.getdata(0, i, j);
			}
		}
		
		return data;
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {		
	 // System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		/*WebDriver driver= new FirefoxDriver();
	  driver.get("http://automationpractice.com/index.php");*/
	  
	  System.out.println("execution started");

  }

  @AfterTest
  public void afterTest() 
  {
	  
	  System.out.println("execution completed");
	  //driver.close();
  }

}
