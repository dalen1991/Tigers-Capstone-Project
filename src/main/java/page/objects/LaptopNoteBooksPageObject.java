package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	// 1 scenario
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptops;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptops;
	
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookItem;
	
	@FindBy(xpath = "(//a[text()='MacBook'])[3]")
	private WebElement macBookSuccessmessage;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement macBookAddSuccessmessage;
	
	@FindBy(id = "cart-total")
	private WebElement cartTotal;
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeButton;
	
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement zeroTotalMessage;
	
	// 2 scenario
	
	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement comparisonMacBook;
	
	@FindBy(xpath = "(//button[@type='button'])[17]")
	private WebElement comparisonMacBookAir;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement compareSuccessMessage;
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productCompareLink;
	
	@FindBy(id = "content")
	private WebElement productComparisonChart;
	
	// 3 scenario 
	
	@FindBy(xpath ="(//button[@type='button'])[22]")
	private WebElement wishListButtonSonyVAIO;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement mustLoginAlert;
	
	// 4 scenario
	
	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement itemMacBookPro;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTagMacBookPro;
	
	
	//1
	public void clickOnLaptopsAndNotebooks() {
		laptops.click();
	}
	
	public void clickOnShowAllLaptops() {
		showAllLaptops.click();
	}
	
	public void clickOnMacbookItem() {
		macBookItem.click();
	}
	
	public boolean isMacBookAddSuccessMessagePresent() {
		if (macBookAddSuccessmessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean isCartTotalPresent() {
		if(cartTotal.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnCartOption() {
		cartTotal.click();
	}
	
	public void clickOnRemoveButton() {
		removeButton.click();
	}
	
	public void compareTotalPrice(String expectedText) {
		String actualText = Utils.getTextFromUI(zeroTotalMessage);
		Assert.assertEquals(expectedText, actualText);
	}
	
	//2
	
	public void clickOnCompareMacBook() {
		comparisonMacBook.click();
	}
	
	public void clickOnCompareMacBookAir() {
		comparisonMacBookAir.click();
	}
	
	public boolean isMacBookAirAddedToComparePresent() {
		if (compareSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnProductCompareLink() {
		productCompareLink.click();
	}
	
	public boolean isProductCompareChartPresent() {
		if (productComparisonChart.isDisplayed())
			return true;
		else
			return false;
	}
		
	//3
	
	public void clickOnAddingSonyVAIOToWishList() {
		wishListButtonSonyVAIO.click();
	}
	
	public boolean isMustLoginAlertPresent() {
		if(mustLoginAlert.isDisplayed())
			return true;
		else
			return false;
	}
	
	//4
	
	public void clickOnMacBookProItem() {
		itemMacBookPro.click();
	}
	
	public void actualPriceForMacBookPro(String expectedText) {
		String actualText = Utils.getText(priceTagMacBookPro);
		Assert.assertEquals(expectedText, actualText);
	}
		
}
