package com.app.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.app.base.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends Utility {

	@Before
	public void before(Scenario scenario) {
	//scenario exe - first '
		//browser launch code 
		System.out.println("before");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maxmized");
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-extension");
		driver = new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		String name = scenario.getName();
		System.out.println(name);
	}

	@After
	public void after(Scenario scenario) {
		System.out.println("after");
		if(scenario.isFailed()) {
			//screen shot code
			String name = scenario.getName();
			System.out.println(name);
		}
	}

}
