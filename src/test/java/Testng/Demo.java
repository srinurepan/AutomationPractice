package Testng;

import org.testng.annotations.Test;

public class Demo {
	
	/*
	 1.launch  orange hrm application
	 2.find logo of orange hrm display or not
	 3.close the application
	 */
	
	    //priority means=what we want first excuted we provide like(1,2,3 etc)
	
     @Test(priority=1)
	  void appLaunch() {
		
		System.out.println("application launched");
		}
     
     @Test(priority=2)
     void logoIdentify() {
	
	System.out.println("logo is displayed");
}
     
    @Test(priority=3)
    void closeApp() {
	
	 System.out.println("Application closed");
}


}
