package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest2 {

	//this  test case using pageFactory approach(modern approach/"pageObjectDemo2" class testcase)  
	
	WebDriver driver;	

	@BeforeClass
	void setUp() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	}
	@Test
	void test2() {
		pageObjectDemo2 pod2=new pageObjectDemo2(driver);
	
	pod2.setUserName("Admin");
	pod2.setPassword("admin123");
	pod2.clickLogin();
	}
	
	@AfterClass	
	void teardown() {
		driver.quit();
	}
}
