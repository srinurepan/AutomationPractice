package MethodsOfAutomation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	
	
       driver.get("https://demo.nopcommerce.com/");
 
       //1.Navigate To method
   
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
      //2.Navigate back method
      
  //  driver.navigate().back();
   
      //3.Navigate forward method
    
  //  driver.navigate().forward();
	
    //Navigate Refresh method
	
 //   driver.navigate().refresh();
	
	}
	
}
