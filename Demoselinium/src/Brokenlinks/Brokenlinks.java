package Brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
	  	
	  	WebDriver driver= new FirefoxDriver();
	  	
	  	driver.get("http://demo.guru99.com/test/newtours/");
	  	
	  	// we need to capture all the links from web page
	  	// count numbr of links(size)
	  	
	  	// capture links fron web page
	  	
	  	List<WebElement> links=driver.findElements(By.tagName("a"));
	  	
	  	System.out.println(links.size());
	
	for(int i=0;i<links.size();i++) {
		
		// by using href attribute we can get URL of requirednlink
		
		WebElement element=links.get(i);// return element
		
	String url=	element.getAttribute("href");// href give u link of anchor tag
	
	URL link= new URL(url);
		
	// create connection using url object
	
	HttpURLConnection  httpcon=(HttpURLConnection) link.openConnection();  //check link is connecting target page or not
	Thread.sleep(2000);
	httpcon.connect(); // establish connection
	
	int responsecod=httpcon.getResponseCode();
	
	if(responsecod>=400) {
		System.out.println(url +" " +"is broken link");
	}
	else {
		System.out.println(url +" "+"is valid link");
	}
	
	}
	  	
		driver.close();
	}
	

}
