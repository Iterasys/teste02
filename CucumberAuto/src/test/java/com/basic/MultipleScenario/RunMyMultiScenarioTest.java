package com.basic.MultipleScenario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/MultipleScenario/" },
							
				glue =		{	"com/basic/MultipleScenario/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report7.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html",
							}
				)
public class RunMyMultiScenarioTest {

}
