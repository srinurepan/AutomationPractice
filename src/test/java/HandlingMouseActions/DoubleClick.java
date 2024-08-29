package HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();	
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement DoubleClick = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
	
	Actions act =new Actions(driver);	
	
	act.doubleClick(DoubleClick).perform();
	Thread.sleep(4000);		
	driver.switchTo().alert().accept();
	
	}

}
