package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptobNoteBookPageBDD extends Base {

	public LaptobNoteBookPageBDD() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNotebookField;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopAndNotebookField;

	public void clickOnLaptopAndNotebookTab() {
		laptopAndNotebookField.click();
	}

	public void clickOnShowAllLaptopAndNotebookLink() {
		showAllLaptopAndNotebookField.click();
	}

//	Scenario: Add and Remove a Mac book from Cart @Failed success msg

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MakBookField;

	@FindBy(id = "button-cart")
	private WebElement addToCartButtonFeild;

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement addToCartSuccessMessage;

//	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]/a[1]")
//	private WebElement macBookTextField;
//	
//	@FindBy( xpath = "//*[@id=\"product-product\"]/div[1]/a[2]")
//	private WebElement shopingCartTextFeild;

	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement cartViewField;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement clickOnCartOptionField;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement redXButtonField;

	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement noitemCartFeild;

	public void clickOnMacBookLink() {
		MakBookField.click();
	}

	public void clickOnAddToCartButton() {
		addToCartButtonFeild.click();
	}

	public boolean isSuccesMsgPresent() {
		if (addToCartSuccessMessage.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean varifyCartItems() {
		if (cartViewField.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnCartOption() {
		clickOnCartOptionField.click();
	}

	public void clickOnXButton() {
		redXButtonField.click();
	}

	public boolean confirmNoItemInTheCart() {
		if (noitemCartFeild.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

//	  Scenario: Product Comparison @Falied comparison chart

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[3]")
	private WebElement macBookComparisonField;

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement macBookAirComparisonField;

//	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
//	private WebElement comparisonSuccessMsgField;

	@FindBy(xpath = "//div/a[text()='MacBook Air']")
	private WebElement MacBookSuccessMsgText;
	
	@FindBy(xpath = "//div/a[text()='product comparison']")
	private WebElement productComparisonText;
	
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonField;

	@FindBy(xpath = "//table[@class='table table-bordered']")
	private WebElement prodcutComparisonChartField;

//	@FindBy(xpath = "//*[@id=\\"content\\\"]/h1")
//	private WebElement productComparisonChart;

	public void clickOnMakBookProductComparison() {
		macBookComparisonField.click();
	}

	public void clickOnMacBookAirProdcutComparison() {
		macBookAirComparisonField.click();
	}

	public String comparisonSuccessMessage() {
		String actualMessage=" Success: You have added "+MacBookSuccessMsgText.getText() +"to your "+productComparisonText.getText()+"!";
		return actualMessage;
		
	}	
	
//	public boolean productComparisonSuccessMsg() {
//		if (comparisonSuccessMsgField.isDisplayed()) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}

	public void clickOnProdcutComparisonLink() {
		productComparisonField.click();
	}

	public boolean productComparisonChartpresent() {
		if (prodcutComparisonChartField.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

//  Scenario: Adding an item to Wish list	@Passed

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement wishListField;

	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])/text()[1]")
	private WebElement youMust;
	
	@FindBy(xpath = "//a[text()='login']")
	 private WebElement loginInTheMessage;
	    
	@FindBy (xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[2]")  
	private WebElement or;
	   
	@FindBy(xpath = "//a[text()='create an account']")
	 private WebElement createAnAccountInTheMessage;
	    
	@FindBy (xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[3]")
	 private WebElement toSave;
	    
	@FindBy(xpath = "(//a[text()='Sony VAIO'])[1]")
	 private WebElement SonyVAIOInTheMessage;
	    
	@FindBy (xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[4]")
	 private WebElement toYour;
	    
	@FindBy(xpath = "(//a[text()='wish list'])[1]")
	 private WebElement wishListInTheMessage;
	
	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]")
	private WebElement wishListMessage;

	public void clickOnHeartIcon() {
		wishListField.click();
	}

	   public String getLoginOrCreatAccountMessage() {
	        String actualResult ="You must " + loginInTheMessage.getText() + " or " + createAnAccountInTheMessage.getText() + " to save " + SonyVAIOInTheMessage.getText() + " to your " + wishListInTheMessage.getText() + "!";
	        return actualResult;
	        
	   }
//	public boolean isMessagePresent() {
//		if (wishListMessage.isDisplayed()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	 Scenario: Validate the price of MacBook Pro is 2000-@Passed

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProField;

	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPricetag;

	public void clickOnMacBookPro() {
		macBookProField.click();
	}

	public boolean macBookPriceTagPresent() {
		if (macBookProPricetag.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}
