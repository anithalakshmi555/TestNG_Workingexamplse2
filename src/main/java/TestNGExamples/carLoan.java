package TestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class carLoan {
	
	WebDriver driver;
	
	  @Test(priority=1,groups={"smoke"})
	  public void carloanTest1() {
	  System.out.println("car loan test1"); }
	  
	  
	  @Test(priority=2)
	  public void carloanTest2() {
	  System.out.println("car loan test2"); }
	  
	  @Test (groups= {"smoke","reg"}) 
	  public void carloanTest3() {
	  System.out.println("car loan test3"); }
	 
  
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("car loan before method ");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("car loan after method ");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("car loan before class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("car loan after class ");
  }
  
  
  @BeforeTest
  public void beforecarTest1() {
	  System.out.println("car loan before test ");
  }

  @AfterTest
  public void aftercarTest1() {
	  System.out.println("car loan after test ");
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("car loan before suite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("car loan after suite ");
  }
  
  
  @BeforeGroups
  public void beforeGroup() {
	  System.out.println("car loan before group ");
  }

  @AfterGroups
  public void afterGroup() {
	  System.out.println("car loan after group ");
  }
  
  

}
