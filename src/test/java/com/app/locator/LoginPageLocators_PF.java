package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.Utility;

public class LoginPageLocators_PF extends Utility {
	
	public LoginPageLocators_PF() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

}
