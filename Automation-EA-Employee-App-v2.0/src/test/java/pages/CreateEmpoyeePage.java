package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import extensions.UIElementExtensions;

public class CreateEmpoyeePage {
	
	private WebDriver driver;
	
	By Create_New_User_btn=By.xpath("//a[normalize-space()='Create New']");
	
    By input_Name=By.xpath("//input[@id='Name']");
	By input_Salary=By.xpath("(//input[@id='Salary'])[1]");
	By input_Duration=By.xpath("//input[@id='DurationWorked']");
	By input_Email=By.xpath("//input[@id='Email']");
	By input_Create_btn=By.xpath("//input[@value='Create']");
	By Grade=By.xpath("//select[@id='Grade']");
	  
	public CreateEmpoyeePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Create_CreateUser() {
		UIElementExtensions.performClick(driver, Create_New_User_btn);
	}

	public void EnterUserDetails(String Name, String Salary, String Duration, String Email) {
		UIElementExtensions.performEnterText(driver, input_Name, Name);
		UIElementExtensions.performEnterText(driver, input_Salary, Salary);
		UIElementExtensions.performEnterText(driver, input_Duration, Duration);
		UIElementExtensions.performEnterText(driver, input_Email, Email);
		UIElementExtensions.performDropDownSelectionIndex(driver, Grade, 2);
		UIElementExtensions.performClick(driver, input_Create_btn);
	}
	
}
