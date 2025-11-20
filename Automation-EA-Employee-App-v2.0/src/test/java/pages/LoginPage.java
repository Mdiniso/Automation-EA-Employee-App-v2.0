package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import extensions.UIElementExtensions;

public class LoginPage {
	
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Elements of a Login Page
	private By  Login_lbl=By.xpath("//h2[normalize-space()='Login.']");
	private By inputUserName=By.xpath("(//input[@id='UserName'])[1]");
	private By inputPassword=By.xpath("//input[@id='Password']");
	private By btn_Login=By.xpath("//input[@id='loginIn']");
	
	//Enter UserName
	public void EnterUserName(String UserName) {
		UIElementExtensions.performEnterText(driver, inputUserName, UserName);
	}
	
	//Enter inputPassword
		public void EnterinputPassword(String Password) {
			UIElementExtensions.performEnterText(driver, inputPassword, Password);
		}
		
		

		//Enter login credentials
			public void PerformLogin(String UserName, String Password) {
				UIElementExtensions.performEnterText(driver, inputUserName, UserName);
				UIElementExtensions.performEnterText(driver, inputPassword, Password);
			}
			
		//Click Login
		public void ClickLogin() {
			UIElementExtensions.performClick(driver, btn_Login);;
		}
		
	
	
	

}
