package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookietest {
	
	public static void main(String[] args) {
		

	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
	
	  	WebDriver driver=new FirefoxDriver();
	  	
	  	driver.get("http://www.amazon.in/");
	  	//how capture all cookies
	
	
    
	/*for(Cookie c:cookies) { //read n print all the cookies
		
		System.out.println(c.getName() +": "+	c.getValue());
		
	
}*/
	
	// get cookie by name
	
	
	System.out.println(driver.manage().getCookieNamed("session-id-time"));
	
	Cookie obj=new Cookie("My Cookie","12345");
	
	driver.manage().addCookie(obj);
	
Set <Cookie> cookies=	driver.manage().getCookies();
	
	System.out.println(cookies.size());
	
	for(Cookie c:cookies) {
		
		System.out.println( c.getName()+" "+c.getValue());
		
	}
	
	driver.manage().deleteCookieNamed("My Cookie");
	
System.out.println("afer delete");
	
	System.out.println(cookies.size());
	
	for(Cookie c:cookies) {
		
		System.out.println( c.getName()+" "+c.getValue());
		
	}
	
	System.out.println("delete all cookies");
	
	driver.manage().deleteAllCookies();
	
	
System.out.println(cookies.size());
	
	
	
	
		driver.close();
		
		
	}
	

}
