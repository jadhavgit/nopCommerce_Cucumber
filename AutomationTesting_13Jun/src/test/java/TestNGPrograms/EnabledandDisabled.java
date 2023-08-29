package TestNGPrograms;

import org.testng.annotations.Test;

public class EnabledandDisabled {
	@Test(enabled=false)
	public void MobileLogin() {
		System.out.println("Mobile Login");
	}
	@Test
    public void WebLogin() {
		System.out.println("Web Login");

	}
	@Test(enabled=true)
    public void APILogin() {
		System.out.println("API Login");

	}
	

}
