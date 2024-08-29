package CheckBoxesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxex {

	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://testautomationpractice.blogspot.com/");;
	
	driver.manage().window().maximize();
	
          	//select one checkbox
	
	    //driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
	//select multiple checkbox using each loop method
	
	 List<WebElement> MultiBoxes = driver.findElements(By.xpath("//input[@class='form-check-input'  and  @type='checkbox']"));
	
	 /*	
	 for(int i=0;i<MultiBoxes.size();i++) {
		
	   MultiBoxes.get(i).click();
	 }  
	   */
	
	
	          //2. another approach method using forloop
	
	
	
	for( WebElement all:MultiBoxes) {
	
		all.click();
		
	}
	}
}


