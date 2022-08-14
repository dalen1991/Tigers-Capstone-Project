package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {
	DesktopPageObject desktoppageobject = new DesktopPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = desktoppageobject.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User is on Retail website");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktoppageobject.clickOnDesktops();
		logger.info("Desktops tab was clicked successfully");

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktoppageobject.clickOnShowAllDesktops();
		logger.info("Show All Desktop link was clicked successfully");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktoppageobject.desktopsItems();
		for (WebElement element : desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is present");
		}
		Utils.takeScreenshotForStep();
	}

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktoppageobject.clickOnHPLP3065Item();
		logger.info("user clicked Add to Cart Option");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktoppageobject.selectQuantity(string);
		logger.info("user selected quantity " + string);
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktoppageobject.clickOnAddToCartButton();
		logger.info("user clicked add to cart button");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(desktoppageobject.successMessage(), expectedSuccessMessage);
		Assert.assertTrue(desktoppageobject.isSuccessMessagePresent());
		logger.info(expectedSuccessMessage + " equals to " + desktoppageobject.successMessage());
		Utils.takeScreenshotForStep();
		Utils.hardwait();
	}

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktoppageobject.clickOnAddEOS5DCanonItem();
		logger.info("user clicked add to cart button");
		Utils.hardwait();
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktoppageobject.selectColor();
		logger.info("User selected color from dropdown Red");
		Utils.hardwait();		
	}
	
	@Then("User should see a message2 {string}")
	public void user_should_see_a_message2(String expectedSuccessMessage) {
		Assert.assertEquals(desktoppageobject.successMessageCanon(), expectedSuccessMessage);
		Assert.assertTrue(desktoppageobject.isSuccessMessagePresentCanon());
		logger.info(expectedSuccessMessage + " equals to " + desktoppageobject.successMessageCanon());
		Utils.takeScreenshotForStep();
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktoppageobject.clickOnCanonEOS5DCamera();
		logger.info("User cliked on Canon EOS 5D item");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktoppageobject.clickOnReviewLink();
		logger.info("User cliked on write a review link");
	}

	@When("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
		desktoppageobject.enterYourName(reviewInformation.get(0).get("yourname"));
		desktoppageobject.enterYourReview(reviewInformation.get(0).get("yourReview"));
		desktoppageobject.selectRating(reviewInformation.get(0).get("Rating"));
		logger.info("requested information for review is received");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		desktoppageobject.clickOnContinueButton();
		logger.info("user clicked on continue button");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String expectedReviewSuccessMessage) {
		Assert.assertEquals(desktoppageobject.successReviewMessage(), expectedReviewSuccessMessage);
		Assert.assertTrue(desktoppageobject.isReviewSubMessagePresent());
		logger.info("User should see review submitting message");
		Utils.takeScreenshotForStep();
    }
	
	
}
