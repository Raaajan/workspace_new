package dkb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

		FileInputStream fi;
		XSSFWorkbook w;
		XSSFSheet s;
		
		
		public void getexcel(String path) throws IOException
		{
			try {
				fi= new FileInputStream(path);
				w=new XSSFWorkbook(fi);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
		
			}
		}

		public int countrow(int sheetno)
		{
			s=w.getSheetAt(sheetno);
			int cr=s.getLastRowNum();
			int newcr=cr+1;
			System.out.println("total rows= "+newcr);
			return newcr;
		}
		
		public int countcolumn(int sheetno)
		{
			s=w.getSheetAt(sheetno);
			int cc=s.getRow(0).getLastCellNum();
			System.out.println("total column= "+cc);
			return cc;
		}
		
		public String datafetch(int sheetno,int rowno,int cellno)
		{
				s= w.getSheetAt(sheetno);
			String	data=s.getRow(rowno).getCell(cellno).toString();
			System.out.println("data= "+data);
			return data;
			
		}	
		
	

	public static void main(String []args) throws IOException
	{
		Test t=new Test();
		t.getexcel("E:\\automation\\trydata.xlsx");
		int rc=t.countrow(0);
		int cc=t.countcolumn(0);
		for(int i=0;i<rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				t.datafetch(0, i, j);
			}
		}
		
	}
}
