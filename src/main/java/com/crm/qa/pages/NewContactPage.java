package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewContactPage extends TestBase{

	
	@FindBy(xpath="//input[@type='text' and @id='first_name']")
	 WebElement fname;
	
	 @FindBy(xpath="//input[@type='text' and @id='surname']")
	 WebElement lname;
	 
	 @FindBy(xpath="//input[@type='text' and @name='client_lookup']")
	 WebElement companyName;
	
	 @FindBy(xpath="//input[@type='submit' and @value='Save']")
	 WebElement saveBtn;
	 
	public NewContactPage(){
		
		PageFactory.initElements(driver,this);
	}
	
	
	
}
