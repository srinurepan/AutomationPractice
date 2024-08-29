package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptClickMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
	
		//javascript method apply in click method 
		
	
		WebElement RegisterLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	
	JavascriptExecutor js=driver;	
	js.executeScript("arguments[0].click()",RegisterLink );
	
	
	
	}

}
