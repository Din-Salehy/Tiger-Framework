package stepDefinitions;

import org.junit.Assert;

import core.Base;

import io.cucumber.java.en.*;
import pageObjects.DesktopItemsPageObj;

public class DektopItemsSteps extends Base  {

	DesktopItemsPageObj  desktoppageobj = new DesktopItemsPageObj();
	
	@Given("I am on Test Environment page")
	public void i_am_on_test_environment_page() {
		desktoppageobj.getTextFromEnvironmentText();
		logger.info("Text Test Environment was verified");
	}

	@When("I hover my mouse over desktop dropdown")
	public void i_hover_my_mouse_over_desktop_dropdown() {
		desktoppageobj.clickOnDekstopLink();
		logger.info("Mouse moved to Desktop Link Successfully");
	}
	
	@Then("I see show all deskptop link")
	public void i_see_show_all_deskptop_link() {
	String actualText	= desktoppageobj.getShowAllDesktopText();
	String expectedText = "Show All Desktops";
	System.out.println("Show All desktop text " + expectedText);
	Assert.assertEquals(expectedText, actualText);
	logger.info("Show all Desktop text was varified");
	
		
	}

	@Then("I click on shpw all desktops link")
	public void i_click_on_shpw_all_desktops_link() {
		desktoppageobj.clickOnShowAllDeskptopLink();
		logger.info("Show all Desktop link clicked successfully" );
	}

	@Then("I validate the Tablets tab on the UI")
	public void i_validate_the_tablets_tab_on_the_ui() {
		String actualText = desktoppageobj.getTabletTextFromUI();
		System.out.println("Tablets text printed ===> " +actualText);
		String expectedText = "Tablets";
		Assert.assertEquals(expectedText, actualText);	
		logger.info("Tablets text varified successfully");
				
	}
	
}
