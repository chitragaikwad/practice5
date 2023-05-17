package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.com");
		//tagname[attirbute='value']
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div"));
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("button[name=\'login\']")).click();
		driver.findElement(By.xpath("//[@class='select'][1]"));
		
		
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("helloother@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("123456");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("button[name=\'login\']")).click();
		
		
		
		
		//Ctrl+shift+i  ======== to find out the element quickly
		
		
		
//		driver.findElement(By.name("email")).sendKeys("absget@hotmail.com");
//		Thread.sleep(2000);
//		//driver.findElement(By.id("pass")).sendKeys("12345");
//		//Thread.sleep(2000);
//		//driver.findElement(By.name("login")).click();
//		//Thread .sleep(2000);
//		driver.findElement(By.partialLinkText("Forgotten Password")).click();
//		driver.findElement(By.linkText("Password")).click();
//		
	}

}
