package com.basic.Multi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/Multi/" },
							
				glue =		{	"com/basic/Multi/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report6.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html",
							}
				)
public class RunMyMultiTest {

}
