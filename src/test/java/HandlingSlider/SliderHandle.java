package HandlingSlider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
	
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	
	
	
	WebElement minimumSlider = driver.findElement(By.xpath("//span[1]"));
	
	Actions act=new Actions(driver);	
	
	//minimum slider drag
System.out.println(	minimumSlider.getLocation());  //default is x-axis=59,y-axis=250
	
act.dragAndDropBy(minimumSlider, 100, 250).perform();
	
	//maximum slider button drop
	
	WebElement maximumSlider = driver.findElement(By.xpath("//span[2]"));
	
	System.out.println(maximumSlider.getLocation()); //default=x-axis411, y-axis=250
	
	
	act.dragAndDropBy(maximumSlider, -200,250 ).perform();
	
	
	
	}

}
