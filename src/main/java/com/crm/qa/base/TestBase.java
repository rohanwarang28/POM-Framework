package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase(){
	
	 prop=new Properties();
	 try {
		FileInputStream ip=new FileInputStream(
				"D:\\my_workspace\\FreeCRMTests\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		
		 prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	 public  void initialization(){
		 String browserName=prop.getProperty("browser");
		 if(browserName.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		 
		 
	 } 
		
	

}
