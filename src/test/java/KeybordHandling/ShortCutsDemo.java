package KeybordHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShortCutsDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
		
		driver.get("https://text-compare.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("(//textarea[@id='inputText1'])[1]")).sendKeys("welcome");
	
	Actions act=new Actions(driver);
	
	        //ctrl+A
	
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	
	        //Ctrl+c
	
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	
	      //click    Tab button //means moveing cursor another text box
	
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	
	          //ctrl+v
	
	
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
