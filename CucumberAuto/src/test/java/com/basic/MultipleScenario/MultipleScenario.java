package com.basic.MultipleScenario;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleScenario {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Iterasys\\FTS112\\Bibliotecas\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user first name$")
	public void User_enters_user_first_name() {
		driver.findElement(By.id("u_0_j")).sendKeys("David");
	}
	
	@And("^User enters user surname$")
	public void user_enters_user_surname() throws Throwable {
		driver.findElement(By.id("u_0_l")).sendKeys("Rogers");
	}
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present() {
		String userNameActual = driver.findElement(By.id("u_0_j")).getAttribute("value");
		assertEquals("David", userNameActual);

		
	}
	
	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws Throwable {
		String mobileActual = driver.findElement(By.id("u_0_o")).getAttribute("value");
		assertEquals("", mobileActual);
	}
	
	@Then("^Close browser$")
	public void Close_browser() {
		driver.quit();
		driver = null;
	}
	
	

}
