package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class as {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=Dfc0WuzWKs-FrAGdiYf4CQ&gws_rd=ssl");
		/*FileInputStream f= new FileInputStream("E:\\automation\\workspace_new\\POI\\Book2.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet s= w.getSheetAt(0);
		int c= s.getLastRowNum();
		System.out.println("count="+c);
		for(int i=0;i<=c;i++)
		{
		String a= s.getRow(i).getCell(0).toString();*/
		WebElement search=wd.findElement(By.xpath(".//*[@id='gs_htif0']"));
		search.click();
		wd.findElement(By.name("btnK")).click();
		/*System.out.println(a);
		FileOutputStream m= new FileOutputStream("E:\\automation\\workspace_new\\POI\\Book2.xlsx");
		s.createRow(i).createCell(0).setCellValue("done");
		w.write(m);
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='logo']/img")).click();
		}*/
		
		System.out.println("complete");
		wd.close();
		
	}	

}
