package data;


import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ISuiteListener,IInvokedMethodListener,ITestListener
{


	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
	//	System.out.println("after method listeners");
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	
		//System.out.println("before method listeners");
	}

	@Override
	public void onFinish(ISuite arg0) {
		System.out.println("onfinish suite listener");
		
	}

	@Override
	public void onStart(ISuite arg0) {
		System.out.println("onstart suite listener");
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("onfinish test listener");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
	System.out.println("onstart test listener");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("on test start listener");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
	System.out.println("on test success listener");
		
	}

 
}
