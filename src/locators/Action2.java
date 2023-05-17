 package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html/");
		
		
		WebElement elementDoubleClick=driver.findElement(By.tagName("button"));
		
		Actions act = new Actions(driver);
		//Actions method for double clicking an element
		//option 1
		act.moveToElement(elementDoubleClick);
		act.doubleClick().perform();
		
		//option  2
		act.doubleClick(elementDoubleClick).perform();
		
		
		//option 3
		//When multiple actions have to be executed,first you have to write .build()then to run it you have write.perform()everytime
		act.moveToElement(elementDoubleClick).doubleClick().build().perform();
		
	}

}
