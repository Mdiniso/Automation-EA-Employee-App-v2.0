package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extensions.UIElementExtensions;

public class LoginPage {
	
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Elements of a Login Page
	@FindBy(xpath = "//h2[normalize-space()='Login.']")
	private WebElement  Login_lbl;
	
	@FindBy(xpath = "//input[@id='UserName']")
	private WebElement inputUserName;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement inputPassword;
	
	@FindBy(xpath="//input[@id='loginIn']")
	private WebElement btn_Login;
	
	@FindBy(xpath = "//a[normalize-space()='Log off']")
	private WebElement logout;
	
	//Enter UserName
	public void EnterUserName(String UserName) {
		UIElementExtensions.performEnterText(inputUserName, UserName);
	}
	
	//Enter inputPassword
		public void EnterinputPassword(String Password) {
			UIElementExtensions.performEnterText(inputPassword, Password);
		}
		
		

		//Enter login credentials
			public void PerformLogin(String UserName, String Password) {
				UIElementExtensions.performEnterText(inputUserName, UserName);
				UIElementExtensions.performEnterText(inputPassword, Password);
			}
			
		//Click Login
		public void ClickLogin() {
			UIElementExtensions.performClick(btn_Login);;
		}
		
	
	
		//Logout
		public void logout() {
			UIElementExtensions.performClick(logout));
		}


}
