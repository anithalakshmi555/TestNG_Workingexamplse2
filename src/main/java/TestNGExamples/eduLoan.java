package TestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


  public class eduLoan {
    
	  
	 @Test(priority=1)
    public void eduloanTest1()
    {
  	  System.out.println("edu loan test1");
    }
    
    @Test(priority=2,groups= {"reg"})
    public void eduloanTest2()
    {
  	  System.out.println("edu loan test2");
    }
    
    @Test(priority=3,groups= {"smoke"})
    public void eduloanTest3()
    {
  	  System.out.println("edu loan test3");
    }
    
    @BeforeTest
    public void beforeTest() {
  	  System.out.println("edu loan before test ");
    }

    @AfterTest
    public void afterTest() {
  	  System.out.println("edu loan after test ");
    }

  }

