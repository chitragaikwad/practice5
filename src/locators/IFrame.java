   package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args)throws  InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	// three types of switchTo().frame:
	//	1.switchTo().frame(index-return type int)- Indexing as usual starts from 0
	//	2.switchTo().frame("String Id or Name")-only id or name attribute value of the iframe has to be passed
	//  3.switchTo().frame(WebElement variable)
		
		
		driver.switchTo().frame("the_iframe");     // Id of the frame is passed over here
		driver.findElement(By.xpath("//button[contains(text(),'Hi parent')]")).click();
		Thread.sleep(2000);
		String iframe_msg =driver.findElement(By.xpath("h1[contains(text(),'Hello there']")).getText();
		System.out.println(iframe_msg);
		driver.switchTo().parentFrame();  //Used to go to previous frame or if there is only 1 iframe then it will take to main page
		//driver.switchTo.deafaultContent(); //used to directly go to the main page
		driver.findElement(By.id("message_button")).click();
		String main_msg=driver.findElement(By.xpath("//h1[contains(text(),'iframe-c']")).getText();
		System.out.println (main_msg);
		
		
		
		
		
	}

}
