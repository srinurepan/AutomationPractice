package HandlingDatpicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();	
		
		driver.get("https://testautomationpractice.blogspot.com/");		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	WebDriver iframe = driver.switchTo().frame("//iframe[@id='frame-one796456169'");
	
	
	
	driver.findElement(By.xpath("//span[@role='button']")).click();
	
	
	
	
	
	}

}
