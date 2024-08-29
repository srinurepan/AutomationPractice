package pageFactoryDesign;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcasedemo {

	WebDriver driver;
		
	@BeforeClass
		void setup() {
			driver=new ChromeDriver();	
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		}
@Test
void test_txtboxes() {
	PageObjectModel3 pod3=new PageObjectModel3(driver);
pod3.username("srinu");
pod3.useremail("srinu123@gmail.com");
pod3.userphone("123456789");
pod3.useraddress("hyd");

}
@AfterClass	
void teardown() {
	driver.quit();
}

}
