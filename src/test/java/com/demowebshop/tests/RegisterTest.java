package com.demowebshop.tests;

import org.testng.annotations.Test;

import com.demowebshop.pages.BasePage1;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.pages.RegisterPage;

public class RegisterTest extends BasePage1 {
	
	RegisterPage registerpage;
	
	@Test
	public void registertotheDemoShopWebsite() throws InterruptedException {
		registerpage = new RegisterPage(driver);
		registerpage.clickonRegisterLink();
		registerpage.enterEmail();
		registerpage.enterPassword();
		Thread.sleep(5000);
	
	
	}

}
