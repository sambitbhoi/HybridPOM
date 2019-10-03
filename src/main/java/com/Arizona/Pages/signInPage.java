package com.Arizona.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Arizona.TestBase.TestBase;

public class signInPage extends TestBase {
	
	@FindBy(name = "email")
	WebElement userName;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	@FindBy(xpath ="//button[contains(@id,'SubmitLogin')]")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[contains(@class,'login')]")
	WebElement signInLink;
	
	public signInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String un, String pwd ) 
	{
		signInLink.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		userName.sendKeys(un);
		password.sendKeys(pwd);
		
	
	}

}
