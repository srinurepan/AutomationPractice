package Automation.Atomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocate {

	public static void main(String[] args) {
		
		//WebDriver driver=new ChromeDriver();
		
		      //or
		ChromeDriver driver= new ChromeDriver();
	
	driver.get("https://demo.opencart.com/");
	
	// 1.Xpath find using one attribute
	
	//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mac");
	
	//2.Xpath find  using multiple attributes.
	
	//driver.findElement(By.xpath("//input[@name='search'] [@type='text']")).sendKeys("mac");
	
	//3.xpath find "or" operators(means atleast one locator true
	
	//driver.findElement(By.xpath("//input[@name='search' or @type='text']")).sendKeys("mac");
	
	//4.using "and" operator (means both locaters true)
	
	//driver.findElement(By.xpath("//input[@name='search' and @type='text']")).sendKeys("lap");
	
	
	
	// 5.xpath find using "contains" method(means words is their or note ex:search=sea

	
	//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea') ]")).sendKeys("mac");
	
	
	//6.xpath write using "starts-with" method(means begining letters 
	
	driver.findElement(By.xpath("//input[starts-with (@placeholder, 'Sea') ]")).sendKeys("mobiles");
	
	
	}	

}
