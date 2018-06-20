package com.basic.Background;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/Background/" },
							
				glue =		{	"com/basic/Background/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report1.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
							}
				)
public class RunBackgroundScenarioTest {

}
