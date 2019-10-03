package com.Arizona.TestPages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Arizona.Pages.signInPage;
import com.Arizona.TestBase.TestBase;

public class signInPageTest extends TestBase {
	
	signInPage signInPage;
	
	public signInPageTest()
	{
		super();
	}
	
	//Driver Initialization
	@BeforeClass
	
	public void setUp()
	{
		initialization();
		signInPage = new signInPage();
	}
	
	//Login to Application
	@Test
	public void LoginTest() 
	{
		signInPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	//Driver Close
	@AfterClass
	public void Teardown()
	{
		driver.close();
		driver.quit();
	}

}
