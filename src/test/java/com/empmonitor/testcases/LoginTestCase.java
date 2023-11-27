package com.empmonitor.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.empmonitor.pageobject.DashBoardPage;
import com.empmonitor.pageobject.LoginPage;

import junit.framework.Assert;

public class LoginTestCase extends BaseClasss {
	
	@Test
	public void verifyTheLogin () throws IOException, InterruptedException
	{
		logger.info("-----------*Test Case 1 Starts  *-------------------------");
		LoginPage lg = new LoginPage(driver);
		lg.LoginEmail();
		logger.info("Enter the email id ");
		lg.LoginPassword();
		logger.info("Enter the password ");
		lg.ClickOnLogin();
		logger.info("Clicked on the login button  ");
		
		
		DashBoardPage dash = new DashBoardPage(driver);
		logger.info("Entered into Dashboard page");
		String username = dash.GetUserName();
		System.out.println(username);
		
		if(username.equals("Welcome Sales_Team"))
		{
			logger.info("Capured the Dashboard username ");
			logger.info("Test case sucessfully compeleted ");
			logger.info("-----------* Test Case 1  Ends *----------------------  ");
			Assert.assertEquals("Welcome Sales_Team",username);
		}
		else
		{
			Thread.sleep(3000);
			BaseClasss base = new BaseClasss();
			base.screenshot(driver, "verifyTheLogin");
			logger.info("Test case failed ");
			Assert.assertEquals(true, false);
		}
		
		
	}
	
	

}
