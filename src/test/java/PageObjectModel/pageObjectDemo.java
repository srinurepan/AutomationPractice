package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageObjectDemo {

	//page object model create 2 approaches 1.without page factory 2.with page factory
	//this approach is without page factory(older method)
	
	WebDriver driver;
	
	 
	//constructor 
	
	pageObjectDemo(WebDriver driver) {
		
		this.driver =driver;
	
	}
              //locators
		
   By txt_username_loc = By.xpath("//input[@placeholder='Username']");
   By txt_password_loc = By.xpath("//input[@placeholder='Password']");
   By btn_login_loc = By.xpath("//button[normalize-space()='Login']");	
		
		
	    //Action methods
	
	public void setUserName(String user) {
		
		driver.findElement(txt_username_loc).sendKeys(user);
	
	}

	public void setPassword(String pws) {
		
		driver.findElement(txt_password_loc).sendKeys(pws);
	}

	public void clickLogin() {
		
		driver.findElement(btn_login_loc).click();
	}
}