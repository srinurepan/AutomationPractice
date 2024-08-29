package MethodsOfAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	
	      //1.get url method
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
	       //2.getTitle method
		
	// String getPageTitle = driver.getTitle(); 
	 
	//System.out.println(getPageTitle); //print page Title
	
	       //3..get PageSource
	 
	// String getPageSource = driver.getPageSource();
	
	  //System.out.println(getPageSource);
	
	  //4.getCurrentUrl
	  
	 String currentUrl = driver.getCurrentUrl();
	  
	 System.out.print(currentUrl);
	
	//5.getWindowHandle method
	  
	//  String windowHandle = driver.getWindowHandle();
	
	//  System.out.println(windowHandle);
	
	//6.getWindowHandles
	
	// Set<String> windowHandles = driver.getWindowHandles();
	
    	// driver.findElement(By.xpath("//a[normalize-space()='orange HRM']")).click();

	 //	System.out.println(windowHandles);
	}

}
