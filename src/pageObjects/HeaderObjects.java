package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Find;

public class HeaderObjects {

	// Locators
	
	final public static String sSearchField = "#twotabsearchtextbox";
	final public static String sSearchFieldBy = "css";
	
	
	final public static String sSearchButton = "#nav-search-submit-button";
	final public static String sSearchButtonBy = "css";
	
	final public static String sDeliverTo = "#nav-global-location-popover-link";
	final public static String sDeliverToBy = "css";
	
	final public static String sCart = "nav-cart";
	final public static String sCartBy = "id";
	

	// WebElement of SearchField
	public static WebElement SearchFieldLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sSearchFieldBy, sSearchField);
	}
	
	// WebElement of CoutryList
	public static WebElement SearchButtonLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sSearchButtonBy, sSearchButton);
	}
	
	// WebElement of CoutryList
	public static WebElement DeliverToLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sDeliverToBy, sDeliverTo);
	}
	
	// WebElement of CoutryList
	public static WebElement CartLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sCartBy, sCart);
	}
	
}
