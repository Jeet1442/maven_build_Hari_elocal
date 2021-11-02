package com.mindtree.runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.pageObjects.CartCheck;

import com.mindree.reusableComponent.Base;

public class CartCheckValidation extends Base {
	public static Logger log = LogManager.getLogger(CartCheckValidation.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Url working fine");
		
	}
	@Test
	 public void CartCheck() {
		 CartCheck cc = new CartCheck(driver);
		 cc.Cart().click();
		 log.info("Successfully clicked on cart");
	 }
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}

}
