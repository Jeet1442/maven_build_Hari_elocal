package com.mindtree.runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.mindtree.pageObjects.Login;

import com.mindree.reusableComponent.Base;

public class LoginValidation extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Url working fine");
		
	}
	@Test
	public void Login() {
		Login l = new Login(driver);
		l.login().click();
		l.email().sendKeys("Debjeet");
		l.password().sendKeys("1234");
		log.info("Successfully entered email and password");
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}
