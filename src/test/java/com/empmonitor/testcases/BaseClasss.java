package com.empmonitor.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.empmonitor.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClasss {

	
	ReadConfig read = new ReadConfig();
	public String emailAddress = read.getEmail() ;
	String password = read.getPassword();
	
	public static WebDriver driver;
	public static Logger logger;
	//opening the browser 
	@BeforeClass
	public void setup()
	
	{
		
		switch(read.getBrowser().toLowerCase())
		{
		case"chrome":
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions ();
//		options.setHeadless(true);
		driver=new ChromeDriver();//(options);
		break;
		}
		
		driver.manage().window().maximize();
		logger=LogManager.getLogger("Empmonitor_project");
		driver.get(read.getBaseUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}
	
	
	//Closing the browser
	@AfterClass
	public void Teardown()
	{
		
		driver.quit();
		
	}
	
	// failed test cases screenshot 
	
	public void screenshot (WebDriver driver , String testname) throws IOException
	{
		TakesScreenshot sc = (TakesScreenshot)driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File desc = new File(System.getProperty("user.dir") +"//Screenshots//" + testname+ ".png");
		FileUtils.copyFile(src, desc);
	}
	
	
}
