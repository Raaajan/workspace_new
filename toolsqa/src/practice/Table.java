package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table {

	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
	String url="http://toolsqa.com/automation-practice-table/";
		wd.get(url);
		
		
		WebElement a= wd.findElement(By.xpath("//div[@id='content']/table/tbody/tr[1]/td[2]"));
		String dubai= a.getText();
		System.out.println(dubai);

		WebElement d= wd.findElement(By.xpath("//div[@id='content']/table/tbody/tr[2]/th"));
		String z= d.getText();
		System.out.println(z);
		if(z.equalsIgnoreCase("Clock Tower Hotel"))
		{
			List<WebElement> li= wd.findElements(By.xpath("//div[@id='content']/table/tbody/tr[2]/td"));
			System.out.println(li.size());
			for(int i=1;i<=li.size();i++)
			{
			String y= wd.findElement(By.xpath("//div[@id='content']/table/tbody/tr[2]/td["+i+"]")).getText();
			System.out.println(y);
			}
		}
		else
		{
			System.out.println("string not equals");
		}
			
			//wd.close();
	}

}
