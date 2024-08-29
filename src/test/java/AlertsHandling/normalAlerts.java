package AlertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.manage().window().maximize();
	
	    //Handling normal alerts
	
	
	
/*	driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
	
	Thread.sleep(3000);
	 
	 driver.switchTo().alert().accept();  //accept alert
	
	// alert.accept();  //accept the alert
	  
	// System.out.println(alert.getText());   //print alert text

	*/
	
	//2.condition alert
	
   driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
	
   Thread.sleep(3000);
   
	Alert ConformationAlert = driver.switchTo().alert();
	
	//ConformationAlert.accept();
	
	ConformationAlert.dismiss();
	
	//System.out.println(ConformationAlert.getText());
	}

}
