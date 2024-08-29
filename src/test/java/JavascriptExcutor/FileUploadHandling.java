package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	
driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\dell\\Downloads\\IMG_5951.JPG");
	

if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("IMG_5951.JPG"))
		
{ 
	System.out.println("file upload sucessfull");
		
}
else {
	
	System.out.println("file not upload");
}
	}

}
