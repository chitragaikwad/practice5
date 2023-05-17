package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//1. Implicit wait - used once in the scripting
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Maximum wait time to find an element
		
		//driver.manage().timeouts().pageloadTimeout(Duration.ofSeconds(20));  // Maximum time to load the page
		
		//2.Explicit Wait - used for certain Elements based on the requirement
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.alertIsPresent());   // wait until alert is shown
		 driver.switchTo().alert().accept();
		 
		wait.until(ExpectedConditions.titleContains("window"));
		System.out.println("Title is "+driver.getTitle());    //  wait unless the title contains the particular string
		
		
		//3.Fluent Wait - same as explicit wait with additional advantage of frequency with which will find the element
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		                              .withTimeout(Duration.ofSeconds(10))
		                              .pollingEvery(Duration.ofSeconds(1))
		                              .ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.alertIsPresent());
				
		
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
