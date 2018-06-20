package com.basic.ShareData;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/ShareData/" },
							
				glue =		{	"com/basic/ShareData/" },
				
				monochrome = false,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report9.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html"
							}
				)
public class RunMyShareDataScenarioTest {

}
