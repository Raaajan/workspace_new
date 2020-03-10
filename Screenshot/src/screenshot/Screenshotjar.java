package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotjar 
{	
	
	public static void screen(WebDriver driver,String screenname)
	{
		try{
			
	TakesScreenshot ts=(TakesScreenshot)driver;	
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("E:\\automation\\screenshot\\"+screenname+".png"));
	
		} 
		catch (Exception e) 
		{
		System.out.println("exception while taking screenshot "+e.getMessage());
	}
}
}