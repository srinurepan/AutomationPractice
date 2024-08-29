package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFilesUploded {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	
	//multiple files uploaded

	String file1="C:\\Users\\dell\\Downloads\\IMG_5951.JPG";
	String file2="C:\\Users\\dell\\Downloads\\Screenshot (1).png";
	
	
driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"/n"+file2);
	
//how many files upload(size)
int noOfFilesUpload = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	
	if(noOfFilesUpload==2) {
		System.out.println("all files sucessful uploaded");
	}
	else {
		System.out.println("all files not uploaded");
	}
	}

}
