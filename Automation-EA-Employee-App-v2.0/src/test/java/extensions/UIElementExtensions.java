/**
 * 
 */
package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 */
public class UIElementExtensions {
	
	
	public static void performEnterText(WebElement locator, String value) {
		
		locator.click();
		
		locator.clear();
		locator.sendKeys(value);
		
	}
	
	public static void performClick(WebElement locator) {
		locator.click();
	}
	
	
	
	public static void performDropDownSelectionText(WebElement locator, String dropDownValue) {
		Select select=new Select(locator);
		
		select.selectByVisibleText(dropDownValue);
		
	}

	
	public static void performDropDownSelectionIndex(WebElement locator, int dropDownValue) {
		Select select=new Select (locator);
		
		select.selectByIndex(dropDownValue);
		
	}
	
	
}
