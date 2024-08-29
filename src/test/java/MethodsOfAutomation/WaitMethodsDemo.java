package MethodsOfAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethodsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	

	   
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//1.ImplicityWait method ( this method applicable each  action)
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	
	//2.ExplicityWait (its apply when you want thats applicable one time)
	
WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5)); //declaration
	
	WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

	
	password.sendKeys("admin123");
	}

	

}
