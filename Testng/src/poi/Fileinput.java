 package poi;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fileinput {
	
	
	XSSFWorkbook w;
	XSSFSheet s;
	
	

	public Fileinput(String excel)
	{
		try
		{
		FileInputStream fi=new FileInputStream(excel);
		w = new XSSFWorkbook(fi);
		
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public int Countrows(int sheetno)
	{
		s=w.getSheetAt(sheetno);
	int count=s.getLastRowNum();
	return count;
	}
	
	public int Countcolumn(int sheetno)
	{
		s=w.getSheetAt(sheetno);
	int count=s.getRow(sheetno).getLastCellNum();
	return count;
	}
	
	public String getdata(int sheetno,int rowno,int columnno)
	{	
		s=w.getSheetAt(sheetno); 
		
		String value=s.getRow(rowno).getCell(columnno).toString();
		return value;
	}



	

}
