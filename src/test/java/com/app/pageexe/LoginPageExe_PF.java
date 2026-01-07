package com.app.pageexe;

import com.app.base.Utility;
import com.app.locator.BookAHotel_Locators;
import com.app.locator.LoginPageLocators_PF;
import com.app.locator.LoginPage_Locator;

public class LoginPageExe_PF extends LoginPageLocators_PF {
	
	public static void username() {
		new Utility().type(new LoginPageLocators_PF().getUsername(), "");
	}

}
