package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

public class Initializer extends Base{

	//In Initializer class we will write or define our beforeHooks and afterHooks method and they are
	//both coming from io.cucumber
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " + scenario.getName() + " started");
		browser();
		openBrowser();
		Utils.verify = scenario;
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		//we can also write code to capture screenshot if our test fails
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test");
		}else {
			tearDown();
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		}
	}

	
}
