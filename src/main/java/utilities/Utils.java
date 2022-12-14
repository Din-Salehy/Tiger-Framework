package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Scenario;

public class Utils {

	public static Scenario verify;
//	public static void hoverMouseOverElement (WebElement element) {
//		Actions action = new Actions (driver);
//		action.moveToElement(element).perform();
//	}	
	
	public static String getTextFromUI(WebElement element) {
	String textFromUI = element.getText();
	return textFromUI;
	
	
		}
	public static void clickOnRadioButton(WebElement element) {
		try {
			if (element.isDisplayed()==true&& element.isEnabled()==true&&element.isSelected()==false) {
				element.click();
			}else {
				System.out.println("One of the condition did not return expexcted value");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//read test data from testData.properties file
	public static String getData(String key) {
		String testDataPath = ".\\src\\test\\resources\\input\\testData.properties";
		Properties property = null;
		try {
		FileReader reader = new FileReader(testDataPath);
		property = new Properties();
		property.load(reader);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		return property.getProperty(key);
		}
	
	public static boolean successMessage(WebElement element) {
		if(element.isDisplayed())
			return true;
		else
		return false;
	}
}
