package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdownsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));;

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
	
	
	List<WebElement> autosug = driver.findElements(By.xpath("//div[@class='UUbT9 EyBRub']//li[@class='sbct']"));
	
	Thread.sleep(5000);
	
	System.out.println(autosug.size() );
	
	//print all suggested items
	
	
	
	for(WebElement all:autosug) {
		  
		System.out.println(  all.getText());
	  
	
	if (all.equals("selenium")){
		
		all.click();
	}	
	}
	
}

}
