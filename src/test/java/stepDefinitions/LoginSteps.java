package stepDefinitions;
import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.LoginPageObj;

public class LoginSteps extends Base {

LoginPageObj loginpageobj = new LoginPageObj();
	
	@Given("I am on Test Environment Home Page")
	public void I_am_on_Test_Environment_Home_Page() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = loginpageobj.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Text Test Environment was verified");
	}
	@When("I click on My Account button")
	public void I_click_on_My_Account_button() {
		loginpageobj.clickOnMyAccountButton();
		logger.info("My Account button was clicked successfully");
	}
	@And("I click on my Login link")
	public void I_click_on_my_Login_link() {
		loginpageobj.clickOnLoginLink();
		logger.info("Login link was clicked successfully");
	}
	@And("I enter my username and password")
	public void I_enter_my_username_and_password() {
		loginpageobj.enterEmail("johncolunga2399@gmail.com");
		loginpageobj.enterPassword("johncolunga2399");
		logger.info("Email and password were entered successfully");
	}
	@And("I click on login button")
	public void I_click_on_login_button() {
		loginpageobj.clickOnLoginButton();
		logger.info("Login button was clicked successfully");
	}
	@Then("I am logged into my Test Environment account")
	public void I_am_logged_into_my_Test_Environment_account() {
		String expectedText = "My Account";
		String ActualText = loginpageobj.getTextAfterLogin();
		Assert.assertEquals(expectedText, ActualText);
		logger.info("My Account text was verified successfully");
	}
	
	@When("I enter my username {string} and password {string}")
	public void i_enter_my_username_and_password(String username, String password) {
		loginpageobj.enterEmail(username);
		loginpageobj.enterPassword(password);
		logger.info("All three users were able to login successfully");
	}
	
}

