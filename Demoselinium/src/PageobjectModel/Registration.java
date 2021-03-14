package PageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	WebDriver driver;
	
	By Reg=By.linkText("REGISTER");
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By Phoneno=By.name("phone");
	By Email=By.name("userName");
	By Address=By.name("address1");
	By City=By.name("city");
	By State=By.name("state");
	By Country=By.name("country");
	By Uname=By.xpath("//*[@id=\"email\"]");
	By Password=By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input");
	By CPassword=By.name("confirmPassword");
	By Submit=By.name("submit");
	
	Registration(WebDriver d){
		
		driver=d;
	}
	
	public void clickRegLink() {
		
		driver.findElement(Reg).click();
	}
	
public void FirstName(String fname) {
		
		driver.findElement(Fname).sendKeys(fname);
	}
	
public void LastName(String lname) {
	
	driver.findElement(Lname).sendKeys(lname);
}

public void Phoneno(String ph) {
	
	driver.findElement(Phoneno).sendKeys(ph);
}

public void Emailid(String email) {
	
	driver.findElement(Email).sendKeys(email);
}

public void Address(String address) {
	
	driver.findElement(Address).sendKeys(address);
}

public void City(String city) {
	
	driver.findElement(City).sendKeys(city);
}

public void State(String state) {
	
	driver.findElement(State).sendKeys(state);
}

public void Country(String sc) {
	
	 WebElement scn= driver.findElement(Country);
	 Select drop=new Select(scn);
	 drop.selectByVisibleText(sc);
}

public void UserName(String uname) {
	
	driver.findElement(Uname).sendKeys(uname);
}

public void Password(String pd) {
	
	driver.findElement(Password).sendKeys(pd);
}

public void ConfirmPassword(String cpd) {
	
	driver.findElement(CPassword).sendKeys(cpd);
}

public void Submit() {
	
	driver.findElement(Submit).click();
}

	
	
	
	
	
}
