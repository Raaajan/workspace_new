package ExcelReader;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	public String path;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public Excelread(String path) {
		path = this.path;

		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public int countrow(String sheetname) {
		try {
			int rowcount = sheet.getLastRowNum();
			return rowcount;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return 0;
	}

	public int countcolumn(String sheetname) {
		try {
			int columncount = sheet.getRow(0).getLastCellNum();
			return columncount;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return 0;
	}

	public String getcelldata(String sheetname, int rownum, String columnname) {
		try {
			int columnnum = 0;
			sheet = workbook.getSheet(sheetname);
			int cr=countrow(sheetname);
			System.out.println("No. of Rows= "+cr);
			int cc = countcolumn(sheetname);
			System.out.println("No. of Columns= "+cc);
			for (int i=0; i<=cc; i++) {
				String columnvalue = sheet.getRow(0).getCell(i).toString();
				if (columnvalue.equalsIgnoreCase(columnname)) {
					System.out.println("cloumnnamefound");
					columnnum = i;
				}

			}
			String cellvalue = sheet.getRow(rownum).getCell(columnnum).toString();
			return cellvalue;
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}
	
		public String getcelldata(String sheetname, int rownum, int columnnum) {
			try {
				
		
				sheet=workbook.getSheet(sheetname);
				int cr=countrow(sheetname);
				System.out.println("No. of Rows= "+cr);
				int cc = countcolumn(sheetname);
				System.out.println("No. of Columns= "+cc);
				String cellvalue = sheet.getRow(rownum).getCell(columnnum).toString();
				return cellvalue;
			} 
			catch (Exception e) {

				e.printStackTrace();
			}
			return null;
		
	}


public static void main(String []args)		
{
Excelread obj=new Excelread("E:\\automation\\workspace_new\\zmaventest\\src\\test\\java\\ConfigFile\\logincredential.xlsx");
String excelvalue=obj.getcelldata("Login", 2,"email");
System.out.println(excelvalue);
}
}