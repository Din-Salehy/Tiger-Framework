package stepDefinitions;

import core.Base;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.HomePageBDD;

public class HomePageStepBDD extends Base{

	HomePageBDD obj = new HomePageBDD();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
	obj.clickOnCurrency();
	logger.info("User clicked on currency successfuly");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		obj.selectEuroCurrency();
		logger.info("User clicked on currency");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	  Assert.assertTrue(obj.currencyValueChange());
	  logger.info("Currency value change to Euro Varified");
	}
//	Scenario: User empty Shopping cart message displays 
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	  obj.clickOnShoppingCart();
	  logger.info("User clicked on shopping card successfully");
	}

	@Then("Your shopping cart is empty! message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	   Assert.assertTrue(obj.shopingCartEmptyText());
	   logger.info("Your shoping is empty text varified");
	}
}
