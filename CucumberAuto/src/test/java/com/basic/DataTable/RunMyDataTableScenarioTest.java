package com.basic.DataTable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/DataTable/" },
							
				glue =		{	"com/basic/DataTable/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report3.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
							}
				)
public class RunMyDataTableScenarioTest {

}
