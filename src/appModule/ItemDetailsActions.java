package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.ItemDetailsPage;
import test.FindTheBook;

public class ItemDetailsActions { // Item details page should be opened to use methods from this class

	
// This methods adds the current item to cart
	public static void AddToCart(WebDriver driver) throws Exception {
			
		ItemDetailsPage.AddToCartLnk(driver).click(); // click "Add to cart" button
		FindTheBook.Log.info("Add to Cart button clicked");
		
	}
}
