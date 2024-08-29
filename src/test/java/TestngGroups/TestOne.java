package TestngGroups;

import org.testng.annotations.Test;

public class TestOne {

	@Test(priority=1,groups= {"sanity"})	
	void loginEmail() {
		System.out.println("login the email");
	}
    @Test(priority=2,groups= {"sanity"})
	void loginOpenkart() {
		System.out.println("login the openkart application");
	}
    
    @Test(priority=3,groups= {"sanity"})
	void loginTwitter() {
		System.out.println("login the twitter application");
	}
	
}
