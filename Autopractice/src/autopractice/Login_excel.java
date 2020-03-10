package autopractice;

import poi.Fileinput;

public class Login_excel {

	public static void main(String[] args) {
		
Fileinput file= new Fileinput("E:\\automation\\Book1.xlsx");
		
		int co=file.Count(0);
		System.out.println(co+1);
		
		for(int i=0;i<=2;i++)
		{
		String a=file.getdata(0, i, 0);
	
		String b=file.getdata(0, i, 1);
		System.out.println(a+"  "+b);
		}

	}

}
