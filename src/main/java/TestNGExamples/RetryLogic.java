package TestNGExamples;

import analyzer.RetryAnalyzer;


import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic {
  @Test
  public void RetryTest1() {
	  Assert.assertEquals(true, false);
  }
  
  
  @Test
  public void RetryTest2() {
	  Assert.assertEquals(true, false);
  }
}
