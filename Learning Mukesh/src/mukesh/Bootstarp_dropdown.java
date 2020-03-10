package mukesh;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class Bootstarp_dropdown {
	WebDriver driver;

	@Test
	public void dropdown() throws InterruptedException {
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("menu1")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu test' and @aria-labelledby='menu1']/li//child::a"));
		int size=list.size();
		System.out.println(size);
		
		
		
		Iterator<WebElement> itr = list.iterator();
		while (itr.hasNext()) {
			WebElement e = itr.next();
			String h = e.getAttribute("innerHTML");
			System.out.println(h);
		}

	}

	@AfterClass
	public void afterClass() {
		System.out.println();
		System.out.println("---------execution completed------------");
		driver.close();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\automation\\chromedriver\\chromedriver latest\\chromedriver.exe");
		driver = new ChromeDriver();

	}

}
