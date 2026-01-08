package com.app.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	
	
	public static WebDriver driver = null;
	public static  JavascriptExecutor js;
	public static Actions actions;

	// **** 1. Launch Browser ****
	public WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("Invalid browser: " + browserName);
		}
	//	driver.manage().timeouts().implicitlyWait(0, null);
		return driver;
	}

	// **** 2. Open URL ****
	public void openUrl(String url) {
		driver.get(url);
		String pagenumber="";
		driver.navigate().to("https://www.flipkart.com/"
				+ "search?q=realme+5g+mobile&otracker=search&otracker1=search"
				+ "&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY&page="+pagenumber+"");
	}

	// **** 3. Get Page Title ****
	public String getPageTitle() {
		return driver.getTitle();
	}

	// **** 4. Find Element ****
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// **** 5. Find Elements ****
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// **** 6. Click ****
	public void click(By locator) {
		getElement(locator).click();
	}

	// **** 7. Send Keys ****
	public void type(WebElement locator, String text) {
		
		locator.clear();
		locator.sendKeys(text);
	}

	// **** 8. Get Text ****
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	
	public String getText1(By locator) {
		return getElement(locator).getText();
	}

	// changes done by other user
	public String getText2(By locator) {
		return getElement(locator).getText();
	}
}
