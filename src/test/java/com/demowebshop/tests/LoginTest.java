package com.demowebshop.tests;

import org.testng.annotations.Test;

import com.demowebshop.pages.BasePage;
import com.demowebshop.pages.LoginPage;

public class LoginTest extends BasePage {
	
	LoginPage loginpage;
	
	@Test
	public void logintotheDemoShopWebsite() throws InterruptedException {
		loginpage = new LoginPage(driver);
		loginpage.clickonLoginLink();
		loginpage.enterEmail();
		loginpage.enterPassword();
		Thread.sleep(5000);
		
	}

}
