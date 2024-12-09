package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By RegisterLink = By.className("ico-register");
	By Gender = By.className("gender-male");
	By Firstname = By.id("FirstName");
	By Lastname = By.id("LastName");
	By Email = By.id("Email");
	By Password = By.id("Password");
	By Confirmpassword = By.id("ConfirmPassword");
	
	public void clickonRegisterLink() {
		driver.findElement(RegisterLink).click();
	}
	
	public void selectGender() throws InterruptedException {
		driver.findElement(Gender).click();
		Thread.sleep(3000);	
		}
	
	public void enterFirstname() throws InterruptedException {
		driver.findElement(Firstname).sendKeys("Srinu");
		Thread.sleep(3000);
	}
	
	public void enterLastname() throws InterruptedException {
		driver.findElement(Lastname).sendKeys("Rao");
		Thread.sleep(3000);
	}
	
	public void enterEmail() throws InterruptedException {
		driver.findElement(Email).sendKeys("srinurao@gmail.com");
		Thread.sleep(3000);
	}
	
	public void enterPassword() throws InterruptedException {
		driver.findElement(Password).sendKeys("Srinu@1221");
		Thread.sleep(3000);
	}
	
	public void enterConfirmpassword() throws InterruptedException {
		driver.findElement(Confirmpassword).sendKeys("Srinu@1221");
		Thread.sleep(3000);
	}
	
}
