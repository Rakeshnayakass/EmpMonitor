package com.empmonitor.testcases;

import java.io.IOException;

import com.empmonitor.pageobject.AutoEmailPage;
import com.empmonitor.pageobject.DashBoardPage;
import com.empmonitor.pageobject.LoginPage;
import com.empmonitor.pageobject.NewEmailReportsPage;

public class VerifyAutoEmailReport extends BaseClasss{
	

	public void verifyAutoEmialReport () throws IOException, InterruptedException
	{
		
		logger.info("-----------*Test Case 3 Starts  *-------------------------");
		LoginPage lg = new LoginPage(driver);
		lg.LoginEmail();
		logger.info("Enter the email id ");
		lg.LoginPassword();
		logger.info("Enter the password ");
		lg.ClickOnLogin();
		logger.info("Clicked on the login button  ");
		
		
		DashBoardPage dp = new DashBoardPage(driver);
		dp.ClickOnReportModule();
		
		AutoEmailPage auto = new AutoEmailPage(driver);
		auto.ClickCreateNewReport();
		
		NewEmailReportsPage er = new NewEmailReportsPage(driver);
		er.EnterReportTitle(  "Dialy Report 24" );
		er.SelectFrequencyDaily();
		er.EnterEmail("Abcd123@gmail.com");
		er.ClickonAdminEmail();
		er.ClickOnPDF();
		er.ClickOnCsv();
		er.ClickOrg();
		er.ClickOnTestMail();
		er.ClickOnSave();
			
	}
}
