package com.empmonitor.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class NewEmailReportsPage {
	WebDriver driver;
	
	
	public NewEmailReportsPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (id = "usr")
	WebElement ReportTitle;
	
	@FindBy (id = "daily")
	WebElement DailyReport;
	
	@FindBy (id = "Weekly")
	WebElement WeeklyReport;
	
	@FindBy (id = "Monthly")
	WebElement MonthlyReport;
	
	@FindBy (id = "emailReq")
	WebElement EnteremailId;
	
	@FindBy (xpath ="//input[@name='admin_email']")
	WebElement checkBox;
	
	@FindBy (id = "pdf_id")
	WebElement PDF;
	
	@FindBy (id = "csv_id")
	WebElement CSV;
	
	@FindBy (id = "org")
	WebElement oraganization;
	
	@FindBy (id = "testmail")
	WebElement TestMail;
	
	@FindBy (id = "save")
	WebElement savebutton;
	
	
	//METHODDS
	
	public void EnterReportTitle(String value)
	{
		ReportTitle.sendKeys(value);
	}
	
	public void SelectFrequencyDaily()
	{
		DailyReport.click();	}
	
	public void SelectFrequencyweekly()
	{
		WeeklyReport.click();	}
	
	public void SelectFrequencymonthly()
	{
		MonthlyReport.click();
	}
	
	public void EnterEmail(String value)
	{
		EnteremailId.sendKeys(value);
	}
	
	public void ClickonAdminEmail()
	{
		checkBox.click();
	}
	
	public void ClickOnPDF()
	{
		PDF.click();
	}
	
	public void ClickOnCsv()
	{
		CSV.click();
	}
	
	public void ClickOrg()
	{
		oraganization.click();
	}
	
	public void ClickOnTestMail()
	{
		TestMail.click();
	}
	
	public void ClickOnSave()
	{
		savebutton.click();
	}

}
