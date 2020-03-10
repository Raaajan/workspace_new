package ng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrize 
{
  @Test
  @Parameters({"data","data1"})
  public void Param(@Optional("default") String data,@Optional("default") String data1) 
  {
	  System.out.println(data);
	  System.out.println(data1);
	  
  }
}
