package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebpageScrolldown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();	
		
		driver.get("https://demo.nopcommerce.com/");
	
	//1.scrolldown use pixel number
	
		JavascriptExecutor 	js=driver;	
//		js.executeScript("window.scrollBy(0,1500)", " "); //initial value=0,curser move to 1500 pixel
//	System.out.println( js.executeScript("return window.pageYOffset;"));
	
	
	//2.scroll the page till element is visible
	
//	WebElement text = driver.findElement(By.xpath("//a[normalize-space()='nopCommerce new release!']"));
	
//	js.executeScript("arguments[0].scrollIntoView();",text); //1485 pixel number
//	System.out.println( js.executeScript("return window.pageYOffset;"));
	
	
	   //3.scroll down the end of the page

	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
System.out.println( js.executeScript("return window.pageYOffset;"));//2037=total page pixel
	
     
	   Thread.sleep(5000);
	
	//4.scrolling upto initial position(top)
	
	   js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	
	}

}
