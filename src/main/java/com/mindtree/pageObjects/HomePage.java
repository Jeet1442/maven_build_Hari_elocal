package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.HomePageElements;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement searchBar() {
		return driver.findElement(HomePageElements.getsearchBarElement());
	}
	
	public WebElement searchButton() {
		return driver.findElement(HomePageElements.getsearchButtonElement());
	}

}
