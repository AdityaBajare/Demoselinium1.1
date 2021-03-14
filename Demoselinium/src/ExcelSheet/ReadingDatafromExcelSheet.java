package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.xml.bind.v2.util.DataSourceSource;

public class ReadingDatafromExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
		// point to 1st xl file
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Documents\\salaryslip.xlsx"); // open file
		
		System.out.println("opend xl file");
		
		XSSFWorkbook work=new XSSFWorkbook(file);
		
		XSSFSheet sheet= work.getSheet("Sheet1"); // sheet name
		
		// XSSFSheet sheet= work.getSheetAt(0); // for index number
		
		// to count rows and column in excel sheet
		
		int rcount=sheet.getLastRowNum(); // calculate row in xl sheet
		
		int ccount=sheet.getRow(0).getLastCellNum(); // calculate column in xl sheet
		
		System.out.println("row num are " +rcount);
		
		System.out.println("column no are " +ccount );
		System.out.println();
		
		// read data from xl sheet
		
		for(int i=0;i<rcount;i++) 
		
		{    // getting current row
			
			XSSFRow currentrow= sheet.getRow(i); // stored current row number
			
			for(int j=0;j<5;j++) {  // getting current cell
				
				
				String value=currentrow.getCell(j).toString(); // getting value of current cell
				
				System.out.println("   "+value);
				
			}
			
			System.out.println();
		}
		
		
		
		
	}

	
	
}
