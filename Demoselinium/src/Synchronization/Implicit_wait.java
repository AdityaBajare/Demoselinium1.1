package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // dynamic wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//its a global wait which applicable for all elements
		
		//Element not visible exception
		
		//Elementnotvisibleexception
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.name("userName")).sendKeys("Aditya");
		
		driver.findElement(By.name("password")).sendKeys("Patil");
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	
		System.out.println("clicked on submit");
		//driver.close();
	}

}
