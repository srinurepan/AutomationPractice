package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjectDemo2 {

	//using pageFactory approach(modern approach)
	
	
	WebDriver driver ;	
	
	    
	     //Constructor
	
	pageObjectDemo2(WebDriver driver){
	
	this.driver=driver;
    PageFactory.initElements(driver, this); //mandatory this approach
	}
	
	//Locators

@FindBy(xpath="//input[@placeholder='Username']")  
WebElement UserName;

@FindBy(xpath="//input[@placeholder='Password']") 
WebElement password;
@FindBy(xpath="//button[normalize-space()='Login']")
WebElement Login;
	
	      //Action methods
	
public void setUserName(String user) {
	UserName.sendKeys(user);
	
}
public void setPassword(String pws) {
	password.sendKeys(pws);
}
 public void clickLogin() {
	 Login.click();
 }
}