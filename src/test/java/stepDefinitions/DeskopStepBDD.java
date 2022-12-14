package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DesktopPageBDD;

public class DeskopStepBDD extends Base {

	DesktopPageBDD obj = new DesktopPageBDD();

	@Given("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		obj.clickOnDesktops();
		logger.info("Desktops tab clicked successfully");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		obj.clickOnShowAllDesktops();
		logger.info("Show all desktops link clicked succesfully");
	}

// 	Scenario: User verify all items are present in Desktops tab

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopElements = obj.desktopItems();
		for (WebElement element : desktopElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + "is present");
		}
	}

//	Scenario: User add HP LP 3065  from Desktops tab to the cart

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		obj.clickOnHpLp3065();
		logger.info("LP HP3065 clicked sucessfully");

	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		obj.slectQuanity(string);
		logger.info("Quantity selected sucesfully");
	}

	@Then("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		obj.clickAddToCartBtn();
		logger.info("Quanity added successfully");
	}

	@Then("User should see a Message {string}")
	public void user_should_see_a_message(String string) {
		obj.HPLPSuccessMessage();
		 logger.info("Success massage varified");
//		Assert.assertEquals(obj.successMsg(), expectedMssage);
//		logger.info(expectedMssage + "equals to "+ obj.successMsg());
//		Assert.assertTrue(obj.cannonSuccessMassage());
//		logger.info("Success msg varified");

//	Scenario: User add Canon EOS 5D from Desktops tab to the cart		
	}

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		obj.clickOnEOS5DCamera();
		logger.info("Canon EOS Camera successfully");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		obj.selectOnDropDownFeild();
		logger.info("dropDown clicked succesfully");
	}

//	Scenario: User add a review to Canon EOS 5D item in Desktops tab

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		obj.clickOnCanonEOSLink();
		logger.info("Canon EOS 5D item clicked sucessfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		obj.clickOnReviewLink();
		logger.info("Review link clicked succsefully");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		obj.enterYourName(data.get(0).get("yourname"));
		obj.enterReview(data.get(0).get("yourReview"));
		obj.selectRating(data.get(0).get("Rating"));
		logger.info("review form filled succesfully");

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		obj.clickOnReviewContinuteButton();
		logger.info("Review continue clciked succesffuly");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	   obj.reviewSubmissionMessage();
	   logger.info("Review submission message varified");
	}	
}
