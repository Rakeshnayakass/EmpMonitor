 package com.empmonitor.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.empmonitor.pageobject.AddEmployeePage;
import com.empmonitor.pageobject.DashBoardPage;
import com.empmonitor.pageobject.EmployeeDetails;
import com.empmonitor.pageobject.LoginPage;
import com.empmonitor.utilities.MethodsUtilities;

import junit.framework.Assert;

public class verifyEmployeeRegistration extends BaseClasss {

	@Test
	public void VerfiyEmployeeRegistration () throws IOException, InterruptedException
	{
		MethodsUtilities m = new MethodsUtilities();
		// LOGIN PAGE
		LoginPage lp = new LoginPage(driver);
		{
			logger.info("-----------*Test Case 2 Starts  *-------------------------");
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
			logger.info(username+"Dashboard");
			
			DashBoardPage dp = new DashBoardPage (driver);
			WebElement ele = dp.TotalEnrolement();
			String BeforeTotal = m.getTextMethod(ele);
			logger.info(" Employee total enrollement"+dp.TotalEnrolement());
			
			Reporter.log("Total Enrollement "+BeforeTotal);
		// DASHBAORD PAGE
			DashBoardPage da = new DashBoardPage(driver);
			Thread.sleep(3000);
			da.ClickonEmployeeModule();
			logger.info("Clicked on the Employee module ");
			Thread.sleep(3000);
			da.ClickonEmployeeDetails();
			logger.info("Clicked on the Employee Details ");
			Thread.sleep(3000);
			
		// REGISTER PAGE
			
			EmployeeDetails emp = new EmployeeDetails (driver);
			Thread.sleep(3000);
			emp.ClickOnRegisterEmp();
			
			
		// Add EMPLOYEE page 	
			logger.info("Entered into Emp Registor page ");
			AddEmployeePage pg = new AddEmployeePage(driver);
			pg.Entername("manoaja");
			pg.Enterlastname("kuimsaar");
			pg.EnterEmailId("manoasaj123!@gmail.com");
			pg.Enterpass("Manoswj@123");
			pg.Entercpass("Manowj@123");
			WebElement loca = pg.location();
			m.DropDown(loca, "Thane");
			WebElement dept = pg.Department();
			m.DropDown(dept, "PHP");
			pg.EnterEMpcode("E_925289");
			
			
			pg.Selectrole();
			List<WebElement> sct = pg.SelectRoleEmployee();
			m.selectobject(sct, "Employee");
			pg.SelectRoleEmployee();
			WebElement time = pg.timeZone();
			m.DropDown(time,"(UTC +05:30) Kolkata, Asia");
			pg.SubmitDetails();
			logger.info("Entered all the Mandatory Details ");
			logger.info("Sucessfull clicked on the sumbit Button");
			Thread.sleep(5000);
			screenshot(driver,"Emp register suceesful");
			
			DashBoardPage dpa = new DashBoardPage (driver);
			//dpa.ClickOnDashboard();
			logger.info("Back to Dashboard Page");
			WebElement eles = dpa.TotalEnrolement(); 
			String Aftertottal = m.getTextMethod(ele);
			
			logger.info(Aftertottal);
			Reporter.log("AfterAdding one Employee total enrollement"+Aftertottal);
			
			if(BeforeTotal==Aftertottal)
			{
				Assert.assertFalse(false);
				BaseClasss base = new BaseClasss();
				base.screenshot(driver, "VerfiyEmployeeRegistration");
				logger.info("Employee is not Register Successfully");
			}
			
			else
			{
				Assert.assertFalse(true);
				logger.info("Employee is Register Successfully");
				
			}
			}
		logger.info("-----------*Test Case 2 Ends  *-------------------------");
		
		}

	}



