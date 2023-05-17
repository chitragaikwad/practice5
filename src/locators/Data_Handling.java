package locators;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Data_Handling {
public String fetchDatafromExcel(String sheetName,int row,int col)throws  IOException
{
	File xcelFile = new File("C:\\apachi practice2.xlsx");
	FileInputStream fis =new FileInputStream(xcelFile);
	XSSFWorkbook wb=new XSSFWorkbook(fis);//excel file with  extension of .xlsx
	//HSSFWorkbook hwb = new HSSFWorkbook(fis); //Excel file with the extension of .xls(excel file prior to micro soft office1995-2003)
      XSSFSheet sheet=wb.getSheet(sheetName);
  String data = sheet.getRow(row).getCell(col).getStringCellValue();
	return data;
	}
              public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		 Data_Handling dh= new  Data_Handling();
		String validUsername = dh.fetchDatafromExcel("Sheet1", 1, 0);
		String validPassword = dh.fetchDatafromExcel("Sheet1", 1, 1);
		
		//String invalidUsername=dh.fetchDatafromExcel("Sheet2", 2, 0);
		//String invalidUsername=dh.fetchDatafromExcel("Sheet2", 2, 0);
		
	driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(validUsername);
	driver.findElement(By.id("password")).sendKeys(validPassword);
	
	
	driver.findElement(By.id("login-button")).click();
		
		
		
		
		
	}

}
