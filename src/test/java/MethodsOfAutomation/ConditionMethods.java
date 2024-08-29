package MethodsOfAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionMethods {

	public static void main(String[] args) {
			
		WebDriver driver =new ChromeDriver();
		
	driver.get("https://testautomationpractice.blogspot.com/");
	
	    //1.is Display method
	
	  boolean PageTitle = driver.findElement(By.xpath("//h1[@class='title']")).isDisplayed();
	  
	  System.out.println(PageTitle);
	
	  //2.is Enabled method
	  
	  boolean SearchBox = driver.findElement(By.xpath("(//input[@id='field2'])[1]")).isEnabled();

	System.out.println(SearchBox);
	
	  //3.is Selected method
	
	  WebElement RadioButton = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	
	 RadioButton.click();
	 RadioButton.isSelected();
	
	}
		
}
