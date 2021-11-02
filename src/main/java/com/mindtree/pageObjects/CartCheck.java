package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.CartCheckElements;


public class CartCheck {
	WebDriver driver;
	
	public CartCheck(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement Cart() {
		return driver.findElement(CartCheckElements.cart);
	}

}
