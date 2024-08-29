package AlertsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsUsingExplicityWait {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
	
	
   driver.manage().window().maximize();
   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5)); //condition
	
   driver.get("https://testautomationpractice.blogspot.com/");
	
   driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
	
   
   Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	
   
   System.out.println(myAlert.getText());
  
     myAlert.accept();
	}

}
