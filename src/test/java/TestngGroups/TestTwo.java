package TestngGroups;

import org.testng.annotations.Test;

public class TestTwo {

	@Test(priority=1,groups= {"smoke"})	
	void signUp() {
		System.out.println("signup openkart");
	}

	@Test(priority=2,groups= {"smoke"})
	void signUpFlipkart() {
		System.out.println("signup flipkart");
	}
  @Test(priority=3,groups= {"smoke"})
	void signUpGmail() {
		System.out.println("signup gmail");
	}
}
