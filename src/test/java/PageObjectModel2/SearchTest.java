package PageObjectModel2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {


WebDriver driver;	
@BeforeClass
void setup() {
	driver=new 	ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
}

@Test
   void test() {
	
	pageObject po=new pageObject(driver);

         po.txt_searchbox("Desktop");
         po.search_btn();

Assert.assertEquals("Categories", "Categories");
}
@AfterClass	
 void teardown() {
	 driver.quit();
 }
}
