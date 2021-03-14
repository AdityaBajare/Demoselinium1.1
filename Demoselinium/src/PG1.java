
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {
    public static void main(String[] args) throws InterruptedException {
    	
    	// which browser we are going to use 
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
    
    	WebDriver driver = new FirefoxDriver(); // invoke the browser
      
    	String baseUrl = "http://www.facebook.com";
       
    	String tagName = "";
        
        
        
       
        

        
        
        driver.get(baseUrl); // open URL on browser
        
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        
        
     
        
        
         //driver.findElement(By.id("email")).sendKeys("8308158556");
        
        // 1 For Id
        
   /*  WebElement uname=  driver.findElement(By.id("email"));
      
     uname.sendKeys("8308158556");
      
      Thread.sleep(5000);
      
      WebElement pass=  driver.findElement(By.id("pass"));
      
      pass.sendKeys("aditya");
      
      Thread.sleep(5000);
      
      
      
      WebElement signbtn =  driver.findElement(By.id("u_0_b"));
      
      signbtn.click();/*
      
      
   
     // 2 For Name 
        
      /*  driver.findElement(By.name("email")).sendKeys("8308158556");
        
        driver.findElement(By.name("pass")).sendKeys("aditya");
        
       // ((WebElement) driver.findElements(By.name("pass"))).sendKeys("8308158556");
        
        Thread.sleep(3000);
        
        driver.findElement(By.name("login")).click();  */
        
        
        // 3 xpath
        
      /*  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8308158556");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Aditya");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@id='u_0_b\']")).click();
        
        
        
      
      System.out.println("Clicked on button"); */
        
      // 4 css selectors  
        
        /*driver.findElement(By.cssSelector("#email")).sendKeys("8308158556");
        
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("#pass")).sendKeys("aditya");
        
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("#u_0_b")).click(); */
        
        // 5 linktext ; only for links
        
      //  driver.findElement(By.linkText("Forgotten password?")).click();
        
       // driver.findElement(By.linkText("open-registration-form-button")).click();
        
        //driver.findElement(By.id("u_0_2")).click();
        
       // driver.findElement(By.linkText("Create a Page")).click();
        
        // 6 partial link text
        
       // driver.findElement(By.partialLinkText("Forgotten")).click();
        
        // 7 class name
        
      // driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("8308158556");
        
        //driver.findElement(By.className("_6lux")).sendKeys("aditya");
        
       // driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
   
        driver.close();
        System.exit(0);
}
}