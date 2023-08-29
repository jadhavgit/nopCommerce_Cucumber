package TestNGPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

	
	@Test
	@Parameters({"a","b"})
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	
	
	@Test
	@Parameters({"a","b"})
	public void sub(int a,int b) {
		System.out.println(a-b);
		
	}
}
