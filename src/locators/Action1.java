package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html/");
		
		// action methods for right clicking an element
		//To execute any actions method you need to use.perform() each time
		WebElement rightClick=driver.findElement(By.xpath("//span[contains(text(),'right click')]"));
		Actions act = new Actions(driver);
		// Approach #1
		
//		act.moveToElement(rightClick);
//		Thread.sleep(2000);
//		act.contextClick().perform();
		//Approach #2
//      act.contextClick(rightClick).perform();
		
		//Approach #3
		
		act.moveToElement(rightClick).contextClick().build().perform();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}

}
