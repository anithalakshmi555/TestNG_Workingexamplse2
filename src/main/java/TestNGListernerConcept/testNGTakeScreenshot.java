package TestNGListernerConcept;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(customeListener.class)
public class testNGTakeScreenshot extends BaseTest {
	
	
  
  @BeforeMethod
  public void setUp() {
 
	 initialization();
  }

  @Test
  public void createHomePage() {
	  System.out.println("Inside the createHomePage");
		  Assert.assertEquals(true, false);
	  }
 
  @Test
  public void createDealsPage() {
	  System.out.println("Inside the createDealsPage");
		  Assert.assertEquals(true, false);
	  }
 
  @Test
  public void createContactsPage() {
	  System.out.println("Inside the createContactsPage");
		  Assert.assertEquals(true, false);
	  }
 
  
  
  @AfterMethod
  public void tearDown () {
	 
			driver.quit();
	

  }

}
