package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver = null;
	@Given("Login to the Application {string}")
	public void login_to_the_application(String url) {
	   driver.get(url);
	}
	@When("Enter the Username {string}")
	public void enter_the_username(String user) {
	    driver.findElement(By.id("username")).sendKeys(user);
	}
	@When("Enter the Password {string}")
	public void enter_the_password(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("CLick the login button")
	public void c_lick_the_login_button() {
		driver.findElement(By.id("login")).click();
	}
	@Then("Validate the Home page")
	public void validate_the_home_page() {
	  System.out.println("error message");
	  driver.quit();
	}
	
	@When("Enter the User {string}")
	public void enter_the_user(String user) {
		 driver.findElement(By.id("username")).sendKeys(user);
	}
	@When("Enter the Pass {string}")
	public void enter_the_pass(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@Given("Login to the Adactin Application")
	public void login_to_the_adactin_application() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://adactinhotelapp.com/");
		   driver.findElement(By.id("username")).sendKeys("yuvisekar3");
		   driver.findElement(By.id("password")).sendKeys("1D586V");
		   driver.findElement(By.id("login")).click();
		   
	}
	@When("Enter the Search Hotel fields")
	public void enter_the_search_hotel_fields(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
		WebElement element = driver.findElement(By.id("location"));
		Select s = new Select(element);
		s.selectByContainsVisibleText(data.get("Location"));
	}
	
	@When("Enter the Search Hotel fields using list")
	public void enter_the_search_hotel_fields_using_list(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		WebElement element = driver.findElement(By.id("location"));
		Select s = new Select(element);
		s.selectByContainsVisibleText(asList.get(0));
	}


}
