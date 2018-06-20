package com.basic.Param;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/Param/" },
							
				glue =		{	"com/basic/Param/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report8.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
							}
				)
public class RunMyParamScenarioTest {

}
