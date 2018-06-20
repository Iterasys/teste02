package com.basic.DataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/DataDriven/" },
							
				glue =		{	"com/basic/DataDriven/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report2.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
							}
				)
public class RunMyDataDrivenScenarioTest {

}
