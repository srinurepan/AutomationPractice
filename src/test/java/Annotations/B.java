package Annotations;

import org.testng.annotations.BeforeTest;

public class B {

	@BeforeTest
	void second() {
		System.out.println("this is class b");
	}
}
