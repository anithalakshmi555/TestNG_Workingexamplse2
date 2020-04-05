package TestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


  public class homeLoan {
   
	  
	@Test(priority=1,groups= {"smoke"})
    public void homeloanTest1()
    {
  	  System.out.println("home loan test1");
    }
    
    @Test(priority=2)
    public void homeloanTest2()
    {
  	  System.out.println("home loan test2");
    }
    
    @Test(priority=3)
    public void homeloanTest3()
    {
  	  System.out.println("home loan test3");
    }
    
    @BeforeTest
    public void beforeTest() {
  	  System.out.println("home loan before test ");
    }

    @AfterTest
    public void afterTest() {
  	  System.out.println("home loan after test ");
    }

  }
