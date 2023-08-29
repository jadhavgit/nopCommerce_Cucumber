package TestNGPrograms;

import org.testng.annotations.Test;

public class InnocationDemo {

	@Test(invocationCount=5)
	public void testmethod1() {
		System.out.println("Test method 1");
	}
	@Test
	public void testmethod2() {
		System.out.println("Test method 2");
	}
	
	
	
}
