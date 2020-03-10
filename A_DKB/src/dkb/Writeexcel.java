package dkb;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcel {
	Logger log = Logger.getLogger(Writeexcel.class.getName());

	public void updateresult(String file, String sheetname, String testcase, String testcaseno, String status) throws IOException {
		FileInputStream fi;
		FileOutputStream fo;
		XSSFWorkbook w;
		XSSFSheet s;
		int cellnum = 0;

		fi = new FileInputStream(file);
		w = new XSSFWorkbook(fi);
		s = w.getSheet(sheetname);

		int rowcount = s.getLastRowNum();

		int totalrow = rowcount + 1;

		System.out.println("total rows= " + totalrow);
		int totalcell = s.getRow(0).getLastCellNum();

		System.out.println("total cell =" + totalcell);

		for(int i=0;i<totalcell;i++)
		{
			String clmname=s.getRow(0).getCell(i).toString();
			if(testcase.equalsIgnoreCase(clmname))
			{
				 cellnum=i;
			}
		}
		
		for(int i=0;i<totalrow;i++)
		{
		String cellvalue=s.getRow(i).getCell(cellnum).toString();
		if(cellvalue.equalsIgnoreCase(testcaseno))
		{
			
			s.getRow(i).createCell(5).setCellValue(status);
			fo=new FileOutputStream(file);
			w.write(fo);
			System.out.println("done");
		}
		}
	}

	public static void main(String[] args) {

		Writeexcel we = new Writeexcel();
		try {
			we.updateresult("E:\\automation\\trydata.xlsx", "New","TC_No.","TC_02","PASS");
			we.updateresult("E:\\automation\\trydata.xlsx", "New","TC_No.","TC_03","FAIL");
			we.updateresult("E:\\automation\\trydata.xlsx", "New","TC_No.","TC_05","PASS");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
