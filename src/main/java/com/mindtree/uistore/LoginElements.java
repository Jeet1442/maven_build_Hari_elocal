package com.mindtree.uistore;

import org.openqa.selenium.By;

public class LoginElements {
	
	public static By login = By.linkText("Login");
	public static By email = By.xpath("//*[@label='Email']");
	public static By password =  By.xpath("//*[@label='Password']");
	public static By submit = By.xpath("//*[@type='submit']");
	
	public static By getLogin() {
		return login;
	}
	public static By getEmail() {
		return email;
	}
	public static By getPassword() {
		return password;
	}

}
