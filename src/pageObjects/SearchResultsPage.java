package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testData.TestData;
import utility.Find;

public class SearchResultsPage {

	final public static String sItemName = "//*[@data-asin][not(@data-cel-widget=\"search_result_0\")]//*[text()=\""+ TestData.sItemName +"\"]"; // This is needed to detect the missing Item correctly (if it is missing)
	final public static String sItemNameBy = "parameter";
	
	// WebElement of Item name
	public static WebElement ItemNameLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sItemNameBy, sItemName);
	}
}
