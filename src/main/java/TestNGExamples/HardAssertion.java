package TestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HardAssertion {
  @Test
  public void test1() {
	  System.out.println("in the test-1  method");
	  Assert.assertEquals(true, true);
	  System.out.println("After hardasert true true ");
	
	  Assert.assertEquals(true, false);
	  
	  System.out.println("Create contact  ");
	  System.out.println("After creating the contact ");
	  Assert.assertEquals(true, false);
	  System.out.println("Create deal  ");
	  System.out.println("After creating the deal ");
	  Assert.assertEquals(true, false);
	  System.out.println("Create payment  ");
	  System.out.println("After creating the payment ");
  }
  
  @Test
  public void test2() {
	  System.out.println("in the test-2  method");
	  Assert.assertEquals(true, true);
	  System.out.println("After hardasert true true ");
	
	  Assert.assertEquals(true, false);
	  
	  System.out.println("Create contact  ");
	  System.out.println("After creating the contact ");
	  Assert.assertEquals(true, false);
	  System.out.println("Create deal  ");
	  System.out.println("After creating the deal ");
	  Assert.assertEquals(true, false);
	  System.out.println("Create payment  ");
	  System.out.println("After creating the payment ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

}
