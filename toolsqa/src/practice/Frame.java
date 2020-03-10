package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Frame {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
	 wd.get("http://toolsqa.com/iframe-practice-page/");
		 
		 
		 List<WebElement> li= wd.findElements(By.tagName("iframe"));
		int n=li.size();
		 System.out.println("no of frames= "+n);
		 
		 for(int i=0;i<=n;i++)
		 {
			 wd.switchTo().frame(i);
			 String el= wd.findElement(By.tagName("iframe")).getAttribute("id");
			 System.out.println("id of iframe "+i +" is= "+ el);
			 
		 }
		
		System.out.println("done");		    
		 
	
	} 
		
	}


