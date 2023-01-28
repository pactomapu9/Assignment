package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Find;

public class ChooseYourLocationFrame {

	final public static String sCountryList = "//*[@id=\"GLUXCountryList\"]";
	final public static String sCountryListBy = "xpath";
	
	final public static String sDone = "//*[@id=\"a-popover-1\"]/div/div[2]/span/span";
	final public static String sDoneBy = "xpath";
	
	// WebElement of CoutryList
	public static WebElement CountryListLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sCountryListBy, sCountryList);
	}
		
	// WebElement of Done button
	public static WebElement DoneLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sDoneBy, sDone);
	}
}
