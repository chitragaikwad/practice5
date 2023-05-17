package locators;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WtiteData2 {//===========================write data in Excel -application=============================================

	public static void main(String[] args)throws InterruptedException,IOException {
		// TODO Auto-generated method stub
		File xcelFile = new File("C:\\\\\\\\apachi practice2.xlsx");
		FileInputStream fis = new FileInputStream(xcelFile);
		
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		
		
		String username = sheet.getRow(2).getCell(0).getStringCellValue();
		String password = sheet.getRow(2).getCell(1).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		
		WebElement cartLogo = driver.findElement(By.id("shopping_cart_conditioner"));
		
		if(cartLogo.isDisplayed())
		{
			sheet.getRow(1).createCell(2).setCellValue("Username"+username+"& password"+password+"IS VALID");
			FileOutputStream fos = new FileOutputStream(xcelFile);
			
			wb.write(fos);
			wb.close();
			System.out.println("Data is valid");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
