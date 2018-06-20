package com.basic.DataTable;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableScenario {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Iterasys\\FTS112\\Bibliotecas\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String firstName) {
		driver.findElement(By.id("u_0_j")).sendKeys(firstName);
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws Throwable {
		driver.findElement(By.id("u_0_l")).sendKeys(surName);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String firstName) {
		String userNameActual = driver.findElement(By.id("u_0_j")).getAttribute("value");
		assertEquals(firstName, userNameActual);

		
	}
	
	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws Throwable {
		String mobileActual = driver.findElement(By.id("u_0_o")).getAttribute("value");
		assertEquals("", mobileActual);
	}
	
	@When("^enter following data$")
	public void enter_following_data(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		//String  values1 = data.get(0).get(0);
		//String  values2 = data.get(0).get(1);
		//String  values3 = data.get(0).get(2);
		
		String  values4 = data.get(1).get(0);
		String  values5 = data.get(1).get(1);
		//String  values6 = data.get(1).get(2);
		
		driver.findElement(By.id("u_0_j")).sendKeys(values4);
		driver.findElement(By.id("u_0_l")).sendKeys(values5);
		//String mobileActual = driver.findElement(By.id("u_0_o")).getAttribute("value");
	}
	
	@Then("^Close browser$")
	public void Close_browser() {
		driver.quit();
		driver = null;
	}
	
	

}
