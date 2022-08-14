package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retailPage = new RetailPageObject();
	
	// Background
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPage.clickOnMyAccountButton();
		logger.info("My Account button was clicked successfully");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPage.clickOnLoginLink();
		logger.info("Login link was clicked successfully");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		retailPage.enterEmail("123789@gmail.com");
		retailPage.enterPassword("12345");
		logger.info("User was able to enter username and password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.clickOnLoginButton();
		logger.info("Login button was clicked successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		String ActualText = retailPage.getTextAfterLogin();
		Assert.assertEquals(expectedText, ActualText);
		logger.info("My Account text was verified successfully");
	}

	// 1 scenario

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.clickOnRegisterAffiliate();
		logger.info("User clicked on Register for an Affiliate");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> affiliateFormInformation = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompanyName(affiliateFormInformation.get(0).get("company"));
		retailPage.enterWebSite(affiliateFormInformation.get(0).get("website"));
		retailPage.taxIDField(affiliateFormInformation.get(0).get("taxID"));
		retailPage.selectPaymentMethod(affiliateFormInformation.get(0).get("paymentMethod"));
		retailPage.enterChequePayeeName(affiliateFormInformation.get(0).get("payeeName"));
		logger.info("requested information for affiliate form is received");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.clickOnAboutUs();
		logger.info("User checked on About us check box");
	}
	
	@When("User click on continue button")
	public void user_click_on_continue_button() {
	    retailPage.clickOnButtonContinue();
	    logger.info("User clicked on continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailPage.isSuccessMessageInfoPresent();
		logger.info("Success message is present");
		Utils.takeScreenshotForStep();
	}
	
	// 2 scenario

	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailPage.clickOnEditAffiliate();
		logger.info("User clicked on Edit affiliate link");
	}

	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.clickOnBankTransferButton();
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> bankInformation = dataTable.asMaps(String.class, String.class);
		retailPage.enterBankName(bankInformation.get(0).get("bankName"));
		retailPage.enterAbaNumber(bankInformation.get(0).get("abaNumber"));
		retailPage.enterSwiftCode(bankInformation.get(0).get("swiftCode"));
		retailPage.enterAccountNameBank(bankInformation.get(0).get("accountName"));
		retailPage.enterAccountNumberBank(bankInformation.get(0).get("accountNumber"));
		logger.info("requested Bank information is received");
	}

	// 3 scenario
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.clickOnEditYourAccountInfo();
		logger.info("User clicked on Edit your account information link ");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> newPersonalInfo = dataTable.asMaps(String.class, String.class);
		retailPage.enterFirstName(newPersonalInfo.get(0).get("firstname"));
		retailPage.enterLastName(newPersonalInfo.get(0).get("lastName"));
		retailPage.enterYourEmail(newPersonalInfo.get(0).get("email"));
		retailPage.enterTelephoneNumber(newPersonalInfo.get(0).get("telephone"));
		Utils.hardwait();
		
	}

	@Then("User should see a new message {string}")
	public void user_should_see_a_new_message(String string) {
		retailPage.isEditInfoMessagePresent();
		logger.info("User should see edit info success message");
		Utils.takeScreenshotForStep();
	}
	
	
}
