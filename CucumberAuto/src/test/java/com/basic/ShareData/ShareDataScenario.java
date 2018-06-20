package com.basic.ShareData;

// import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.After;
//import cucumber.api.java.Before;
// import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataScenario {
	
	WebDriver driver;
	
	public ShareDataScenario(SharedClass share) {
		driver = share.setup();
	}
	/*
	@Before
	public void beforeSetup1() {
		System.out.println("in Before 1");
		System.setProperty("webdriver.chrome.driver", "C:\\Iterasys\\FTS112\\Bibliotecas\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	*/
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page() {

		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String firstName) throws InterruptedException {
		driver.findElement(By.id("u_0_j")).sendKeys(firstName);
		Thread.sleep(1000);
	}

	/*
	@After 
	public void tearDown1() {
		System.out.println("in After 1");
		driver.quit();
		driver = null;
	}
	*/


}
