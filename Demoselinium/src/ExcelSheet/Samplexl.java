package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Samplexl {
	
	public static void main(String[] args) throws IOException {
		
		// point to xl sheet means oprn a file in input format
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Files\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");  
		 
		
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Documents\\sampledata.xlsx");
		
	/*	WebElement reg=
		 driver.findElement(By.xpath("//*[@id=\"u_0_2\"]"));
		
		reg.click();
		
		Select year= new Select(driver.findElement(By.id("year")));
		
		year.selectByVisibleText("2014");
		
		*/
		
		
		// open a workbook
		
		XSSFWorkbook work=new XSSFWorkbook(file);
		
		XSSFSheet sheet=work.getSheetAt(0);
		
		int rcount= sheet.getLastRowNum();
		
		int ccount= sheet.getRow(0).getLastCellNum(); 
		
		System.out.println("rows are " +rcount);
		
		System.out.println("cells are " +ccount);
		
		System.out.println();
		
		for(int i=1;i<2;i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<ccount;j++) {
			
			int First_name=(int)row.getCell(2).getNumericCellValue();
			
			System.out.println(First_name);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(String.valueOf(First_name));
			
			
		}
			System.out.println();
		
		}
		
		
		
		
		
		
		
		
	}

}
