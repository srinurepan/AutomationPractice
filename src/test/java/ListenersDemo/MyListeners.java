package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener //"ctrl+click" then get predefine methods of IListeners class


{

	 public void onStart(ITestContext context) {  //use only public cls not default cls
		
		 System.out.println("excution started");
		  }
	
	public  void onTestStart(ITestResult result) {
		
		System.out.println("test start  every method");
	  }
	
	 public void onTestSuccess(ITestResult result) {
		
		 System.out.println("test success");
	 }
	
	 public void onTestFailure(ITestResult result) {
		
		 System.out.println("test failed");
		  }
	
	 public void onTestSkipped(ITestResult result) {
		    
		 System.out.println("test skipped");
	 }
	 
	
	 
	 public void onFinish(ITestContext context) {
		   
		 System.out.println("finish the excution");
		  }
	 
	 
	 
}
