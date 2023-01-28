package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testData.TestData;
import utility.Find;

public class CartPage {

	final public static String sDelete = "//*[@value='Delete']";
	final public static String sDeleteBy = "xpath";
	
	final public static String sItemName = "//*[text()=\""+ TestData.sItemName +"\"]";
	final public static String sItemNameBy = "xpath";
	
	
	// WebElement of Delete button
	public static WebElement DeleteLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sDeleteBy, sDelete);
	}
	
	
}
