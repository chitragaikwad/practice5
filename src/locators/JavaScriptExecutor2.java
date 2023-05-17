package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        JavascriptExecutor jse = (JavascriptExecutor)driver;
//Alternative methods using Javascript Executor
  //1.Clicking on an webElement, that is click method
 //Note: This method should be used when the element is hidden  in the web page,when.click() gives NoSuch Element exception
        WebElement radio = driver.findElement(By.xpath("//input[@value=\"Female\"]"));
        jse.executeScript("arguments[0].click()",radio);
        
  // 2.Input Text in fields - sendKeys("")method
        jse.executeScript("document.getElementById('firstpassword').values='Algotech@123';");
        
  // 3.Get title of the Web page - get title()method
        String titleOfPage = jse.executeScript("return document title;").toString ();
        System.out.println(titleOfPage);
        
  //4.Refreshing the page - nevigateTo().refresh()method
        jse.executeScript("history.go(0)");
         
   //5.Navigate to different page - navigateTo().refersh()method
        jse.executeScript("window.location='https://www.google.com");
        
        
        
        
	}

}
