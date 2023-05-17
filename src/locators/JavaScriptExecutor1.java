package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Scrolling using java script executor
		
		//1.Scrolling by pixel Height
		
		
		jse.executeScript("window.scrollBy(0,2000)","");  //Downward Vertical scrolling
		jse.executeScript("window.scrollBy(0,-1000)","");  //Upward vertical Scrolling
		
		//jse.executeScript("window.scrollBy(200,0):,"");  //Sideways Horizontal Scrolling
		
		
		//2. Scrolling to the bottom of the page
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//3.Scroll up to a particular WebElement
WebElement sellOnAmazon =driver.findElement(By.xpath("//h2[contains(text(),'Sell on Amazon with 50% off on Selling Fee')]"));
jse.executeScript("arguments[0].csrollIntoView(true);",sellOnAmazon);
		
		
		
		
	}

}
