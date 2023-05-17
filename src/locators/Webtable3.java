package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {

	public static void main(String[] args)  throws InterruptedException
	
		// TODO Auto-generated method stub
	
	//Fetching Data of all rows and columns from webTables
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		for(int i=2;i<=7;i++) {
			for(int j=1;j<=3;j++) {
				WebElement allData = driver.findElement(By.xpath("//table[@id=\'customers'\"]//tr["+i+"]//td["+j+"]"));
				String cellData = allData.getText();
				System.out.print(cellData+"  ");
				}
			System.out.println();
		}
		
		
	}

}
