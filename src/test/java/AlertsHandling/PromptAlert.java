package AlertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); 
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
	
	Alert promptAlert = driver.switchTo().alert();
	
	System.out.println(promptAlert.getText());
	promptAlert.accept();
	
	}

}
