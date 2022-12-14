package stepDefinitions;

import static org.junit.Assert.assertTrue;

import core.Base;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.LaptobNoteBookPageBDD;

public class LaptopNoteBookStepBDD extends Base{

	LaptobNoteBookPageBDD obj = new LaptobNoteBookPageBDD();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		obj.clickOnLaptopAndNotebookTab();
		 logger.info("Laptop and Notebook link clicked successfully");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	   obj.clickOnShowAllLaptopAndNotebookLink();
	   logger.info("Show all Laptop and Notebook option clicked successfully");
	}

//	 Scenario: Add and Remove a Mac book from Cart
	
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		 obj.clickOnMacBookLink();
	    logger.info("Mac book link clicked successfully");  
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		 Assert.assertTrue(obj.varifyCartItems());
	   logger.info("item 602 showed successfully");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		obj.clickOnCartOption();
		 logger.info("Cart option clicked successfully");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		  obj.clickOnXButton();
	    logger.info("Red X button link clicked successfully");
	}
	
	@Then("item should be removed and cart should show {int} items")
	public void item_should_be_removed_and_cart_should_show_items(Integer int1) {
		Assert.assertTrue(obj.confirmNoItemInTheCart());
		 logger.info("No item in the cart confirmed");
	}

//	  Scenario: Product Comparison
	
	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	  obj.clickOnMakBookProductComparison();
	  logger.info("User clicked on product comparison icond on MacBook");
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	  obj.clickOnMacBookAirProdcutComparison();
	  logger.info("User clicked product comparison icon on MacBook Air");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	   obj.clickOnProdcutComparisonLink();
	   logger.info("User clicked on Product comparison link successfully");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	   Assert.assertTrue(obj.productComparisonChartpresent());
	   logger.info("Product comparison chart varified successfully");
	   
	}

//	  Scenario: Adding an item to Wish list
	
	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	   obj.clickOnHeartIcon();
	   logger.info("User clicked on Heart icon to addSony VaIO laptop added to wish list" );
	}


	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expected) {
		String expectedMessageFromUI = expected;
	    String actualMessageFromUI = obj.getLoginOrCreatAccountMessage();
	    Assert.assertEquals(actualMessageFromUI, expectedMessageFromUI);
	    logger.info("User get the message: You must login or create an account to save Sony VAIO to your wish list! successfully");		
		
//		Assert.assertTrue(obj.isMessagePresent());
	    
	    
//	 Scenario: Validate the price of MacBook Pro is 2000
	}	
	
	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
	   obj.clickOnMacBookPro();
	   logger.info("User clicked on makBook pro successfully");
	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	   Assert.assertTrue(obj.macBookPriceTagPresent());
	   logger.info("Price tag presence varified succesfully");
	}

	
}
