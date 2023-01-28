package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.HeaderObjects;
import test.FindTheBook;
import utility.Find;

public class CartActions { 
	
// This method deletes item from the cart (a single item should be in the cart) 	
	public static void DeleteFromCart(WebDriver driver) throws Exception {
		
		HeaderObjects.CartLnk(driver).click(); // Click cart icon
		FindTheBook.Log.info("Cart icon clicked");
		CartPage.DeleteLnk(driver); // click "Delete" button
		FindTheBook.Log.info("Delete item button clicked");
	
	}
	
// This method returns true if there is a web element with ItemNane text, otherwise it returns false
	public static boolean CheckItemName(WebDriver driver) throws Exception {
		
		HeaderObjects.CartLnk(driver).click(); // Click cart icon
		FindTheBook.Log.info("Cart icon clicked");
		
		try {
			Find.FindWithLocator(driver, CartPage.sItemNameBy, CartPage.sItemName); // Try to find item name
			FindTheBook.Log.info("Item name found in the cart");
			return true;										// Item name was found
		} catch (Exception e) {
			return false;										// Item name was not found
		}
	
	}
}
