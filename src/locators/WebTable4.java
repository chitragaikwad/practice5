package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Fetching data of all rows and columns along with headers from WebTable
		
		List<WebElement>allRows=driver.findElements(By.xpath("//table[@id=\"customers\"]/today/tr"));
		int rowSize = allRows.size();
		List<WebElement>allColumns = driver.findElements(By.xpath("//table[@id=\"customers\"]/today/tr[2]/td"));
		int colsize = allColumns.size();
		for(int i=1;i<=rowSize;i++) 
		{
			for(int j=1;j<colsize;j++) 
			{
				if(i==1) 
				{
					WebElement allData =driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//th["+j+"]"));
					String cellData = allData.getText();
					System.out.print(cellData+"   ");
					}
				else
				{
					WebElement allData =driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//td["+j+"]"));
					String cellData = allData.getText();
					System.out.print(cellData+"   ");
				}
				System.out.println();
			}
		}
		
		
		
	}

}
