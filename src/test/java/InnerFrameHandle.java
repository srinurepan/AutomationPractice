import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrameHandle {

	public static void main(String[] args) {
		
			WebDriver driver =new ChromeDriver();
	
			driver.manage().window().maximize();
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	
	
	WebElement innerframe = driver.findElement(By.xpath("//frame[@ src='frame_5.html']"));
	
	driver.switchTo().frame(innerframe);
	
	driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
	}

}
