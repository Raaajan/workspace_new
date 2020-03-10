package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver wd= new FirefoxDriver();
		wd.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
		 
		WebElement from= wd.findElement(By.xpath("html/body/div[1]/div/div[3]/div[2]/div/div/div[1]/div/div[1]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		WebElement to= wd.findElement(By.xpath("html/body/div[1]/div/div[3]/div[2]/div/div/div[1]/div/div[2]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		Actions a= new Actions(wd);
		a.dragAndDrop(from, to).build().perform();
	
	}

}
