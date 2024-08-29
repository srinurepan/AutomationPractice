package DataProvider_Parralel;

import java.time.Duration;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParallelTestDemo {

	 WebDriver driver;	
	
	 @Parameters({"browser"})	
	 @BeforeClass	
	 void  setUp(String br) throws InterruptedException {
	
		 switch(br)
		 {
		 case "chrome": driver =new ChromeDriver();	break;
		 
		 case "edge": driver =new EdgeDriver();	break;
		 default:System.out.println("invalid browser"); return;
		 
		 }
		 
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	
	}
	@Test(priority=1)
	 void testUrl() {
			
			String	actual=driver.getCurrentUrl();
			String Expected = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				
				Assert.assertEquals(actual, Expected);
			}
			
			@Test(priority=2)
			void testTitle() {
				
				String ActTitle=driver.getTitle();
				String ExpTitle="OrangeHRM";
			
				Assert.assertEquals(ActTitle, ExpTitle);
			}
			
			@Test(priority=3)
		    void testLogo() throws InterruptedException {
		    	
		   boolean img = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();	
		    	Thread.sleep(5000);
		   
		    	Assert.assertEquals(img,true);
		    }


	@AfterClass	
void teardown() {
	
	driver.quit();
}
}