package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedDropdowns {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
	
		driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	WebElement DropDown = driver.findElement(By.xpath("//select[@id='country']"));
	
	Select select=new Select(DropDown);  //select class used
	
	
	//select option from the dropdown 3 methods select by dropdowns
	          //1.select visibile Text
     select.selectByVisibleText("India");
	
       //  2.select By value use method
     
     select.selectByValue("uk");
     
     //3.select by using index
   
     select.selectByIndex(3);

/*	//print all dropdowns
	
    String size = driver.findElement(By.xpath("//select[@id='country']")).getText();
	
	System.out.println(size);
	*/
	  
     //print all options using getoption method ( or)size
	
     List<WebElement> printAll = select.getOptions();
	
	System.out.println(printAll.size());
	
	
	//print all dropdowns in console
	
/*	for(int i=0;i<printAll.size();i++) {
		
		System.out.println(printAll.get(i).getText());
	}
*/
	
	
	//another type enhanced forloop print all options
	
	for(WebElement all:printAll) {
	
	System.out.println(	all.getText());
		
	}
	}
	

}
