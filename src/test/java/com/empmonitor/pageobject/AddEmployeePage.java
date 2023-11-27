package com.empmonitor.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	WebDriver driver;
	public AddEmployeePage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="name")
	WebElement name ;

	@FindBy (id = "f_name")
	WebElement lastname ;

	@FindBy (id = "emp_email")
	WebElement EmailID;
	
	@FindBy(id="passwd")
	WebElement password ;

	@FindBy (id = "c_passwd")
	WebElement confirmpass ;

	@FindBy (id = "locations-addEmp")
	WebElement location;
	
	@FindBy(id="EmpReg_departments")
	WebElement Department ;
	
	@FindBy(xpath  = "(//ul[@class='select2-selection__rendered'])[1]")
	WebElement role;
	
	@FindBy(name = "empCode")
	WebElement Empcode;
	
	@FindBy(xpath  = "//ul[@class='select2-results__options']//li")
	List<WebElement> SelectEmployee;

	@FindBy (id = "timeZoneAppend")
	WebElement TimeZone ;

	@FindBy (id = "empReg")
	WebElement Submit;

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


	public void Entername (String value)
	{
		name.sendKeys(value);
	}

	public void Enterlastname(String value)
	{
		lastname.sendKeys(value);
	
	}
	public void EnterEmailId(String value)
	{
		EmailID.sendKeys(value);
	
	}
	public void Enterpass(String value)
	{
		password.sendKeys(value);
	}
	public void Entercpass(String value)
	{
		confirmpass.sendKeys(value);
	}
	public WebElement location()
	{
		return location;
	}
	public WebElement Department()
	{
		 return Department ;
	}
	public void Selectrole()
	{
		 role.click();
	}
	public void EnterEMpcode(String value)
	{
		Empcode.sendKeys(value);
	}
	
	
	public List<WebElement> SelectRoleEmployee()
	{
		return SelectEmployee;
	}
	public WebElement timeZone( )
	{
		return TimeZone;
	}
	public void SubmitDetails()
	{
		Submit.click();
	}
	
	//	public void ()
	//	{
	//		
	//	}
	//	public void ()
	//	{
	//		
	//	}
}
