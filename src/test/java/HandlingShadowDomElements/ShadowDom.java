package HandlingShadowDomElements;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	
	
		driver.get("https://books-pwakit.appspot.com/");

	driver.manage().window().maximize();
	
	//xpath not handle shadow dom elements ,css selecter only handle
	
	 //shadow dom element
	SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS'")).getShadowRoot();
			Thread.sleep(1000);
	shadow.findElement(By.cssSelector("#input")).sendKeys("welcome");
	
	
	}

}
