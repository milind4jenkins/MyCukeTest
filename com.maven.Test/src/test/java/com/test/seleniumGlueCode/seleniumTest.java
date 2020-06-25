package com.test.seleniumGlueCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class seleniumTest {
	
	
	
	
	
	WebDriver driver= null;
	
	@Given("^i am on Login page$")
	public void i_am_on_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:/Users/MILIND.KAMU/Documents/chromedriver.exe");
		driver = new ChromeDriver();
		
	    driver.get("http://google.com");
	}

	@When("^i enter valid login credentials$")
	public void i_enter_valid_login_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^i should login successfully$")
	public void i_should_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
	
	
	

}
