package HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();	
	
	driver.get("https://www.blazedemo.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement drop1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
	
	
	
	Select select=new Select(drop1);
	
select.selectByIndex(2);
	
	
WebElement drop2 = driver.findElement(By.xpath("//select[@name='toPort']"));
	
	Select select2=new Select(drop2);
	
	
	select2.selectByIndex(2);
	
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	
	
	
	}

	
	
	
}
