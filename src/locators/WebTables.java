package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3school.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//To get count of Rows and Columns
		
		List<WebElement> allRows = driver.findElements(By.xpath(""));
		int rowSize=allRows.size();
		System.out.println("Number of rows present in the table are:"+rowSize);
		
		
		List<WebElement> allColumns = driver.findElements(By.xpath(""));
		int colSize= allColumns.size();
		
		System.out.println("Number of columns present in the table are:"+colSize);
		
		
	}

}
