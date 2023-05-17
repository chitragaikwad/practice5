  package locators;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alldataprinting {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
File xcelFile=new File("");
  FileInputStream fis = new FileInputStream(xcelFile);
  XSSFWorkbook wb = new XSSFWorkbook(fis);
  XSSFSheet sheet = wb.getSheetAt(1);
  XSSFRow row  = sheet.getRow(0);
  String data = sheet.getRow(0).getCell(0).getStringCellValue();
  //System.out.println(data);
  int row_count=sheet.getLastRowNum();
  int col_count=row.getLastCellNum();
  for (int i=0;i<row_count;i++) 
  {
	 for(int j=0;j<=col_count;j++) 
	 {
		String eachData = sheet.getRow(1).getCell(j).getStringCellValue();
		System.out.println(eachData+"  ");
		}
	 System.out.println();
  }
  
	}

}
