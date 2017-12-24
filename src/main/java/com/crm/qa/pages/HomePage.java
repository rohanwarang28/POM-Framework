package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: rohanw1')]")
	WebElement nameDisplay;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean displayName(){
		return nameDisplay.isDisplayed();
	}
	
	
	public ContactsPage clickOnContactsLink(){
		contactLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public void clickOnNewContact(){
		Actions action=new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newContactLink.click();
		
	}
	
	
	
	
	
}
