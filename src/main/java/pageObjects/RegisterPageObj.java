package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.Utils;

import core.Base;

public class RegisterPageObj extends Base{

public RegisterPageObj() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath= "//a[text() = 'Register']")
	private WebElement registerLink;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	
	@FindBy(xpath= "//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy (xpath = "//input[@id='input-confirm']")
	private WebElement confirmPassField;
	
	@FindBy (xpath = "//div//label[@class='radio-inline']//input[@value='1']")
	private WebElement subscribtionRadioButtonField;
	
	@FindBy(xpath ="//input[@type='checkbox']")
	private WebElement privacyPolicyButton;
	
	@FindBy(css = "input[value='Continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement registerationConfText;
	
	
	
	public  void clickOnRegisterLink() {
		registerLink.click();
	}
	
	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName (String lastName) {
		lastNameField.sendKeys(lastName);
	}
	 public void enterEmail (String email) {
		 emailField.sendKeys(email);
	 }

	 public void enterPhoneNumber (String phoneNumber) {
		 telephoneField.sendKeys(phoneNumber);
	 }
	 public void enterPassword (String password) {
		 passwordField.sendKeys(password);
	 }

	 public void enterConfirmPassword (String confirmPass) {
		 confirmPassField.sendKeys(confirmPass);
	 }
	 
	 public void clickOnSubscriptionRdioBtn() {
		 
		subscribtionRadioButtonField.click();
	 }
	 
	 public void clickOnPrivacayPolicyBtn() {
		 privacyPolicyButton.click();
	 }
	 
	 public void clickOnContinueBtn () {
		 continueBtn.click();
	 }
	 
	 public String getRegisterationConfText() {
		String actualMessage = registerationConfText.getText();
		return actualMessage;
		
	
	 }
}

