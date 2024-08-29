package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdowns {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//b[@class='caret']")).click();
	
	driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
	
	//size of dropdowns
	
	List<WebElement> all = driver.findElements(By.xpath("//span//label"));
	
	
	System.out.println(all.size()); 
	
	//print all dropdowns in console
	
	for( WebElement Printall:all) {
		
		System.out.println(Printall.getText());
	}
	}

}
