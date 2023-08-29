package TestNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	@BeforeMethod
	public void startup() {
		System.out.println("This is startup method");
	}
	@AfterMethod
	public void loging() {
		System.out.println("This is loging method");
	}
	
	@BeforeClass
	public void logout() {
		System.out.println("This is logout method");
	}
	@AfterClass
	public void teardown() {
		System.out.println("This is teardown method");
	}
	
	@Test
	public void Test1() {
		System.out.println("This is my Test1 method");
	}




}
