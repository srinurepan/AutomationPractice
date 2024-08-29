package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
	driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
			).click();
	 
	Thread.sleep(5000);
	
	//select one hidden dropdown
	
//	driver.findElement(By.xpath("//span[normalize-space()='Chief Financial Officer']")).click();
	
	
	
	//get size of the all  dropdowns
	
	List<WebElement> count = driver.findElements(By.xpath("//div//div[@role='option']"));
	
	System.out.println(count.size());
	
	
	//print all dropdowns in console
	
	for(WebElement allprint:count) {
		
		System.out.println(allprint.getText());
	}
	
	
	}

}
