package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Find;

public class ItemDetailsPage {

	final public static String sAddToCart = "add-to-cart-button";
	final public static String sAddToCartBy = "id";
	
	// WebElement of AddToCart button
	public static WebElement AddToCartLnk(WebDriver driver) throws Exception {
		return Find.FindWithLocator(driver, sAddToCartBy, sAddToCart);
	}
}
