package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.Base;
import com.app.base.Utility;

public class LoginPage_Locator extends Utility {

	public static WebElement getUsername() {
		return driver.findElement(By.id("username"));
		
	}
	
	public static WebElement getPassword() {
		return driver.findElement(By.id("password"));
		
	}
}
