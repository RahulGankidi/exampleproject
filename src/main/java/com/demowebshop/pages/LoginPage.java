package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By LoginLink = By.className("ico-login");
	By Email = By.id("Email");
	By Password = By.id("Password");
	
	public void clickonLoginLink() {
		driver.findElement(LoginLink).click();
	}
	public void enterEmail() {
		driver.findElement(Email).sendKeys("gankidirahul123@gmail.com");
	}
	public void enterPassword() {
		driver.findElement(Password).sendKeys("Rahul@8001");
	}
	
	}
	


