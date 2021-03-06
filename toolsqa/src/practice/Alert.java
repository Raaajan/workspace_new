package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import screenshot.Screenshotjar;

public class Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		wd.findElement(By.xpath("//*[text()='Prompt Pop up']")).click();
		WebDriverWait wait= new WebDriverWait(wd, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		org.openqa.selenium.Alert al =wd.switchTo().alert();
		
		String s=al.getText();
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String ans=sc.nextLine();
		al.sendKeys(ans);
		
		
		

	}

}
