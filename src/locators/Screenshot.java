package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement r = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		File source = r.getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(4);
		File destination=new File("C:\\\\Users\\\\HP\\\\Desktop\\\\chitra\\\\seli\\TC001"+random+".png");
		
		FileHandler.copy(source,destination);
	}

}
