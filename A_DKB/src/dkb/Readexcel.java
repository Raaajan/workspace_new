package dkb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readexcel {

	FileInputStream fi;
	XSSFWorkbook w;
	XSSFSheet s;
	
	
	public Readexcel(String path) throws IOException
	{
		fi=new FileInputStream(path);
		w=new XSSFWorkbook(fi);
	}

	public int countrow(int sheetno)
	{
		s=w.getSheetAt(sheetno);
		int cr=s.getLastRowNum();
		int newcr=cr+1;
	//	System.out.println("total rows= "+newcr);
		return newcr;
	}
	
	public int countcolumn(int sheetno)
	{
		s=w.getSheetAt(sheetno);
		int cc=s.getRow(0).getLastCellNum();
		//System.out.println("total column= "+cc);
		return cc;
	}
	
	public String datafetch(int sheetno,int rowno,int cellno)
	{
			s= w.getSheetAt(sheetno);
		String	data=s.getRow(rowno).getCell(cellno).toString();
		//System.out.println("data= "+data);
		return data;
		
	}	
	
	public String datafetch(String sheetname,int rowno,String cellname)
	{	
		int cellno=0;;
			s=w.getSheet(sheetname);
			int lastcell=s.getRow(0).getLastCellNum();
			for(int i=0;i<lastcell;i++)
			{
				String value=s.getRow(0).getCell(i).toString();
				if(value.equalsIgnoreCase(cellname))
				{
					cellno=i;
				}
			}
		String data=s.getRow(rowno).getCell(cellno).toString();
		return data;
	}	
	
	public int countrow(String sheetname)
	{
		s=w.getSheet(sheetname);
		int cr=s.getLastRowNum();
		int newcr=cr+1;
	//	System.out.println("total rows= "+newcr);
		return newcr;
	}
	
	public int countcolumn(String sheetname)
	{
		s=w.getSheet(sheetname);
		int cc=s.getRow(0).getLastCellNum();
		//System.out.println("total column= "+cc);
		return cc;
	}
}

