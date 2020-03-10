package Maven.CompanyName.ProjectName.ModuleName.AutomationPractice.TestScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Maven.CompanyName.ProjectName.ModuleName.AutomationPractice.ExcelReader.Excel_Reader;
import Maven.CompanyName.ProjectName.ModuleName.AutomationPractice.PageLibrary.SignIn;
import Maven.CompanyName.ProjectName.ModuleName.AutomationPractice.TestBase.Testbase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.testng.SkipException;


public class TestLoginThroughDataProvider extends Testbase{
	SignIn signIn;

	
	@BeforeClass
	public void setUP() throws IOException{
		initialisation();
	}
	
	public Object[][] getData(String ExcelName, String testcase) {
		Excel_Reader Data = new Excel_Reader(System.getProperty("user.dir") + "\\src/test/java\\ConfigFile\\"+ExcelName);
		int rowNum = Data.getRowCount(testcase);
		System.out.println(rowNum);
		int colNum = Data.getColumnCount(testcase);
		Object sampleData[][] = new Object[rowNum - 1][colNum];
		for (int i = 2; i <=rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				sampleData[i - 2][j] = Data.getCellData(testcase, j, i);
			}
		}
		return sampleData;
	}
	
	@DataProvider
	public Object[][] loginData(){
		Object[][] data = getData("logincredential.xlsx", "Login");
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void TestLoginWithDataProvider(String TestCaseName, String Email, String Password,String runMode) throws InterruptedException{
       
		if(runMode.equals("N")){
			throw new SkipException("Skipping the test");
		}
		signIn = new SignIn(driver);
		signIn.loginToApplication(Email, Password);
		
		
	}
	
	@AfterTest
	public void closebrowser()
	{
		closebrowser();
	}

}