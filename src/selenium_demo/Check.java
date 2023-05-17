package selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	public static void main(String[] args) 
	{
		String s= "title";
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		//System.out.println(driver.getTitle());
		//System.out.println("Actual title String:"+s);
		driver.quit();// This method is  to close the browser
		driver.close();// This method is only used when you have to close one tab
		
		if (s.equals("google")) {
			
		  driver.quit();	
		}
		else
			System.out.println("Title dose not match");
		
		
	}
}
