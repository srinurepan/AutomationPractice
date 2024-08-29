package DataProvider_Parralel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class DataProviderDemo {
	
	WebDriver driver;
	
	
	@BeforeClass	
	void setUp() {
		
		driver=new ChromeDriver();	
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}

	@Test(dataProvider="dp")
	void login( String email,String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	
		Thread.sleep(2000);
	
		
	boolean MyAccount = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
	
	if(MyAccount==true)	{
	
	
	
	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	
	Assert.assertTrue(true);
	}
	
	else {
//		Assert.assertTrue(false);
	
		  //or
		Assert.fail();
	
	}
	
	
	}
	
	
	@AfterClass
	void teardown() {
		
		driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,2}) //indices means only specific data pass
	Object[][] logindata() {
		
		Object data[][] = { 
				             {"srinu123@gmail.com","srinu123 "},  //0 index starts 0
		                     {"ramesh123@gmail.com","ramesh123" }, //1 
		                     {"helo12345@gmail.com",  "helo12345@gmail.com"}, //2
		                     {"suresh123@gmail.com" ,"suresh123"},   //3
	
		                     
		};
		
		return data;
		
		}
	
	
}
