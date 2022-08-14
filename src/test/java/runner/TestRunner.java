package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

	//     Cucumber Option, by using these option we can glue our features with stepDefinition methods and by using
	//     other option, we can add the feature, scenario or scenario outline tag and run those specific test
	//     dryRun = If set this to true, it will check and make sure we have stepDefinition methods for each of the
	//  test step in our feature files, but if we set this to false, then it will run all of the tests that we have added
	//     monochrome = will help us to print the stepDefinition methods in clean format in the console and we have to set this to true	
         
       @RunWith(Cucumber.class)
	   @CucumberOptions(
			   features = "classpath:features",
			   glue = "step.definition",
			   tags = "@retailAll",
			   dryRun = false,
			   strict = true,
			   monochrome = true,
				plugin = {
						"pretty",
						"html:target/site/cucumber-pretty",
						"json:target/cucumber.json"
				},
				publish = true
				)
     public class TestRunner {
    	   @AfterClass
			public static void generateReport() {
				CucumberReportingConfig.reportConfig();
    	   }
	
       }
