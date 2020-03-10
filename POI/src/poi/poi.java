		package poi;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class poi 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver wd= new FirefoxDriver();
		wd.get("http://automationpractice.com/index.php?");
		FileInputStream f= new FileInputStream("E:\\automation\\workspace_new\\POI\\search.xlsx");
		
	//	FileOutputStream o= new FileOutputStream("E:\\automation\\workspace_new\\POI\\search.xlsx");
		
		org.apache.poi.xssf.usermodel.XSSFWorkbook w= new org.apache.poi.xssf.usermodel.XSSFWorkbook(f);
		XSSFSheet s =w.getSheetAt(0);
		int c=s.getLastRowNum();
		System.out.println("count="+c);
		for(int i=0;i<=c;i++)
		{
		String a= s.getRow(i).getCell(0).toString();
		System.out.println(a);
		WebElement search=wd.findElement(By.id("search_query_top"));
		search.sendKeys(a);
		wd.findElement(By.name("submit_search")).click();
		

		//String b=wd.findElement(By.xpath(".//*[@id='center_column']/p")).getText();
		
	
		
		//if(b.equalsIgnoreCase("No results were found for your search" + "tops" ));
		
		//{
	/*	s.createRow(i).createCell(1).setCellValue("done");
		System.out.println("done");*/
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='header_logo']/a/img")).click();
	//	}

		/*else
		{
			s.createRow(i).createCell(1).setCellValue("result found");
			System.out.println("result found");
			Thread.sleep(1000);
			wd.findElement(By.xpath(".//*[@id='header_logo']/a/img")).click();
		}
		
		}*/
		
		
		
		
		
		
		
	}
		System.out.println("completed");
		wd.close();
	}
}

	
		
	


