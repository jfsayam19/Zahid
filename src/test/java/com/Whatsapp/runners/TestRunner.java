package com.Whatsapp.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "Features",
		glue = "com.Whatsapp.step"
		
		
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
