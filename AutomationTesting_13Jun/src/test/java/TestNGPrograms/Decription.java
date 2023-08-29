package TestNGPrograms;

import org.testng.annotations.Test;

public class Decription {

	@Test(description="Mobile Application")
	void test1() {
		System.out.println("Test case 1");
	}
	@Test(description="Web Application")
	void test2() {
		System.out.println("Test case 2");
	}
	@Test(description="API Application")
	void test3() {
		System.out.println("Test case 3");
	}
	
}
