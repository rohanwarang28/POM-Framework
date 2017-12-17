package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory=OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement logo;
	
	//Initialize page objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
    public String verifyLoginPageTitle(){
	return driver.getTitle();	
	}
 
    public boolean verifyLogo(){
    	return logo.isDisplayed();
    }
    
    public HomePage login(String un,String pwd){
    	username.sendKeys(un);
    	password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }
    
    

}
