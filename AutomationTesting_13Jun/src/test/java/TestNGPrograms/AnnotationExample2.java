package TestNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample2 {
	@AfterClass
	public void beforeSuite() {
		System.out.println("This is BeforeSuite ");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is BeforeMethod");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is BeforeClass ");
	}
	
	@Test
	public void Test1() {
		System.out.println("This is my Test1 method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is AfterMethod");
	}
	@AfterClass
	public void AfterClass () {
		System.out.println("This is AfterClass ");
	}
	
	@AfterClass
	public void afterSuite () {
		System.out.println("This is AfterSuite ");
	}
	
	
	
}
