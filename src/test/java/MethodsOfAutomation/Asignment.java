package MethodsOfAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.manage().window().maximize();

	//searchbox
	driver.findElement(By.xpath("(//input[@id='Wikipedia1_wikipedia-search-input'])[1]")).sendKeys("selenium");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	WebElement searchItems = driver.findElement(By.id("Wikipedia1_wikipedia-search-results"));
	
	System.out.println(searchItems.getSize());
	
	}

}
