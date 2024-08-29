package MethodsOfAutomation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();	
	
	driver.get("https://demo.nopcommerce.com/");
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Set<String> windowIds = driver.getWindowHandles();
	
	//convert set to list 
	
 // ArrayList windowList = new ArrayList(windowIds);
	
 // Object ParentId = windowList.get(0);
	
 // Object ChildId = windowList.get(1);
	
  for(Object winIds:windowIds) {
	  
	  String Title = driver.switchTo().window((String) winIds).getTitle();
 
  if(Title.equals("OrangeHRM")) {
  
  System.out.println(driver.getCurrentUrl());
  }
  }
  
	}
}
	
