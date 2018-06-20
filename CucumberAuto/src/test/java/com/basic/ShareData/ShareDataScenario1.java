package com.basic.ShareData;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class ShareDataScenario1 {
	
	WebDriver driver;
	
	public ShareDataScenario1(SharedClass share) {
		driver = share.setup();
	}
	
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String firstName) throws InterruptedException {
		String userNameActual = driver.findElement(By.id("u_0_j")).getAttribute("value");
		assertEquals(firstName, userNameActual);
		Thread.sleep(1000);
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws Throwable {
		driver.findElement(By.id("u_0_l")).sendKeys(surName);
		Thread.sleep(1000);
	}
	
	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws Throwable {
		String mobileActual = driver.findElement(By.id("u_0_o")).getAttribute("value");
		assertEquals("", mobileActual);
	}
	
}
