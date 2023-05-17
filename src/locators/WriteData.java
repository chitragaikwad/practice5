package locators;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData { //===============Write data in excel =============

	public static void main(String[] args)throws InterruptedException,IOException {
		// TODO Auto-generated method stub
File xcelFile = new File("C:\\\\\\\\apachi practice2.xlsx");
FileInputStream fis = new FileInputStream(xcelFile);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(1);
sheet.getRow(1).createCell(2).setCellValue("valid Username &Password");
sheet.getRow(2).createCell(2).setCellValue("Valid Username but Invalid Password");
sheet.getRow(3).createCell(2).setCellValue("InValid Username & Password");

FileOutputStream fos = new FileOutputStream(xcelFile);

wb.write(fos);
wb.close();
System.out.println("Data Entered Successfully");


	}

}
