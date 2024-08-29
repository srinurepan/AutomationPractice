package HandlingChromePageSettings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RuntestInIncogntiMode {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();	
	
		option.addArguments("--incognito");//open chrome in incognito mode
	
		
	    ChromeDriver driver=new ChromeDriver(option);	
	
	driver.get("https://demo.nopcommerce.com/");
	
	}

}
