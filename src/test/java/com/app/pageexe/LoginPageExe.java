package com.app.pageexe;

import com.app.base.Utility;
import com.app.locator.BookAHotel_Locators;
import com.app.locator.LoginPage_Locator;

public class LoginPageExe extends BookAHotel_Locators {
	
	public static void username() {
		new Utility().type(LoginPage_Locator.getUsername(), "");
	}

}
