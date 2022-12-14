package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import pageObjects.RegisterPageObj;
import utilities.Utils;

public class RegisterSteps extends Base{

	RegisterPageObj registerpageobj = new RegisterPageObj();
	
//	@When("I click on my Account button")
//	public void I_click_on_my_Account_button() {
		
//	}

	@When("I click on register link")
	public void i_click_on_register_link() {
		registerpageobj.clickOnRegisterLink();
		logger.info("Register link clicked successfully");
	}

	@When("i fill registration form")
	public void i_fill_registration_form(DataTable dataTable) {
	
		List <Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		registerpageobj.enterFirstName(data.get(0).get("firstname"));
		registerpageobj.enterLastName(data.get(0).get("lastname"));
		registerpageobj.enterEmail(data.get(0).get("email"));
		registerpageobj.enterPhoneNumber(data.get(0).get("telephone"));
		registerpageobj.enterPassword(data.get(0).get("password"));
		registerpageobj.enterConfirmPassword(data.get(0).get("confrimpassword"));
		
		logger.info("Registration form filled out successfully");
		
	}

	@When("i suscribe to newsletter")
	public void i_suscribe_to_newsletter() {
		registerpageobj.clickOnSubscriptionRdioBtn();
		logger.info("Subscribtion button clicked successfully");
	}

	@When("i agree to privacy policy")
	public void i_agree_to_privacy_policy() {
		registerpageobj.clickOnPrivacayPolicyBtn();
		logger.info("Privacy Policy btn clicked successfully");
	}

	@When("i click on continue button")
	public void i_click_on_continue_button() {
		registerpageobj.clickOnContinueBtn();
		logger.info("Continue btn clicked successfully");
	}

	@When("i validate my account is created sucessfully")
	public void i_validate_my_account_is_created_sucessfully() {
		String actualText =registerpageobj.getRegisterationConfText();
		String expectedText = "Your Account Has Been Created!";
		Assert.assertEquals(expectedText, actualText);
		logger.info("Actual text varified successfully");
	
}
}