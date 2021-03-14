import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogintestHashmap {
	
	static HashMap<String, String> logindata(){
		
		HashMap<String, String> hm=new HashMap<String,String>();
		hm.put("x", "adi@patil");
		
		hm.put("y", "yash@patil");
		
		
		return hm;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
  System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
    	
    	
    	
    	WebDriver driver = new FirefoxDriver(); 
    	driver.get("http://demo.guru99.com/test/newtours/");
    	
    	
    	
    	String login= logindata().get("x");
    	System.out.println(login);
    	String arr[]=login.split("@");
    	
    	driver.findElement(By.name("userName")).sendKeys(arr[0]);
    	driver.findElement(By.name("password")).sendKeys(arr[1]);
		
    	driver.close();
	}
	
}
	
	