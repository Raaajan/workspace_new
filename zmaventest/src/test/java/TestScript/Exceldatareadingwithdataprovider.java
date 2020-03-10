package TestScript;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelReader.Excelread;
import PageLibrary.SignIn;
import Testbase.Testbase;

public class Exceldatareadingwithdataprovider extends Testbase {

	SignIn sign;

	@BeforeTest
	public void setup() throws IOException {
		initialisation();
	}

	@DataProvider(name="Logindata")
	public Object[][] Logindata()
	{
		Object[][] data=getdata("LoginCredential.xlsx","Login"); // excelname and sheetname pass as parameter
		return data;
	}
	
	
	public Object[][] getdata(String Excelname,String sheetname)
	{
		Excelread read=new Excelread("user.dir"+"\\src/test/java\\ConfigFile\\"+Excelname);
		int rowcount=read.countrow(sheetname);
		int columncount=read.countcolumn(sheetname);
		Object exceldata[][]=new Object [rowcount+1][columncount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
				exceldata [i-1][j]=read.getcelldata(sheetname, i,j);
						
						
			}
		}
		return exceldata;
	}
	
	@Test(dataProvider="Logindata")
	public void testlogindata(String TestCaseName, String Email,String Password,String runMode) 
	{
		if(runMode.equalsIgnoreCase("N"))
		{
			throw new SkipException("runMode=N,TC skipped");
		}
		sign = new SignIn(driver);
		sign.signinlink();
		sign.enteremail(Email);
		sign.enterpassword(Password);
		sign.clicksubmit();
		sign.clicklogout();
	}

	@AfterTest
	public void teardown() {
		closebrowser();

	}

}
