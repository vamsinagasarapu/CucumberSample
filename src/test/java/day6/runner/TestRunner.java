package day6.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reuse.Reusable;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import day6.stepdefinition.BookingSteps1;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features4", glue= {"day6.stepdefinition"},dryRun=false)
public class TestRunner {
	
	@AfterClass
	public static void closeBrowser() {
		
		Reusable.quit();
		
	}
	

}
