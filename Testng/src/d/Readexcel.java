package d;


import poi.Fileinput;

public class Readexcel {

	public static void main(String[] args) 
	{

		Fileinput file= new Fileinput("E:\\automation\\new.xlsx");

		int rowcount=file.Countrows(0);
		rowcount=rowcount+1;
		System.out.println("rows= "+rowcount);
		int columncount=file.Countcolumn(0);
		System.out.println("columns= "+columncount);
		
		Object data[][]=new Object[rowcount][columncount];
		for(int i=0;i<rowcount;i++)                                  
		{
			for(int j=0;j<columncount;j++)
			{
				data[i][j]=file.getdata(0, i, j);
			}
		}
		
	
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
				System.out.println(data[i][j]);
			}
		}
		
	}
}
