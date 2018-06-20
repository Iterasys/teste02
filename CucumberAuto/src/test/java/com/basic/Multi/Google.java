package com.basic.Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google {

	WebDriver driver;
	
	@Given("^User need to be on google page$")
	public void User_need_to_be_on_google_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Iterasys\\FTS112\\Bibliotecas\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@When("^User enters search string$")
	public void User_enters_search_string() {
		driver.findElement(By.id("lst-ib")).sendKeys("selenium" + Keys.ENTER);
		driver.quit();
	}


}
