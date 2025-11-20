package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extensions.UIElementExtensions;

public class CreateEmpoyeePage {
	
	private WebDriver driver;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Create New']")
	private WebElement Create_New_User_btn;
	
	@FindBy(id="Name")
  private WebElement input_Name;
	
	
	
	@FindBy(id="Salary")
	private WebElement input_Salary;
	
	@FindBy(id="DurationWorked")
	private WebElement input_Duration;
	
	@FindBy(id="Email")
	private WebElement input_Email;
	
	@FindBy(id="Grade")
	private WebElement Grade;
	
     @FindBy(xpath ="//input[@value='Create']")
	private WebElement input_Create_btn;
	
	  
	public CreateEmpoyeePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void Create_CreateUser() {
		UIElementExtensions.performClick(Create_New_User_btn);
	}

	public void EnterUserDetails(String Name, String Salary, String Duration, String Email) {
		UIElementExtensions.performEnterText(input_Name, Name);
		UIElementExtensions.performEnterText(input_Salary, Salary);
		UIElementExtensions.performEnterText(input_Duration, Duration);
		UIElementExtensions.performEnterText(input_Email, Email);
		UIElementExtensions.performDropDownSelectionIndex(Grade, 2);
		UIElementExtensions.performClick(input_Create_btn);
	}
	
}
