package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	
	@BeforeMethod
	void open() {
		
		System.out.println("open the chrome browser");
	}
	
     @	Test(priority=1)
	void login() {
		
		System.out.println("click login application");
	}
     
     
   @Test(priority=2)
    void details() {
	
	System.out.println("enter details ");
}
   @AfterMethod
   void quit() {
	
	System.out.println("close the chrome browser");
}
   @BeforeMethod
   void open2() {
		
		System.out.println("open the chrome browser2");
	}

            
        //before class and after class annotations
   
   @BeforeClass
   void preRequiistes() {
		
		System.out.println("before class excute this method");

   
  }
@AfterClass
   void close() {
		
		System.out.println("after class excute this method");
	}


              //beforeTest and AfterTest

@BeforeTest
void first() {
	System.out.println("this is Test a");
}

@AfterTest
void second() {
	System.out.println("this is Test b");
}
}

