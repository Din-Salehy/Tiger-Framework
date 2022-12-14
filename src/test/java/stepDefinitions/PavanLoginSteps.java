package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.Base;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageObjects.PavanLoginPage;

public class PavanLoginSteps extends Base {

	PavanLoginPage obj = new PavanLoginPage();
	

	@When("user opens URL")
	public void user_opens_url() {
	  String actualText = obj.validaMainPage();
	  String expectedTdxt = "Welcome, please sign in!";
	  Assert.assertEquals(actualText, expectedTdxt);
	}

	@When("user enter email as")
	public void user_enter_email_as() {
		obj.enterEmail("admin@yourstore.com");
		logger.info("email passed");
	}

	@When("user enter password as")
	public void user_enter_password_as() {
	    obj.enterPassword("admin");
	    logger.info("passwrod passed");
	}

	@Then("user click on login")
	public void user_click_on_login() {
	 obj.clickLogin(); 
	 logger.info("Login passed");
	}

	@Then("user should see page title")
	public void user_should_see_page_title() {
	  String actualText = obj.logInVarification();
	  String expectedTitle = "Dashboard";
	  Assert.assertEquals(actualText, expectedTitle);
	  logger.info("Login title validation passed");
	  
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	  obj.logOut();
	  logger.info("Login out passed");  
	}
	
	@Given("user click on customers menu")
	public void user_click_on_customers_menu() {
	   obj.clickOnCustomersMenu();
	   logger.info("customer menu click passed");
	}

	@When("user click on customer menu item")
	public void user_click_on_customer_menu_item() {
	    obj.clickOnCustomerMenuItem();
	    logger.info("Customer menu item click passed");
	}

	@When("user click on add new button")
	public void user_click_on_add_new_button() {
	    obj.clickOnAddNew();
	    logger.info("Add new button click passed");
	}

//	@When("user can view new customer page")
//	public void user_can_view_new_customer_page() {
//	    obj
//	}

	@When("user enter customer information")
	public void user_enter_customer_information() {
	   obj.addEmail("abc@gmail.com");
	   obj.addPass("abc@1234");
	   obj.adFirstName("John");
	   obj.adLastName("Ju");  
	   obj.slectCustomerRule("Guest");
	   obj.clickOnGender();
	   
	   
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		obj.clickSaveButton();
	}

//	@Then("user can view confirmation message {string}")
//	public void user_can_view_confirmation_message(String string) {
//	   obj.
//	}


}
