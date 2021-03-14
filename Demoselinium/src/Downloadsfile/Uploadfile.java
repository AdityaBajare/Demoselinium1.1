package Downloadsfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadfile {
	
	public static void main(String[] args) {
		
		//webdriver+sikuli http://demo.guru99.com/test/upload/
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get(" http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
	WebElement uploadElement=	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	
	
	
	uploadElement.sendKeys("C:\\Users\\hp\\Documents\\sample.xlsx");
	
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("submitbutton")).click();
	
		
		
		
		
	}

}
