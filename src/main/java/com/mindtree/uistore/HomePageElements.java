package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomePageElements {
	
	static By searchbar = By.xpath("//*[contains(@placeholder,'looking')]");
	static By searchbutton = By.xpath("//*[@type='submit']");
	
	public static By getsearchBarElement() {
		return searchbar;
	}
	
	public static By getsearchButtonElement() {
		return searchbutton;
	}

}
