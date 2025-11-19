package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import extensions.UIElementExtensions;

public class HomePage {
	
	   WebDriver driver;
	//List all locators for HomePage
	   private By Home=By.xpath("//a[normalize-space()='Home']");
  private By login=	By.xpath("(//a[normalize-space()='Login'])[1]");
private By Register=By.xpath("//a[@id='registerLink']");
private By Employee_List=By.xpath("(//a[normalize-space()='Employee List'])[1]");
private By About=By.xpath("//a[normalize-space()='About']");



  public HomePage(WebDriver driver) {
	   this.driver = driver;
  }
  
  //Click Home Page link
  public void Click_HomePage() {
	  UIElementExtensions.performClick(driver, Home);
  }
  //Click Login Page link
  public void Click_Login() {
	  UIElementExtensions.performClick(driver, login);
  }
  
  //Click Register Page
  public void (){
	  UIElementExtensions.performClick(driver, Register);
  }
  
  //Click About Link
  public void Click_About() {
	  UIElementExtensions.performClick(driver, About);
  }
  
//Click Employee_List Link
  public void Click_Employee_List() {
	  UIElementExtensions.performClick(driver, Employee_List);
  }
  
}
