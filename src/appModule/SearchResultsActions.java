package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.SearchResultsPage;
import test.FindTheBook;

public class SearchResultsActions { // Search results page (list of search results) should be opened to use methods from this class

// This method finds the element the title of the item contained in ItemName variable and clicks on it to navigate to the item details
	public static void GoToItemDetails(WebDriver driver) throws Exception {
		
		SearchResultsPage.ItemNameLnk(driver).click();; // click the title of the item
		FindTheBook.Log.info("Item title clicked");
		
	}
	
}
