package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();	
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().window().maximize();
	
	WebElement RightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
	Actions act=new Actions(driver);	
	
	act.contextClick(RightClick).perform();
	
	}

}
