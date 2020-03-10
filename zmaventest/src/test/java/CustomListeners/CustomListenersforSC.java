package CustomListeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Testbase.Testbase;

public class CustomListenersforSC extends Testbase implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		  if (!result.isSuccess()) {
			   String userDirector = System.getProperty("user.dir");
			   String customeLocation = "//src//test//java//com//companyname//projectname//screenshots//";
			   String failureImageFileName = userDirector+customeLocation+new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())+"-"+result.getMethod().getMethodName()+ ".png";
			   File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			   try {
			    FileUtils.copyFile(scrFile, new File(failureImageFileName));
			   } catch (IOException e) {
			    e.printStackTrace();
			   }
			   //String userDirector = System.getProperty("user.dir") + "/";
			   Reporter.log("<a href=\"" + failureImageFileName + "\"><img src=\"file:///" + failureImageFileName +"\" alt=\"\"" + "height='100' width='100'/> " + "<br />");
			   //Reporter.log("<a href=\""+ failureImageFileName + "\">");
			   Reporter.setCurrentTestResult(null);
			   Reporter.log(result.getName()+ "--Test method failed\n");
		  }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
