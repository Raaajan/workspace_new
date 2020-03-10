package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver wd= new FirefoxDriver();
		wd.get("http://newtours.demoaut.com/mercurywelcome.php");
		FileInputStream f= new FileInputStream("E:\\automation\\Book1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet s=w.getSheetAt(0);
		int c=s.getLastRowNum();
		System.out.println("count="+(c+1));
		
		for(int i=0;i<=c;i++)
		{
		String v= s.getRow(i).getCell(0).toString();
		System.out.println("username="+v);
		String v1=s.getRow(i).getCell(1).toString();
		System.out.println("password="+v1);
		wd.findElement(By.name("userName")).sendKeys(v);
		wd.findElement(By.name("password")).sendKeys(v1);
		wd.findElement(By.name("login")).click();
		
		
		Thread.sleep(1000);
		wd.findElement(By.linkText("Home")).click();
		//s.getRow(i).createCell(2).setCellValue("done");
		//FileOutputStream m= new FileOutputStream("E:\\automation\\Book1.xlsx");
		//w.write(m);
		}
		wd.close();
		
		System.out.println("completed");
		}

}
