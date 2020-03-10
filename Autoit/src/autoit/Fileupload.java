package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("http://toolsqa.com/automation-practice-form/");
		wd.findElement(By.name("photo")).click();
		Runtime.getRuntime().exec("E:\\automation\\Autoit\\Workspace\\fileupload.exe");
		Thread.sleep(4000);
		wd.close();
		

	}

}
