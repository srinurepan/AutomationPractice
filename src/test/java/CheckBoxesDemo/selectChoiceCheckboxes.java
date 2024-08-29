package CheckBoxesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class selectChoiceCheckboxes {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.manage().window().maximize();
	
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'  and  @type='checkbox']"));
	
	// select last3 check boxes
	
	//formula:-total no of checkboxex-howmany checkboxes want select=starting index
	//7-3=4(starting index is 4)
	
	
/*	for(int i=4;i<checkboxes.size();i++) {
	
	checkboxes.get(i).click();
	}
*/
           
	        //select first 3 checkboxex
	
	
	
	for(int i=0;i<3;i++) {
	
	checkboxes.get(i).click();
	}
	}
}
