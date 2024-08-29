package JavascriptExcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageZoomHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();  //maximize the webpage
		
	//	driver.manage().window().minimize(); //minimize the webpage
	
		Thread.sleep(5000);
		
	JavascriptExecutor js=driver;	
	js.executeScript("document.body.style.zoom='50%' ");
	
	Thread.sleep(5000);
	
	js.executeScript("document.body.style.zoom='80%' ");
	
	}

}
