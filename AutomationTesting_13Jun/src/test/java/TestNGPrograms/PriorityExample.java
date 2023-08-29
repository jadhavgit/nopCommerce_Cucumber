package TestNGPrograms;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=2)
	void apple() {
     System.out.println("This is apple");
	}
	@Test(priority=3)
	void book() {
		System.out.println("This is book");
	}
	
	@Test(priority=1)
	void cat() {
		System.out.println("This is cat");
	}
	@Test(priority=0)
	void dog() {
		System.out.println("This is dog");
	}
	@Test(priority=-1)
	void egg() {
		System.out.println("This is egg");

	}
	@Test(priority=100)
	void fish() {
		System.out.println("This is fish");

	}

}
