package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePagePageObj extends Base{

	public HomePagePageObj () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktopLink;
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']" )
	private WebElement laptopAndNotBookLink;
	
//	@FindBy (xpath = "//a[text()='Tablets']")
//	private WebElement tabletsLink;
	
	@FindBy (xpath = "//a[text()='Tablets']")
	private WebElement tabletsLink;
	
	@FindBy (xpath = "//a[text()='Software']")
	private WebElement softwareLink;
	
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phoneAndPadsLink;
	
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement camerasLink;
	
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3PlayersLink;
	
	public void compareTextDesktopLink(String expectedText) {
		String actualText = Utils.getTextFromUI(desktopLink);
		Assert.assertEquals(expectedText, actualText);
	}
	
	public void compareTextlaptopAndNotBookLink(String expectedText) {
		String actualText = Utils.getTextFromUI(laptopAndNotBookLink);
		Assert.assertEquals(expectedText, actualText);
	}
	
//	public void compareTextComponentsLink(String expectedText) {
//		String actualText = Utils.getTextFromUI(tabletsLink);
//		Assert.assertEquals(expectedText, actualText);
//	}
	public void compareTextTabletsLink(String expectedText) {
		String actualText = Utils.getTextFromUI(tabletsLink);
		Assert.assertEquals(expectedText, actualText);
	}
	
	public void compareTextSoftwareLink(String expectedText) {
		String actualText = Utils.getTextFromUI(softwareLink);
		Assert.assertEquals(expectedText, actualText);
	}
	
	public void compareTextPhonesAndPDAsLink(String expectedText) {
		String actualText = Utils.getTextFromUI(phoneAndPadsLink);
		Assert.assertEquals(expectedText, actualText);
	
	}	
	public void compareTextCamerasLink(String expectedText) {
		String actualText = Utils.getTextFromUI(camerasLink);
		Assert.assertEquals(expectedText, actualText);
	}
	
	public void compareTextMP3PlayersLink(String expectedText) {
		String actualText = Utils.getTextFromUI(mp3PlayersLink);
		Assert.assertEquals(expectedText, actualText);
	}
}
