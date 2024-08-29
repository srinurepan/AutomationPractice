package TestngDependencey;

import org.testng.annotations.Test;

import junit.framework.Assert;

/*
 * 
  open application
  login the application
  search products
  logout application
 */
                   //dependency means one method depends to another method
            //ex:-one method fail then remaining methods are not excuted(skipped)
public class Dependency {

	@Test	(priority=1)
	void openApp() {
		Assert.assertTrue(true);
}
	
	@Test	(priority=2,dependsOnMethods={"openApp"})  //this method dependce on openapp method
	void Login() {                                    //if opanApp pass then excute this method
		Assert.assertTrue(true);
}
	@Test	(priority=3)
	void Search() {
		Assert.assertTrue(true);
}
	
	
	@Test	(priority=4)
	void logout() {
		Assert.assertTrue(true);
}
	
	
	
	
}