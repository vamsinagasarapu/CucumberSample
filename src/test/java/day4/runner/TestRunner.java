package day4.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import day4.stepdefinition.BookingSteps1;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features2", tags= {"@Room_Type, @Rooms, @AdultsCount, @ChildrenCount"}, glue= {"day4.stepdefinition"})
public class TestRunner {
	

}
