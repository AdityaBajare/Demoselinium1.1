package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Batchtesting {
	
	@BeforeTest
	public void logintoApplication() {
		
		System.out.println("Login to application");
		
	}
	
	@AfterTest
	
	public void logoutApplication()
	
	{
		System.out.println("log out");
		
	}
	@Test(description = "This is login test")
	public void loginTest() {
	System.out.println("Test is passed");	
	}

@Test(description = "This is logout test")
public void logoutTest() {
	System.out.println("test is pass");
}
	
}
