package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extensions.UIElementExtensions;

public class HomePage {

	WebDriver driver;
	// List all locators for HomePage
	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement Home;

	@FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
	private WebElement login;

	@FindBy(xpath = "//a[@id='registerLink']")
	private WebElement Register;

	@FindBy(xpath = "//a[normalize-space()='Employee List']")
	private WebElement Employee_List;

	@FindBy(xpath = "//a[normalize-space()='About']")
private WebElement About;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Click Home Page link
	public void Click_HomePage() {
		UIElementExtensions.performClick(Home);
	}

	// Click Login Page link
	public void Click_Login() {
		UIElementExtensions.performClick(login);
	}

	// Click Register Page
	public void Click_Register() {
		UIElementExtensions.performClick(Register);
	}

	// Click About Link
	public void Click_About() {
		UIElementExtensions.performClick(About);
	}

//Click Employee_List Link
	public void Click_Employee_List() {
		UIElementExtensions.performClick(Employee_List);
	}

}
