package gettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://eaapp.somee.com/");
		
		driver.manage().window().maximize();

	
		
	WebElement btnLoginLink=driver.findElement(By.xpath("(//a[normalize-space()='Login'])[1]"));
	btnLoginLink.click();
	
	WebElement inputUsername=driver.findElement(By.xpath("//input[@id='UserName']"));
	
	WebElement inputPassword=driver.findElement(By.xpath("//input[@id='Password']"));
	
	WebElement btnLogin=driver.findElement(By.xpath("//input[@id='loginIn']"));
	
	inputUsername.sendKeys("admin");
	inputPassword.sendKeys("password");
	btnLogin.click();

	}

}
