package customlisteners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Testbase.Testbase;


public class Screenshot extends Testbase implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 if (!result.isSuccess()) {
			   String userDirector = System.getProperty("user.dir");
			   String customeLocation = "\\src\\test\\java\\Screenshots\\";
			   String failureImageFileName = userDirector+customeLocation+new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())+"-"+result.getMethod().getMethodName()+ ".png";
			   File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			   try {
			    FileUtils.copyFile(scrFile, new File(failureImageFileName));
			   } catch (IOException e) {
			    e.printStackTrace();
			   }
			   //String userDirector = System.getProperty("user.dir") + "/";
			   Reporter.log("<a href=\"" + failureImageFileName + "\"><img src=\"file:///" + failureImageFileName +"\" alt=\"\"" + "height='100' width='100'/> " + "<br />");
	}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		if(result.isSuccess())
		{
		Calendar calender = Calendar.getInstance();
		Date time = calender.getTime();
		SimpleDateFormat format= new SimpleDateFormat("dd_MM_yyyy_hh_mm");
		
			TakesScreenshot TSC= (TakesScreenshot)driver;
			File sourcefile = TSC.getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(sourcefile,new File("E:\\automation\\SC\\sc_2"+"_"+format.format(time)+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
