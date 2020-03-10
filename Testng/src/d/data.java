package d;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data 
{
	
	@DataProvider
	
	  public static Object[][] dp() 
	  {
	    return new Object[][] 
	    		{
	    	
	      new Object[] {"skirt"},
	      new Object[] {"pants"},
	    };
	  }
}