package Datadriventframeworktestng;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivventtest {
	
	WebDriver driver;
	@BeforeClass
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.website.com/sign-in/");
	}
	
	@Test(dataProvider = "Logindata")
	public void logindata(String user, String pass,String result) {
		
	
	
	WebElement email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	email.clear();
	email.sendKeys(user);
		
	WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	Password.clear();
	Password.sendKeys(pass);
	
	driver.findElement(By.xpath("//*[@id=\"signin-submit2\"]"));
		
	}
	
	@DataProvider(name="Logindata")

	public String[][] getdata() {
		
		String loginData[][] = {
				
				{"adi@gmail.com",	"Aditya123",	"valid"},
				
				{"aditya@gmail.com",	"Aditya@123",	"invalid"},
				
				{"Aadi@gmail.com",	"Adii@123",	"invalid"},
				
				{"Aaditya@gmail.com",	"Aaditya@123",	"invalid"}
		};
		
				
				return loginData;
	
			
		
		
		
	}
	
	@AfterClass
	void down() {
		driver.close();
	}
	
}
