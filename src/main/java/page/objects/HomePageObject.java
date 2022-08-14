package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// 1 scenario
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyTab;
	
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement selectCurrency;
	
	@FindBy(xpath = "//strong[text()='€']")
	private WebElement currencyEuro;
	
	// 2 scenario
	
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement housePageShoppingCart;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyShoppingCartMessage;
	
	// 1
	
	public void clickOnCurrencyTab() {
		currencyTab.click();
	}
	
	public void selectCurrency() {
		selectCurrency.click();
	}
	
	public void chosenCurrency(String expectedText) {
		String actualText = Utils.getText(currencyEuro);
		Assert.assertEquals(expectedText, actualText);
	}
	
	// 2
	
	public void clickOnShoppingCart() {
		housePageShoppingCart.click();
	}
	
	public void nothingIsInShoppingCart (String expectedText) {
		String actualText = Utils.getText(emptyShoppingCartMessage);
		Assert.assertEquals(expectedText, actualText);
	}

}
