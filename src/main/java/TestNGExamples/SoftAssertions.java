package TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertions {

	 
	 @Test
	  public void test1() {
		 SoftAssert sa = new SoftAssert();
		  System.out.println("in the test-1  method");
		  Assert.assertEquals(true, true);
		  System.out.println("test-1  After hardasert true true ");
		
		  sa.assertEquals(true, false," test-1   softassert  assert is failing ");
		  
		  System.out.println("test-1   Create contact  ");
		  System.out.println(" test-1   After creating the contact ");
		  sa.assertEquals(true, false,"test-1   contacts page title is missing");
		  System.out.println("test-1   Create deal  ");
		  System.out.println("test-1  After creating the deal ");
		  sa.assertEquals(true, false,"test-1  deals page title is missing");
		  System.out.println("test-1  Create payment  ");
		  System.out.println("test-1  After creating the payment ");
		  sa.assertAll();
	  }
	 
	 @Test
	 public void test2() {
		 SoftAssert sa2 = new SoftAssert();
		  System.out.println("test-2--in the test-2  method");
		  Assert.assertEquals(true, true);
		  System.out.println("test-2--After hardasert true true ");
		
		  sa2.assertEquals(true, false,"test-2--softassert  assert is failing ");
		  
		  System.out.println("test-2--Create contact  ");
		  System.out.println("test-2--After creating the contact ");
		  sa2.assertEquals(true, false,"test-2--contacts page title is missing");
		  System.out.println("test-2--Create deal  ");
		  System.out.println("test-2--After creating the deal ");
		  sa2.assertEquals(true, false,"test-2--deals page title is missing");
		  System.out.println("test-2--Create payment  ");
		  System.out.println("test-2--After creating the payment ");
		  sa2.assertAll();
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
