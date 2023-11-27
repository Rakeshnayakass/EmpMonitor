package com.empmonitor.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoEmailPage {
	
	WebDriver driver;
	
	public  AutoEmailPage (WebDriver rdriver)
	
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText = "Create New Reports")
	WebElement CreateNewReport;
	
	
	

	public void ClickCreateNewReport()
	{
		CreateNewReport.click();
	}
	

}
