package HandlingTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number of rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr"));
		
		System.out.println(rows.size());
		
		//find number of columns in table
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name = 'BookTable']//th"));
	
		
		System.out.println(columns.size());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
/*	List<WebElement> table = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr//td"));
	
	System.out.println(table.size());   //size of table

	
	//print all table values
	
	for(WebElement all:table) {
		
	System.out.println(	all.getText());
	}
*/		
		
		//print specific table data

	WebElement specificData = driver.findElement(By.xpath("(//td[contains(text(),'Selenium')])[4]"));
		
		System.out.println(specificData.getText());
		
	}
	}

      





