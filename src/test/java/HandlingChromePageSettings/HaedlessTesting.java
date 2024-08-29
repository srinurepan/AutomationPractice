package HandlingChromePageSettings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HaedlessTesting {

	public static void main(String[] args) {
		
		
		//Headless testing is fastly excute testcases,we can't see the ui
		
	ChromeOptions option=new ChromeOptions();	//we can't see wts happen internally	
		option.addArguments("--headless=new");
		
	
	ChromeDriver driver=new ChromeDriver(option);		
	driver.get("https://demo.nopcommerce.com/");
	
	
	System.out.println(driver.getTitle());
	
	
	if(driver.getTitle().equals("nopCommerce demo store")){
		System.out.println("test passed");
	}
	else {
		System.out.println("test not passed");
	}
	}

}
