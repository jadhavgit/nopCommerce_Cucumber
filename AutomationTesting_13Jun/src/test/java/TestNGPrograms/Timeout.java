package TestNGPrograms;

import org.testng.annotations.Test;

public class Timeout {
	@Test(description="Mobile Application")
	void test1() {
		System.out.println("Test case 1");
	}
	@Test(timeOut=200)
	void test2() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test case 2");
	}
	@Test(description="API Application")
	void test3() {
		System.out.println("Test case 3");
	}
	
}
