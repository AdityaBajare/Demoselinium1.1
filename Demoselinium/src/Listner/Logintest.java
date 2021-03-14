package Listner;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Logintest {
	
	@Test()
	public void loginbyemail() {
		System.out.println("Login by email");
		Assert.assertEquals("Aditya", "Aditya");
	}
	@Test
	public void loginbyfacebook() {
		System.out.println("Login by facebook");
		Assert.assertEquals("Aditya", "Patil");
	}

}
