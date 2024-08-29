package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class javascriptSendkey {

	public static void main(String[] args) {
		
		
		// javascript executor mainly use ,sometimes click and sendkeys methods not
	//	working at the time exception comes(no intercept exception) thats why
	//	we are use javascript method
		
 
		
		  ChromeDriver driver=new ChromeDriver();	
	
	       //or
	
       //  WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/");
	
	WebElement serachBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	
	
//	JavascriptExecutor js=(JavascriptExecutor)driver; //above webdriver used then this syntex we are used
	
	 
	JavascriptExecutor js=driver; //chrome browser used above then we follow this syntex

	
	js.executeScript("arguments[0].setAttribute ('value','laptops')", serachBox);
	
	}

	
	}


