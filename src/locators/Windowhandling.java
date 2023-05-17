package locators;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//MULTIPLE WINDOW HANDLING/HANDLING CHILD BROWSER POPUP/ TO SWITCH BETWEEN VARIOUS TABS
		
		//String id1=driver.getWindowHandle();   //USED TO GET THE WINDOW HANDLE/TAB ODOF CURRENT TAB
	//	System.out.println(id1);
		
		
		Set <String> id = driver.getWindowHandles();   // Used to get the window Handles of multiple tabs
		
	//	Note:The window handles changes in every session of your Selenium code execution.
		
	ArrayList <String>windowID=new ArrayList<>(id);
//		 
	String parentWindow =windowID.get(0);
String childWindow = windowID.get(1);
//		
		
	driver.switchTo().window(parentWindow); //Accessing individual tabs by using this switchTo().handle
	Thread.sleep(2000);
	driver.switchTo().window(childWindow);
	Thread.sleep(3000);
	//driver.switchTo().window(windowID.get(0)); //Alternate method to directly call the required tab
//				
	}

}
