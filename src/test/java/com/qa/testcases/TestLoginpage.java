package com.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TestLoginpage extends TestBase {

	
	LoginPage loginpage;
	HomePage homepage;
	public TestLoginpage() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
	}
	
	
	@Test(priority=1,description="Verify login page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description : Verify login page title on login page")
	@Story("Story Name: To check login title on login page")
	public void loginpagetitleTest()
	{
		String title=loginpage.validatelogintitle();
		assertEquals(title, "CRMPRO123 - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2,description="Verifying signup link test")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description : Verify signup link on login page")
	@Story("Story Name: To check signup link on login page")
	public void validatesignuplinkTest() {
		boolean flag=loginpage.validatesignuplink();
		assertEquals(flag, true);
	}
	
	@Test(priority=3,description="Verifying login functionality test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description : Verify login functionality on login page")
	@Story("Story Name: To check login functionality on login page")
	public void validateloginfunctionalityTest() throws InterruptedException {
		String uname=prop.getProperty("username");
		String password=prop.getProperty("password");
		homepage=loginpage.validateloginfunctionality(uname,password);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
