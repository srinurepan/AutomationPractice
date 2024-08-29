package HandlingChromePageSettings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
       
	//some applications not open for security purpose then we use this method
	
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();	
option.setAcceptInsecureCerts(true); //default it set false but we can change to true
		
		
		ChromeDriver driver=new ChromeDriver(option);	

		driver.get("https://expired.badssl.com/");
	
	System.out.println(driver.getTitle());
	}

}
