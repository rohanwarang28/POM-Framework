package com.crm.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	 LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
			initialization();
			 loginPage=new LoginPage();
		
	}
	
	
	@Test
	public void verifyLoginPageTitleTest(){
		String title=loginPage.verifyLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	
	@Test
	public void verifyLogoTest(){
		Assert.assertTrue(loginPage.verifyLogo());
	}
	
	@Test
	public void LoginTest(){
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
