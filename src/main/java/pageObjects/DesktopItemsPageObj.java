package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopItemsPageObj extends Base{

	public DesktopItemsPageObj() {
	PageFactory.initElements(driver, this);
	
	}	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textFromEnvironment;
	
	@FindBy (xpath ="//li[@class='dropdown']//a[text()='Desktops']")
	private WebElement desktopLink;
	
	@FindBy(xpath= "//a[text()='Show All Desktops']")
	private WebElement showAllDestopLink;
	
	@FindBy(xpath = "//div[@class='list-group']//a[6]")
	private WebElement tabletsTab;
	
	
	public String getTextFromEnvironmentText() {
		String textFromEnvi=textFromEnvironment.getText();
		return textFromEnvi;
	}
	
	public void hoverMouseOverElement() {
		Actions act = new Actions(driver);
			act.moveToElement(desktopLink);
		}
	
	public void clickOnDekstopLink() {
		desktopLink.click();
	}
	public String getShowAllDesktopText() {
		String showAllDesktopText =showAllDestopLink.getText();
		return showAllDesktopText;
		
	}
	public void clickOnShowAllDeskptopLink() {
		showAllDestopLink.click();
	}
	public String getTabletTextFromUI () {
		String tabletTextFromUI= tabletsTab.getText();
		String text = tabletTextFromUI.substring(0, 7);
		return text;
	
	
	}
}
