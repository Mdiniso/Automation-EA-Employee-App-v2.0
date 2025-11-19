/**
 * 
 */
package gettingStarted;

import org.openqa.selenium.chrome.ChromeDriver;

import extensions.UIElementExtensions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * 
 */
public class SeleniumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		OpenWebpage(driver);
		Login(driver);
		CreateUser(driver);
		
	
		
		

	}
	
	//Open webpage
	public static void OpenWebpage(WebDriver driver) {
     driver.navigate().to("http://eaapp.somee.com/");
		driver.manage().window().maximize();
		
	}
	
	//Login
	public static void Login(WebDriver driver) {
				
		UIElementExtensions.performClick(driver, By.xpath("(//a[normalize-space()='Login'])[1]"));
		UIElementExtensions.performEnterText(driver, By.xpath("//input[@id='UserName']"), "admin");
		
		
		UIElementExtensions.performEnterText(driver,By.xpath("//input[@id='Password']"),"password");
		
		UIElementExtensions.performClick(driver,By.xpath("//input[@id='loginIn']"));
		

	
	}
	
	//Create User
	public static void CreateUser(WebDriver driver) {
			
		UIElementExtensions.performClick(driver,By.xpath("//a[normalize-space()='Employee List']"));
	
		UIElementExtensions.performClick(driver,By.xpath("//a[normalize-space()='Create New']"));
		UIElementExtensions.performEnterText(driver,By.xpath("//input[@id='Name']"),"AutoUserTestPuna");
		UIElementExtensions.performEnterText(driver,By.xpath("(//input[@id='Salary'])[1]"),"10000");
		UIElementExtensions.performEnterText(driver,By.xpath("//input[@id='DurationWorked']"),"40");
		UIElementExtensions.performEnterText(driver,By.xpath("//input[@id='Email']"),"AutoUserTestPuna@email.com");
		UIElementExtensions.performClick(driver,By.xpath("//input[@value='Create']"));
		  
		 UIElementExtensions.performDropDownSelectionText(driver,By.xpath("//select[@id='Grade']"),"CLevel");
		 
	}
	
	//Logout
	public void logout(WebDriver driver) {
		UIElementExtensions.performClick(driver,By.xpath("//a[normalize-space()='Log off']"));
	}

}
