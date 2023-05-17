package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\\\Users\\\\HP\\\\Desktop\\\\chitra\\\\seli\\");
		
		FileHandler.copy(source,destination);
	}

}
