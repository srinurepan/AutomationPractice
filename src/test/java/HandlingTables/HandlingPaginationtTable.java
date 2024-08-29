package HandlingTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPaginationtTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//print no of columns(td)
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//thead//tr"));
	
	System.out.println (rows.size());
	
	}

}
