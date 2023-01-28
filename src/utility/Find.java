package utility;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.FindTheBook;

public class Find {

	// This method returns a WebElement object corresponding to your locator.
	// WebElement can be returned by:
	//	- xpath,
	//	- cssSelector,
	//	- id,
	//	- text (uses a text() function of xpath).
	public static WebElement FindWithLocator(WebDriver driver, String by, String locator) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(Constants.FindDelay));
		
		WebElement element = null;
		
		switch(by) {
		case "xpath":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
			element = driver.findElement(By.xpath(locator));
			FindTheBook.Log.info("WebElement found successfully by xpath");
			break;
		case "id":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
			element = driver.findElement(By.id(locator));
			FindTheBook.Log.info("WebElement found successfully by id");
			break;
		case "css":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
			element = driver.findElement(By.cssSelector(locator));
			FindTheBook.Log.info("WebElement found successfully by css");
			break;
		case "parameter":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
			element = driver.findElement(By.xpath(locator));
			FindTheBook.Log.info("WebElement found successfully by parameters");
			break;
		}
		
		return element;
	}
}
