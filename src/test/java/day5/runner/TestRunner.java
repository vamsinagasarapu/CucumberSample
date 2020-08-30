package day5.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reuse.Reusable;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import day5.stepdefinition.BookingSteps1;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features3", glue= {"day5.stepdefinition"})
public class TestRunner {
	
	@AfterClass
	public static void closeBrowser() {
		
		Reusable.quit();
		
	}
	

}
