package TakesScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturescreenshotSpecificArea {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
	
	driver.get("https://demo.nopcommerce.com/");
	
	//specific area  screenshot
/*	WebElement FeaturedProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	
	
	File sourceFile = FeaturedProduct.getScreenshotAs(OutputType.FILE);
	
	File    targetfile =new File(System.getProperty("user.dir")+"\\Screenshots\\featured product.png");
	
	
	sourceFile.renameTo(targetfile);
	
	*/
	
	
	     //capture screenshot of webElement
	
	WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	
	File sourceFile = logo.getScreenshotAs(OutputType.FILE);
	
	File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
	
	sourceFile.renameTo(targetFile);
	
	}

}
