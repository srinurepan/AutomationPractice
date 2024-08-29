package PageObjectModel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObject {

	WebDriver driver;	
	
	//constructor create
	pageObject(WebDriver driver){
		
		this.driver=driver;
	
	PageFactory.initElements(driver,this); //page factory approach
	}
	
            //locators
	
@FindBy(xpath="//input[@id='small-searchterms']")  
WebElement searchStore;
@FindBy(xpath="//button[normalize-space()='Search']")  
WebElement search;


             //Action methods


void txt_searchbox(String item) {
	
	searchStore.sendKeys(item);
}

void search_btn() {
	
	search.click();
}
}
