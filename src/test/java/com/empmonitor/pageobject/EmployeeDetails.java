package com.empmonitor.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDetails {
	
	WebDriver driver;
	
	public EmployeeDetails(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath  ="//button[@id='add_btn']")
	WebElement registerbutton ;
	
	@FindBy (id = "addBulkRegBtn")
	WebElement Bulkregister ;
	
	@FindBy (id = "editBulkRegBtn")
	WebElement BulkUpdate;
	
//	@FindBy ()
//	WebElement ;
//	
//	@FindBy ()
//	WebElement ;
//	
//	@FindBy ()
//	WebElement ;
//	
//	@FindBy ()
//	WebElement ;
//	
//	@FindBy ()
//	WebElement ;
	
	
	public void ClickOnRegisterEmp ()
	{
		registerbutton.click();
	}

//	public void ClickOnBulkRegister()
//	{
//		Bulkregister.click();
//	}
//	public void ClickOnBulkUpdate()
//	{
//		BulkUpdate.click();
//	}
//	public void ()
//	{
//		
//	}
//	public void ()
//	{
//		
//	}
	
}
