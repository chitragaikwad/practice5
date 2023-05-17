package locators;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException,IOException{
			File xcelFile = new File("C:\\\\apachi practice2.xlsx");
			FileInputStream fis =new FileInputStream(xcelFile);
		    XSSFWorkbook wb=new XSSFWorkbook(fis);
		//==================================Method 1 to read data from excel===============================================
		
//			XSSFSheet sheet=wb.getSheetAt(0);
//			XSSFRow row =sheet.getRow(0);
//			XSSFCell col=row.getCell(1);
//			String firstname1=col.getStringCellValue();
//			System.out.println(firstname1);
//			
//			
//			
//			XSSFRow row1 =sheet.getRow(0);
//			XSSFCell col1=row.getCell(1);
//		    String Lastname=col.getStringCellValue();
//			System.out.println(Lastname);
			//-------------------------------------Method 2 to read data from excel-----------------------------------
			String Firstname=wb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
			System.out.println(Firstname);
			String Lastname=wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
			System.out.println(Lastname);
			
			System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
		   driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys(Firstname);
			
		   driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys(Lastname);
		
		}

}
