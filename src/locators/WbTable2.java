package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbTable2 {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3school.com/html/html_tables.asp");
		
		
		//for getting values of a particular  column
		
		List<WebElement>firstRow = driver.findElements(By.xpath(""));
		for(WebElement rowValues:firstRow) 
		{
			String rows = rowValues.getText();
			System.out.println(rows);
			System.out.println("");
		}
	// for getting the values of a particular column
		
		List<WebElement>firstCol = driver.findElements(By.xpath(""));
		for(WebElement columnValues:firstCol) 
		{
			String cols=columnValues.getText();
			System.out.println(cols);
			System.out.println(" ");
			
		}
		
		
		
		
	}

}
