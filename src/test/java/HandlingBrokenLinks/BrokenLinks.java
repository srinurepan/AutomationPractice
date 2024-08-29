package HandlingBrokenLinks;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
     driver.get("http://www.deadlinkcity.com/");

     driver.manage().window().maximize();;
	
     //find all links
	List<WebElement> allLink = driver.findElements(By.tagName("a"));
	
	System.out.println("Total no of links"+ allLink.size());  //number  of links
	
	int noOfBrokenLinks=0;
	
	for(WebElement brokenLinks:allLink) {
	
	String hrefAtributeValues = brokenLinks.getAttribute("href"); //get values of all href attributes
	
	//all links started with href link
	
	if(hrefAtributeValues==null || hrefAtributeValues.isEmpty()) {
		System.out.println("href attribute values are null or empty");
	   continue;
	
	   
	}
	   //hit url to the server

	   try {
		   @SuppressWarnings("deprecation")
		URL link=new URL(hrefAtributeValues); //convert href values are string to URL format
		   HttpURLConnection conn=(HttpURLConnection) link.openConnection(); //open connection to the server
	     conn.connect();        //connect to the server and sent request to the server
	   
	     if(conn.getResponseCode()>=400) {
	    	 System.out.println(hrefAtributeValues+"======>broken Links");
	           noOfBrokenLinks++;
	     }
	     else {
	    	 System.out.println("======> not a borken links");
	     }
	   }
	catch(Exception e) {

	}
	
	
	
	
		System.out.println("no of broken link"+noOfBrokenLinks);

	}
}
}
	