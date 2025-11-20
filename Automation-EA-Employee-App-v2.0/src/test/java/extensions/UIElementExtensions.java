/**
 * 
 */
package extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 */
public class UIElementExtensions {
	
	
	public static void performEnterText(WebDriver driver,  By locator, String value) {
		
		driver.findElement(locator).click();
		
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
		
	}
	
	public static void performClick(WebDriver driver, By locator) {
		
		driver.findElement(locator).click();
	}
	
	
	
	public static void performDropDownSelectionText(WebDriver driver, By locator, String dropDownValue) {
		Select select=new Select(driver.findElement(locator));
		
		select.selectByVisibleText(dropDownValue);
		
	}

	
	public static void performDropDownSelectionIndex(WebDriver driver, By locator, int dropDownValue) {
		Select select=new Select(driver.findElement(locator));
		
		select.selectByIndex(dropDownValue);
		
	}
	
	public static String checkIfElementExits(WebDriver driver, By locator) {
		if(driver.findElement(locator).isDisplayed()){
			return "";
		}else {
			return "";
		}
	}
}
