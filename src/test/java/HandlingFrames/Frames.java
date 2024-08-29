package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();;
	
	
	WebElement frame1 = driver.findElement(By.xpath("//frame[@ src='frame_1.html']"));
	
	driver.switchTo().frame(frame1);
	
	
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hi");
	
		  driver.switchTo().defaultContent();  //switch to back
	
	//frame2
		  WebElement frame2 = driver.findElement(By.xpath("//frameset//frameset//frame[1]"));;
		  		 
	driver.switchTo().frame(frame2);
	
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2");
	
	 driver.switchTo().defaultContent();  //switch to back
	
	
	//frame3
	 WebElement frame3 = driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
	
	 driver.switchTo().frame(frame3);
	
	 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
	
	
	//inner iframe in frame 3
	
	driver.switchTo().frame(0); //switching frame3 to innerframe of 3
	
	driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	
	}
	

}
