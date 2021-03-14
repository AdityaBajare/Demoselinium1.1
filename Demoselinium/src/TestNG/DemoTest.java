package TestNG;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class DemoTest {
	
@org.testng.annotations.Test
	public void loginTest() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement uname=driver.findElement(By.name("userName"));
		
		WebElement pass=driver.findElement(By.name("password"));
		
		Assert.assertTrue(uname.isDisplayed());
		uname.sendKeys("Aditya");
		
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("Patil");
		
		driver.findElement( By.name("submit")).click();
		
		
		String extitle="Welcome: Mercury Tours";
		Assert.assertEquals(extitle,driver.getTitle());
		
		driver.close();
		
		
		
	}

}
