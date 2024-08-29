package Testng;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	
	 /*
	 1.launch  orange hrm application
	 2.find logo of orange hrm display or not
	 3.close the application
	 */
	 
	WebDriver driver;  //open driver in global level(or)class level
 
	
	
	
	@Test(priority=1)
  public void openApp() {
  
 driver=new ChromeDriver();
  
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
  
  }
	@Test(priority=2)
	public void AppLogo() {
		  
 boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	
	 
	System.out.println("logo displayed");
	
	}
	@Test(priority=3)
	public void AppClose() {
		
		
		driver.quit();
	}
	
}
