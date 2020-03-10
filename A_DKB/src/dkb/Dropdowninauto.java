package dkb;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowninauto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("hahssgjhdaahsdhghgg@gmail.com");
		driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();

		Thread.sleep(8000);
		Select day = new Select(driver.findElement(By.xpath(".//*[@id='days']")));
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='months']")));
		Select year = new Select(driver.findElement(By.xpath(".//*[@id='years']")));

		Scanner sc = new Scanner(System.in);

		System.out.println("enter date");
		String date = sc.nextLine();
		System.out.println("enter month");
		String mm = sc.nextLine();
		System.out.println("enter year");
		String yyyy = sc.nextLine();

		List<WebElement> listdate = driver.findElements(By.xpath(".//*[@id='days']/child::option"));
		List<WebElement> listmonth = driver.findElements(By.xpath(".//*[@id='months']/child::option"));
		List<WebElement> listyear = driver.findElements(By.xpath(".//*[@id='years']/child::option"));
		

		
		for(int i=1;i<=listdate.size();i++)
		{
			String value=driver.findElement(By.xpath(".//*[@id='days']/child::option["+i+"]")).getAttribute("value");
			System.out.println(value);
			
			if(date.equalsIgnoreCase(value))
			{
				day.selectByValue(value);
			}
		
		
		}
		
		Thread.sleep(5000);
		
		for(int i=1;i<=listmonth.size();i++)
		{
			String value=driver.findElement(By.xpath(".//*[@id='months']/child::option["+i+"]")).getAttribute("value");
			System.out.println(value);
			
			if(mm.equalsIgnoreCase(value))
			{
				month.selectByValue(value);
			}
		
		
		}
		
		Thread.sleep(5000);
		
		for(int i=1;i<=listyear.size();i++)
		{
			String value=driver.findElement(By.xpath(".//*[@id='years']/child::option["+i+"]")).getAttribute("value");
			System.out.println(value);
			
			if(yyyy.equalsIgnoreCase(value))
			{
				year.selectByValue(value);
			}
		
		
		}
		
	}
}