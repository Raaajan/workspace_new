package ng;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups="car")
  public void Car1() 
  {
	  System.out.println("car 1");
  }
  
  @Test(groups="scootar")
  public void Scootar1() 
  {
	  System.out.println("scootar 1");
  }
  
  @Test(groups="car")
  public void Car2() 
  {
	  System.out.println("car 2");
  }
  
  @Test(groups="scootar")
  public void Scootar2() 
  {
	  System.out.println("scootar 2");
  }
  
  @Test(groups={"car","scootar"})
  public void Mix() 
  {
	  System.out.println("car + scootar");
  }
  
  @Test(groups="bike")
  public void bike1()
  {
	  System.out.println("bike 1");
  }
  
  @Test(groups="bike")
  public void bike2()
  {
	  System.out.println("bike 2");
  }
  
}
