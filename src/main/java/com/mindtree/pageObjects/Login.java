package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.LoginElements;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement login() {
		return driver.findElement(LoginElements.login);
	}
	public WebElement email() {
		return driver.findElement(LoginElements.email);
	}
	public WebElement password() {
		return driver.findElement(LoginElements.password);
	}
	public WebElement submit() {
		return driver.findElement(LoginElements.submit);
	}
	
	
	

}
