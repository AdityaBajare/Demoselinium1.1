package ExcelSheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeinxl {
	
	public static void main(String[] args) throws IOException {
		
	FileOutputStream file=new FileOutputStream("C:\\Users\\hp\\Documents\\sample.xlsx");
	
	XSSFWorkbook book =new XSSFWorkbook();
	
	XSSFSheet sheet= book.createSheet("Sheet1");
	
	XSSFSheet sheet1=book.createSheet("Sheet2");
	
	for(int i=0;i<5;i++) {
		
		XSSFRow row=sheet.createRow(i);
		
		XSSFRow row1=sheet1.createRow(i);
		
		for(int j=0;j<3;j++) {
			
			row.createCell(j).setCellValue("ABC");
			row1.createCell(j).setCellValue("XYZ");
		}
		
	}
	
	book.write(file);
	
	file.close();
	
	System.out.println("data written successfully");
	
	
	
	
	}

}
