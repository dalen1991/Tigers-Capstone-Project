package step.definition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {
	
	HomePageObject homePage = new HomePageObject();
    
	// 1 scenario
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrencyTab();
		logger.info("User cliked on Currency tab");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.selectCurrency();
		logger.info("User chose Euro");
	}

	@Then("currency value should change to Euro {string}")
	public void currency_value_should_change_to_euro(String string) {
		homePage.chosenCurrency(string);
		logger.info("Currency value was changed to Euro");
		Utils.takeScreenshotForStep();
	}
	
	// 2 scenario
	    
	    @When("User click on shopping cart")
	    public void user_click_on_shopping_cart() {
	    	homePage.clickOnShoppingCart();
	    	logger.info("User clicked on home page Shopping cart icon");
	}

	    @Then("{string} message should display")
	    public void message_should_display(String string) { 
	    	homePage.nothingIsInShoppingCart(string);
	    	logger.info("User see the message 'Your shopping cart is empty' ");
	    	Utils.takeScreenshotForStep();	    	
    }
	    
	    
}
