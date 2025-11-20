/**
 * 
 */
package gettingStarted;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import extensions.UIElementExtensions;
import pages.CreateEmpoyeePage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



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
		
		HomePage Home=new HomePage(driver);
		Home.Click_Login();
		
		LoginPage Login=new LoginPage(driver);
		Login.PerformLogin("admin", "password");
		Login.ClickLogin();
		Home.Click_Employee_List();
		
		CreateEmpoyeePage EmplyeePage=new CreateEmpoyeePage(driver);
		EmplyeePage.Create_CreateUser();
		EmplyeePage.EnterUserDetails("AutoUserTestPuna", "45", "785", "AutoUserTestPuna@gmail.co.za");
	
		
		

	}
	
	//Open webpage
	public static void OpenWebpage(WebDriver driver) {
     driver.navigate().to("http://eaapp.somee.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
}
