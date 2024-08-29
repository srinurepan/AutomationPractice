package pageFactoryDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel3 {

	WebDriver driver;	
	
	// constructor
	
	PageObjectModel3(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	     //locators
	

@FindBy(xpath="//input[@id='name']")  	
WebElement name;
@FindBy(xpath="//html")  
WebElement email;
@FindBy(xpath="//input[@id='phone']")   
WebElement phone;
@FindBy(xpath="//textarea[@id='textarea']") 
WebElement address;
	

            //action methods

    void username(String uname) {
	name.sendKeys(uname);
}

   void useremail(String Email) {
	   email.sendKeys(Email);
}

    void userphone(String Phone) {
	phone.sendKeys(Phone);
}
    void useraddress(String adrs) {
	address.sendKeys(adrs);
}


}
