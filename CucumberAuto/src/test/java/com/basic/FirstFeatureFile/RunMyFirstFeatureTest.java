package com.basic.FirstFeatureFile;

//import java.io.File;
//import java.io.FileReader;

//import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/com/basic/FirstFeatureFile/" },
							
				glue =		{	"com/basic/FirstFeatureFile/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report4.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport4.html"
							}
				)
public class RunMyFirstFeatureTest {
	//@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager));
	}
	
}
