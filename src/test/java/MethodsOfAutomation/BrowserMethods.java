package MethodsOfAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();	
	
		driver.get("https://testautomationpractice.blogspot.com/");
	
		driver.manage().window().maximize();  //maximize window
		
	
	driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
	
	//  driver.close(); // close  specific browser(one browser close)
	
	  driver.quit();  //close all browsers 
	}

}
