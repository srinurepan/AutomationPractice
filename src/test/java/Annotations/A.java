package Annotations;

import org.testng.annotations.BeforeTest;

public class A {

	@BeforeTest
	void first() {
		System.out.println("this is class a");
	}
}
