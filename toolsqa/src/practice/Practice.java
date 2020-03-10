package practice;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		Actions a = new Actions(wd);
		wd.get("http://automationpractice.com/index.php?");
		WebElement l=wd.findElement(By.xpath("//input[@id='search_query_top']"));
		l.sendKeys("tops");
		//a.doubleClick(l).build().perform(); 
		/*wd.findElement(By.xpath("//button[@name='submit_search']")).click();
		wd.navigate().back();
		String z=wd.findElement(By.xpath("//a[@title='My orders']")).getAttribute("title");
		System.out.println(z);
		Thread.sleep(5000);*/
		((JavascriptExecutor)wd).executeAsyncScript("scroll(0,9000)");
		/*WebElement e=wd.findElement(By.xpath("//div[@id='cmsinfo_block']/div[2]/h3"));
		String y= e.getText();
		System.out.println(y);
		a.doubleClick(e).build().perform();
		//a.moveByOffset(0, 0).build().perform();
		Thread.sleep(1000); */
		
		String w=wd.getPageSource();
		Thread.sleep(7000);
		System.out.println(w);
		System.out.println("done");
		
		
		wd.close();
		
		
		
		
	}
}	
		
	


