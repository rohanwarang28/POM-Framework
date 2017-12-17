package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static int PageTimeout=20;
	public static int ImplicitWait=10;
	
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}

}
