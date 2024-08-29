package TestngGroups;

import org.testng.annotations.Test;

public class TestThree {
 
	@Test(priority=1,groups= {"smoke","sanity","functional"})
	void logoutGmail() {
		System.out.println("logout the gmail");
	}

	@Test(priority=2,groups= {"smoke","sanity","functional"})
void logoutFlikart() {
	System.out.println("logout the flipkart application");
}
}
