package com.empmonitor.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage (WebDriver rdriver)
	{
		driver = rdriver ;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//i[@title='Dashboard']")
	WebElement ClickonDashboard;
	
	@FindBy(xpath = "//a[@class='right-sidebar-toggle']")
	WebElement DashboardUserName;
	
	@FindBy(id = "registered-employees")
	WebElement TotalEnrolement ;
	
	// EMPLOYEE MODULE
	@FindBy(linkText = "Employee")
	WebElement EmployeeModule;
	
	@FindBy(linkText=("Employee-Details"))
	WebElement EmployeeDetails;
	
	// Report module
	
	
	@FindBy(linkText = "Reports")
	WebElement ClickOnReportModule;
	
	@FindBy(linkText = "Auto Email Reports")
	WebElement ClickOnautoemail;
	
	
	
	// methods starts 
	
	public void ClickOnDashboard()
	{
		ClickonDashboard.click();
	}
	public String GetUserName()
	{
		String user = DashboardUserName.getText();
		return user;
	}
	
	// EMPLOYEE MODULE
	public void ClickonEmployeeModule()
	{
		EmployeeModule.click();
	}
	
	public void ClickonEmployeeDetails()
	{
		EmployeeDetails.click();
	}
	
	public WebElement TotalEnrolement ()
	{
		 
		return TotalEnrolement;
	}
	
	// REPORT MODULE 
	public void ClickOnReportModule()
	{
		ClickOnReportModule.click();
	}
	public void ClickOnAutoEmailReport()
	{
		ClickOnautoemail.click();
	}
}
