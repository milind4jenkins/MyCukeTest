package com.test.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/test/features",
		glue= {"com.test.seleniumGlueCode"}
		
		
		)


public class testRunner {
	

}
