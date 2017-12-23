package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewContactPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
LoginPage loginPage;
HomePage homePage;
TestUtil testUtil;
ContactsPage contactPage;

String sheetName="contacts";
String filePath="D:\\my_workspace\\FreeCRMTests\\src\\main\\java\\com\\crm\\qa\\testdata";
String fileName="Datasheet FreeCRM.xlsx";
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		testUtil=new TestUtil();
		loginPage=new LoginPage();
		 //homePage=new HomePage();
		contactPage=new ContactsPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		//contactPage=homePage.clickOnContactsLink();
	   
	}
	
	@DataProvider
	public Object[][] getCRMTestData() throws IOException{
		
		Object data[][]=TestUtil.getTestData(filePath,fileName,sheetName);
		return data;
	}  
	
	
	@Test(dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title,String firstname,String lastname,String company){
		
		homePage.clickOnNewContact();
		contactPage.createNewContact(title, firstname, lastname, company);
		
	}
	
	
		
	
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
