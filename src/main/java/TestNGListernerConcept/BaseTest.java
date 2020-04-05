package TestNGListernerConcept;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
//import java.io.InputStream;

import org.apache.commons.io.FileUtils;
//import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.reporters.Files;

public class BaseTest {
	
	public  static  WebDriver driver;
	public static 	String baseURL = "http://demo.guru99.com/V4/";
	
	public static void   initialization()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Miss Jaydevappa\\Automation\\TestNGSeleniumDemo\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
	
	}
	
		
	public void failed(String  name,WebDriver driver)
	{
		//String path = "C:\\Users\\Miss Jaydevappa\\eclipse-workspace\\TestNG_Workingexamplse2\\TestOuput\\failed.jpg";
	
		
		System.out.println("Inside basetest failed--1" + name);
		System.out.println(driver.getTitle());
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Inside basetest failed--2");
		try {
			System.out.println("Inside basetest failed--3");
		FileUtils.copyFile(screenshotFile,new File("C:\\Users\\Miss Jaydevappa\\eclipse-workspace\\TestNG_Workingexamplse2\\Scrnshot\\" + name + "-"+ ".jpg"));
		System.out.println("Inside basetest failed--4");}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	
	}
}
