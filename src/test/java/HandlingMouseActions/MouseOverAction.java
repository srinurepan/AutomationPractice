package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
	
	
	Actions act=new Actions(driver); //action class used when mouse action reuired
	
	
	act.moveToElement(computer);
	
	WebElement software = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));
	
	
	act.moveToElement(software).click().build().perform();
	
                //or
	//act.moveToElement(software).click().perform();
	
	}

}
