package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("input[id='/nav-logo-sprites\']")).click();
		
//		driver.findElement(By.cssSelector("input/'[id='nav_cs_sell\']"));
//		driver.findElement(By.name("Customer Service")).click();
//		driver.findElement(By.xpath();
	}

}
