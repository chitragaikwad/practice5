package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.get("https://www.amazon.com");
		driver.findElement(By.partialLinkText("sign in")).click();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
//		driver.findElement(By.cssSelector("input#ap_email")).sendKeys("hellother@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input.a-button-input[id=\'continue\']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("12345678");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[id=\'signInSubmit\']")).click();
	}

}
