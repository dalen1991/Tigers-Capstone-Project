package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Background

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;

	@FindBy(id = "input-email")
	private WebElement emailAddressField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountPage;

	// 1 scenario
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerAffiliate;
	
	@FindBy(id = "input-company")
	private WebElement companyField;
	
	@FindBy(id = "input-website")
	private WebElement webSiteField;
	
	@FindBy(id = "input-tax")
	private WebElement taxField;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;
	
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankButton;
	
	@FindBy(id = "input-cheque")
	private WebElement payeeNameField;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement aboutUsCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement buttonContinue;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageInfo;
	
	// 2 scenario
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateLink;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankNameField;
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaNumberField;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeField;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameBankField;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberBankField;
	
	// 3 scenario
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInfo;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneNumberField;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editInfoSuccessMessage;

	// Background

	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}

	public void clickOnLoginLink() {
		loginLink.click();
	}
	
	public void enterEmail(String email) {
		emailAddressField.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public String getTextAfterLogin() {
		String myAccountText = myAccountPage.getText();
		return myAccountText;
	}

	// 1
	
	public void clickOnRegisterAffiliate() {
		registerAffiliate.click();
	}
	
	public void enterCompanyName(String companyNameValue) {
		companyField.sendKeys(companyNameValue);
	}
	
	public void enterWebSite(String webSiteValue) {
		webSiteField.sendKeys(webSiteValue);
	}
	
	public void taxIDField(String taxIDValue) {
		taxField.sendKeys(taxIDValue);
	}
	
	public void selectPaymentMethod(String paymentType) {
		if(paymentType.trim().equalsIgnoreCase("cheque")) {
			if(!chequeButton.isSelected()) {
				chequeButton.click();
			}
		}else if (paymentType.trim().equalsIgnoreCase("paypal")) {
			paypalButton.click();
		}else
			bankButton.click();
	}
	
	public void enterChequePayeeName(String chequePayeeNameValue) {
		payeeNameField.sendKeys(chequePayeeNameValue);
	}
	
	public void clickOnAboutUs() {
		aboutUsCheckBox.click();
	}
	
	public void clickOnButtonContinue() {
		buttonContinue.click();
	}
	
	public boolean isSuccessMessageInfoPresent() {
		if(successMessageInfo.isDisplayed())
			return true;
		else
			return false;
	}

	// 2
	
	public void clickOnEditAffiliate() {
		editAffiliateLink.click();
	}
	
	public void clickOnBankTransferButton() {
		bankButton.click();
	}
	
	public void enterBankName(String bankNameValue) {
		bankNameField.sendKeys(bankNameValue);
	}
	
	public void enterAbaNumber(String abaNumberValue) {
		abaNumberField.sendKeys(abaNumberValue);
	}
	
	public void enterSwiftCode(String swiftCodeValue) {
		swiftCodeField.sendKeys(swiftCodeValue);
	}
	
	public void enterAccountNameBank(String accountNameValue) {
		accountNameBankField.sendKeys(accountNameValue);
	}
	
	public void enterAccountNumberBank(String accountNumberValue) {
		accountNumberBankField.sendKeys(accountNumberValue);
	}	

	// 3
	
	public void clickOnEditYourAccountInfo() {
		editYourAccountInfo.click();
	}
	
	public void enterFirstName(String firstNameValue) {
		firstNameField.clear();
		firstNameField.sendKeys(firstNameValue);
	}
	
	public void enterLastName(String lastNameValue) {
		lastNameField.clear();
		lastNameField.sendKeys(lastNameValue);
	}
	
	public void enterYourEmail(String emailValue) {
		emailField.clear();
		emailField.sendKeys(emailValue);
	}
	
	public void enterTelephoneNumber(String telephoneNumberValue) {
		telephoneNumberField.clear();
		telephoneNumberField.sendKeys(telephoneNumberValue);
	}
	
	public boolean isEditInfoMessagePresent() {
		if (editInfoSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	

}
