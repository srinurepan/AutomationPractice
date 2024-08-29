package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass	
	void setUp() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	}
	
	@Test	
	void  test() {
		
		pageObjectDemo pod=new pageObjectDemo(driver); //this pageObjectDemo cls "object"(demo1)
	 
	pod.setUserName("Admin");
	pod.setPassword("admin123");
	pod.clickLogin();;
	Assert.assertEquals(driver.getTitle(), "OrangeHRM"); //validation check
	}
	
@AfterClass	
void tearDown() {
	driver.quit();
}


}
