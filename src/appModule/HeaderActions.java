package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.ChooseYourLocationFrame;
import pageObjects.HeaderObjects;
import test.FindTheBook;

public class HeaderActions {

// This method activates the search of a text contained in StringToSearch variable	
	public static void Search(WebDriver driver, String StringToSearch) throws Exception { // StringToSearch - the name of the item you want to search fpr on the website
		
		HeaderObjects.SearchFieldLnk(driver).sendKeys(StringToSearch);  // enter the text we are looking in the search field
		FindTheBook.Log.info("\""+StringToSearch+"\" entered to the search field");
		HeaderObjects.SearchButtonLnk(driver).click(); //click Search button
		FindTheBook.Log.info("Search button clicked");
		
	}
	
// This method sets a location for delivery	
	public static void LocationSetTo(WebDriver driver, String Location) throws Exception { //Location = desired location (country)
		
		HeaderObjects.DeliverToLnk(driver).click(); // Click on DeliverTo button
		FindTheBook.Log.info("Deliver To clicked");
		Select se = new Select(ChooseYourLocationFrame.CountryListLnk(driver)); // Select list
		se.selectByVisibleText(Location); // Select the value in the list
		FindTheBook.Log.info("\""+Location+"\" selected from the list of countries");
		ChooseYourLocationFrame.DoneLnk(driver).click(); // click Done
		FindTheBook.Log.info("Done clicked");
		driver.navigate().refresh(); // Refresh the page (it is needed before the upcoming search
		FindTheBook.Log.info("Page refreshed");
		
	}
}
