package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PavanLoginPage extends Base{
	
	public PavanLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//strong[contains(text(),'Welcome, please sign in!')]")
	private WebElement mainPage;
	@FindBy(id= "Email")
	private WebElement idField;
	
	@FindBy(id="Password")
	private WebElement passField;	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement logInBtnField;
	
	@FindBy(xpath = "//div[@class ='content-header']/h1")
	private WebElement dashBoardTxt;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logOutBtn;
	
	@FindBy(xpath = "/strong[contains(text(),'Welcome, please sign in!')]")
	private WebElement logoutFiled;

		 
	public String validaMainPage() {	
		String text = mainPage.getText();
		return text; 
	}
	public void enterEmail(String email) {
		idField.clear();
		idField.sendKeys(email);
	}

	public void enterPassword(String pass) {
		passField.clear();
		passField.sendKeys(pass);
	}
	

	public void clickLogin() {
		logInBtnField.click();;
	}
	
	public String logInVarification() {
		String dashText = dashBoardTxt.getText();
		return dashText;
	}
	
	public void logOut() {
		logOutBtn.click();
	}
	
	public String logoutValidation() {
		String logoutText = logoutFiled.getText();
		return logoutText;
	}
	 
	
	// Scenario 2
	
//	@FindBy (xpath="")
//	private WebElement 
	By customerMenu = By.xpath ("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]");
	By customerMenueItem = By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]");
	By addNewButton = By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]");
	By addEmailAddress = By.xpath("#Email");
	By addPassword = By.xpath("#Password");
	By addFirstName = By.id("FirstName");
	By addLastName = By.id("LastName");
	By clickOnGender = By.id("Gender_Male");
	By selectCustomerRule = By.xpath("//body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By companyName = By.xpath("#Password");
	By isTaxExempt = By.xpath("#Password");
	By newsLetter = By.xpath("#Password");
	By addCommnet = By.xpath("#Password");
	By saveButton = By.xpath("//button[@name='save']/i");
	 
	public void clickOnCustomersMenu() {
		driver.findElement(customerMenu).click();
	}
	
	public void clickOnCustomerMenuItem() {
		driver.findElement(customerMenueItem).click();
	}
	public void clickOnAddNew() {
		driver.findElement(addNewButton).click();
	}
	
	public void addEmail(String email) {
		driver.findElement(addEmailAddress).sendKeys(email);
	}
	
	public void addPass(String password) {
		driver.findElement(addEmailAddress).sendKeys(password);
	}
	
	public void adFirstName(String firstName) {
		driver.findElement(addFirstName).sendKeys(firstName);
	}
	public void adLastName(String lastName) {
		driver.findElement(addLastName).sendKeys(lastName);
	}
	
	public void clickOnGender() {
		driver.findElement(clickOnGender).click();
	}
//	public void selectDOB(String password) {
//		driver.findElement(clickOnGender).click();
//	}
	
	public String slectCustomerRule(String role) {
		if (role.equals("Vendor")){
			driver.findElement(selectCustomerRule).click();
		}else if (role.equals("Guest")) {
			driver.findElement(selectCustomerRule).click();
		}else if (role.equals("Registerd")) {
			driver.findElement(selectCustomerRule).click();
		}
		return role;
	}
	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}
	
//	public String userConfirmationMessage() {
//		driver.findElement()
//	}
}