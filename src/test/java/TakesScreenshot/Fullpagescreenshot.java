package TakesScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullpagescreenshot {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	

	driver.get("https://demo.nopcommerce.com/");;
	
	driver.manage().window().maximize();
	 
	   //screenshot method 
	
	TakesScreenshot ts	= (TakesScreenshot)driver;
	
	    File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	
	File  Targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
	
	sourcefile.renameTo(Targetfile); //copy pic sourcefile to targetfile
	
	}

}
