package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	// 1 scenario

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	// 2 scenario

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;

	@FindBy(id = "input-quantity")
	private WebElement quantityInput;

	@FindBy(id = "button-cart")
	private WebElement addToCartButton;

	@FindBy(xpath = "(//a[text()='HP LP3065'])[2]")
	private WebElement HPLPsuccessmessage;

	// 3 scenario

	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement addToCartButtonCanon;

	@FindBy(xpath = "//select[@id='input-option226']/option[@value='15']")
	private WebElement selectColor;

	@FindBy(xpath = "(//a[text()='Canon EOS 5D Camera'])[2]")
	private WebElement canonSuccessMessage;

	// 4 scenario

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewLink;

	@FindBy(id = "input-name")
	private WebElement yourNameField;

	@FindBy(id = "input-review")
	private WebElement yourReviewField;

	@FindBy(xpath = "//input[@type = 'radio']")
	private List<WebElement> rating;

	@FindBy(id = "button-review")
	private WebElement ReviewContinueButton;

	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]")
	private WebElement reviewSubmissionMessage;

	public String getTestEnvironmentText() {
		String textFromUI = testEnvironmentText.getText();
		return textFromUI;
	}

	public void clickOnDesktops() {
		desktops.click();
	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	public List<WebElement> desktopsItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}

	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}

	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public String successMessage() {
		String actualResult = "Success: You have added " + HPLPsuccessmessage.getText() + " to your shopping cart!";
		return actualResult;
	}

	public boolean isSuccessMessagePresent() {
		if (HPLPsuccessmessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnAddEOS5DCanonItem() {
		addToCartButtonCanon.click();
	}

	public void selectColor() {
		selectColor.click();
	}

	public String successMessageCanon() {
		String actualResult = "Success: You have added " + canonSuccessMessage.getText() + " to your shopping cart!";
		return actualResult;
	}

	public boolean isSuccessMessagePresentCanon() {
		if (canonSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}

	public void clickOnReviewLink() {
		writeReviewLink.click();
	}

	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for (WebElement element : ratingElements) {
			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
	}

	public void clickOnContinueButton() {
		ReviewContinueButton.click();
	}

	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}

	public void enterYourReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}

	public boolean isReviewSubMessagePresent() {
		if (reviewSubmissionMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public String successReviewMessage() {
		String actualResult = "Thank you for your review. It has been submitted to the webmaster for approval.";
		return actualResult;
	}

}
