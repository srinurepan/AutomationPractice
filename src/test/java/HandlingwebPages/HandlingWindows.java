package HandlingwebPages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get("https://demo.nopcommerce.com/");
	
	//Set<String> Ids = driver.getWindowHandles(); //here convert set to list then we get get method

	List<String> Ids=new ArrayList<String>(driver.getWindowHandles());

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.switchTo().window(Ids.getLast()); //get method only consider list(switch nopcommerce site)
	
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computes");
	
	
	driver.switchTo().window(Ids.getFirst()); //switch orange hrm
	
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	driver.findElement(By.xpath("input[@placeholder='Password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("button[normalize-space()='Login']"));
	

	
	}

}
