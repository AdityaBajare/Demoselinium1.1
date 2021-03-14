package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//driver.get("http://www.facebook.com");
		
		driver.get("http://www.facebook.com");
		
    System.out.println(driver.getTitle());
    
    System.out.println(driver.getCurrentUrl());
    
   
    
  String text=  driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).getText();
  
    System.out.println("text is" +text);
    
   // String text=  driver.findElement(By.id("email")).getText();
    
   
    
    
  
  //System.out.println("text is " +text);
    
    
    driver.close(); //close only current browser or close close one tab
    
    driver.quit(); // close all the browser or close all tabs
    
    
		
		
	}

}
