package test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModule.CartActions;
import appModule.HeaderActions;
import appModule.ItemDetailsActions;
import appModule.SearchResultsActions;
import testData.TestData;
import utility.Find;

public class FindTheBook {

	public static Logger Log = Logger.getLogger(Find.class.getName());
	
	WebDriver driver;
	
@BeforeTest 
	public void Navigate() throws Exception {
			
		DOMConfigurator.configure("log4j.xml");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		Log.info("Navigated to https://www.amazon.com/");
		
		// Choose location to make the delivery possible (otherwise you can't add the book to cart
		HeaderActions.LocationSetTo(driver, TestData.sLocation);
		Log.info("Location changed to " + TestData.sLocation);
	}
	
@Test
	// Search for the book
	public void SearchForTheBook() throws Exception {

		HeaderActions.Search(driver, TestData.sItemName);
		Reporter.log("Step 1 - Search for the book - DONE");
		Log.info("Step 1 - Search for the book - DONE");
	}

@Test(dependsOnMethods = { "SearchForTheBook" })

	// Find the book in the search results
	public void CheckSearchResults() throws Exception {
	
		SearchResultsActions.GoToItemDetails(driver);
		Reporter.log("Step 2 - Find the book in search results - DONE");
		Log.info("Step 2 - Find the book in search results - DONE");
	}

@Test(dependsOnMethods = { "CheckSearchResults" })
	// Add the book to the cart
	public void AddTheBookToTheCart() throws Exception {

		ItemDetailsActions.AddToCart(driver);
		Reporter.log("Step 3 - Add the book to the cart - DONE");
		Log.info("Step 3 - Add the book to the cart - DONE");
	}

@Test(dependsOnMethods = { "AddTheBookToTheCart" })
	// Check the name of the book in the cart
	public void CheckTheCart() throws Exception {

		Assert.assertEquals(CartActions.CheckItemName(driver),true);
		Reporter.log("Step 4 - Chech the title of the book in the cart - DONE");
		Log.info("Step 4 - Chech the title of the book in the cart - DONE");
			
		// Delete item from the cart
		CartActions.DeleteFromCart(driver);
		Log.info("Item deleted from the cart with CartActions.DeleteFromCart(driver)");
	}
		
@AfterTest
	public void finish() {
		
		// Clear cookies
		driver.manage().deleteAllCookies();
		Log.info("Cookies deleted");
		
		// Quit browser
		driver.quit();
		Log.info("Browser closed");
}
		
		

}
