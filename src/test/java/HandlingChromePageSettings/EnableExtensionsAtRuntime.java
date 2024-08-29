package HandlingChromePageSettings;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRuntime {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();	
		
		
		File  file=new File("F:\\ChromeExtensions\\SelectorsHub.crx");
		option.addExtensions(file);
		
		ChromeDriver driver=new ChromeDriver(option);	

		driver.get("https://demo.nopcommerce.com/");
	}

}
