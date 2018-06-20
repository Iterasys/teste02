package com.basic.Tags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/Tags/" },
							
				glue =		{	"com/basic/Tags/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report10.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport10.html"
				//          }
							},
				
				tags =		{	
								"@Smoke",
								"@Important" // AND
						
								// "@Smoke,@Regression" // OR
							}
							
				)
public class RunMyTagsScenarioTest {

}
