package HandlingDatepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");		
	
	driver.manage().window().maximize();
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
	
	driver.switchTo().frame(iframe);
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//div[@id='q4'])[1]")).click();
	
	}

}
