package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args)throws  InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("a//[@href=\"AMultiple\"]")).click();
		WebElement parentframe=driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
//      WebElement childFrame=driver.findElement(By.xpath("//iframe[@src=/"https://www.w3school.com\"]"));
		Thread.sleep(1000);
		//driver.switchTo().frame(childIframe);     //for some reason we couldn't use it , we were facing NosuchElement Exception
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'The iframe')]")).getText());
		driver.switchTo().frame(0);   //Instead we have used indexing to access the child frame
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'search2\']")).sendKeys("Hello12345");
		driver.switchTo().defaultContent(); //It has directly taken into main web page
		//driver.switchTo().parentFrame();//This syntax will take to main web page
		driver.findElement(By.xpath("//[@title=\'change Theme\']")).click();
		
	}

}
