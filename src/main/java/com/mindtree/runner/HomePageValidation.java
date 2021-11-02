package com.mindtree.runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindree.reusableComponent.Base;
import com.mindtree.pageObjects.HomePage;




public class HomePageValidation extends Base {
	
	public static Logger log = LogManager.getLogger(HomePageValidation.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Url working fine");
		
	}
	
	@Test
	public void Book() {
		String book = prop.getProperty("book");
		HomePage hp = new HomePage(driver);
		hp.searchBar().sendKeys(book);
		log.info("Entered book name");
		hp.searchButton().click();
		log.info("Searched for book");
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}

}
