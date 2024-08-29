package HandlingwebPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingPagesdemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/");
	
	WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));

	
	Actions act=new Actions(driver);	
	
	//its mean reglink open A new Window
	
	//ctrl+regLink.
	
	act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
	
	//switching register page
	
	List<String> ids = new ArrayList<String>(driver.getWindowHandles());
	
	
	driver.switchTo().window(ids.get(1)); //switch to regLinkpage(new window)
	
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("helo");

	
	//switch to main page(first window)
	
	driver.switchTo().window(ids.get(0));
	
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("compuers");
	
	}

}
