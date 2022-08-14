package step.definition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject laptopPage = new LaptopNoteBooksPageObject();

	// 1 scenario

	@When("User click on Laptops & NoteBooks tab")
	public void user_click_on_laptops_note_books_tab() {
		laptopPage.clickOnLaptopsAndNotebooks();
		logger.info("Laptops & NoteBooks tab was clicked successfully");
	}

	@When("User click on Show all Laptops & NoteBooks")
	public void user_click_on_show_all_laptops_note_books() {
		laptopPage.clickOnShowAllLaptops();
		logger.info("Show All  Laptops & NoteBooks link was clicked successfully");
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopPage.clickOnMacbookItem();
		logger.info("User clicked on MacBook item");
	}

	@Then("User should get a message1 {string}")
	public void user_should_get_a_message1(String string) {
		laptopPage.isMacBookAddSuccessMessagePresent();
		logger.info("User is able to see success message" );
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		laptopPage.isCartTotalPresent();
		logger.info("User is able to see cart total");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopPage.clickOnCartOption();
		logger.info("User clicked on cart option button");
	}

	@Then("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopPage.clickOnRemoveButton();
		logger.info("User was able to remove item from the cart");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		laptopPage.compareTotalPrice(string);
		logger.info("User can see that he doesn't have to pay anything");
		Utils.takeScreenshotForStep();
	}

	// 2 scenario

	@When("user click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopPage.clickOnCompareMacBook();
		logger.info("User clicked on MacBook comparison icon");
	}

	@When("User click on product comparison icon on MacBookAir")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopPage.clickOnCompareMacBookAir();
		logger.info("User clicked on MacBookAir comparison icon");
	}

	@Then("User should get a message2 {string}")
	public void user_should_get_a_message2(String string) {
		laptopPage.isMacBookAirAddedToComparePresent();
		logger.info("User should see MacBookAir added to compare message");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopPage.clickOnProductCompareLink();
		logger.info("User was able to click on Product comparison link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopPage.isProductCompareChartPresent();
		logger.info("User is able to see Product Comparison Chart");
		Utils.takeScreenshotForStep();
	}

	// 3 scenario

	@When("User click on heart icon to add Sony VAIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_vaio_laptop_to_wish_list() {
		laptopPage.clickOnAddingSonyVAIOToWishList();
		logger.info("User cliked on adding to wish list Sony VAIO icon");
	}

	@Then("User should get a message3 {string}")
	public void user_should_get_a_message3(String string) {
		laptopPage.isMustLoginAlertPresent();
		logger.info("User should see message that he needs to login or create an account to be able to save item to wish list");
		Utils.takeScreenshotForStep();
	}

	// 4 scenario

	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		laptopPage.clickOnMacBookProItem();
		logger.info("User clicked on MacBookPro item");
	}

	@Then("User should see {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		laptopPage.actualPriceForMacBookPro(string);
		logger.info("User can see $2000.00 price tag for chosen item");
		Utils.takeScreenshotForStep();
	}

}
