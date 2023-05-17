 package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonActions {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement fName =driver.findElement(By.xpath(""));
		WebElement maleRadio = driver.findElement(By.name(""));
		WebElement pwd =driver.findElement(By.id("firstpassword"));
		//Alternative methods for various syntaxes using Actions Class
		Actions act = new Actions(driver);
		
		//Alternative to fName.sendKeys("Hello");
		act.sendKeys(fName,"Hello").perform();
		
		//Alternative to WebDriverWait
		act.pause(Duration.ofSeconds(3)).perform();
		
		//Another method for Thread sleep
		act.pause(2000).perform();
		
		//Another way of maleRadio.click();
		act.click(maleRadio).perform();
		//act.moveToElement(maleRadio).click().build().perform();  //one more way of writing act.click()
		   
		
		//optional method for JavaScriptExecutor Scroll Method
		act.scrollToElement(pwd).perform();
		
		
		
		
}
}
