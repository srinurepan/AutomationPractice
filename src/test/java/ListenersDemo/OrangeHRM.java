package ListenersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class OrangeHRM {

	WebDriver driver;

	@BeforeClass
void setUp() throws InterruptedException {
	
	driver= new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.manage().window().maximize();

Thread.sleep(5000);


}
@Test(priority=1)
    void testLogo() {
    	
    	boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
  
    Assert.assertEquals(logo, true);
    
    
    }


@Test(priority=2)
void testTitle() {
	
	Assert.assertEquals(driver.getTitle(), "OrangeHRM _");  //intentionally fail this method
}


@Test(priority=3,dependsOnMethods="testTitle") //this method depends above method
void testUrl() {
	
	Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login " );
	
}

@AfterClass	
void tearDown() {
	
	driver.quit();
}
}
