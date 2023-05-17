package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args)throws  InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		//Thread.sleep(500);
	//WebElement r=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 // r.sendKeys("mobile");  
	//  Thread.sleep(500);
	  //driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click(); 
	//  driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
	 // Thread.sleep(1000);
	 // driver.findElement(By.xpath("//a[@class='nav-a  ']")).click();
	 // Thread.sleep(1000);
	//  driver.findElement(By.xpath("//span[@class='nav-line-1 nav-progressive-content']")).click();
	  
	//driver.findElement(By.xpath("//div[@class='nav-search-submit-text nav-sprite nav-progressive-attribute]")).click();
	driver.findElement(By.xpath("//span[@class='nav-line-1']")).click();
	}
	
	

}
