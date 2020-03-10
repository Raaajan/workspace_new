package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;


public class backgroundcolor {

	private static final Predicate<WebDriver> ExpectedConditions = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		/*String url="http://store.demoqa.com/";
		wd.get(url);
		String title= wd.getTitle();
		int tl=title.length();
		System.out.println("title="+title+" "+"length="+tl);
		String currurl=wd.getCurrentUrl();
		System.out.println("currurl"+currurl);
		if(currurl.equals(url))
		{
			System.out.println("url matched");
		}
		else
		{
			System.out.println("url not matched");
			System.out.println("actul url"+url);
			System.out.println("current url"+currurl);
		}
		
		String sc= wd.getPageSource();
		int scl= sc.length();
		System.out.println("source code"+sc);
		System.out.println("source code length"+scl);
		*/
		wd.get("http://toolsqa.com/selenium-tutorial/");
		
	
		
		WebElement elem=wd.findElement(By.cssSelector("div[class='widget-title']"));
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)wd;
		
		js.executeScript("scroll(0,200)");
		
	
		for(int i=0;i<=5;i++)
		{
			
			Thread.sleep(5000);
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:solid 5px red;');",elem);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style','background:white;border:solid 5px red;');",elem);
		}


	}

}
