package practice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
	
		wd.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	String mw= wd.getWindowHandle();
		System.out.println("main window="+" "+mw);
		WebElement we= wd.findElement(By.xpath("//*[text()='New Message Window']"));
		we.click();
		Set<String> allwin=wd.getWindowHandles();
		System.out.println("all window="+" "+allwin);
		for(String z:allwin)
		{
			if(z.equals(mw))
			{
				System.out.println("main window");
			}
			else
			{
				wd.switchTo().window(z);
				System.out.println("child window");
				
			}
		}
		
		wd.manage().window().maximize();
		wd.close();
		wd.switchTo().window(mw);


 		Thread.sleep(3000);
 		
 		wd.navigate().refresh();
 		//Actions a= new Actions (wd);
 		//a.sendKeys(Keys.F5);
 		
		WebDriverWait wait = new WebDriverWait(wd, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Alert Box']")));
		
		
		wd.findElement(By.id("alert")).click();
		
		Alert al = wd.switchTo().alert();
		String s=al.getText();
		System.out.println(s);
		al.accept();
		
		


System.out.println("complete");
		
	wd.close();	
		

	}

}
