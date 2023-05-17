package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_element1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Multiple Link Handling
		List<WebElement> fb_links=driver.findElements(By.tagName("a"));
		int linkNum =fb_links.size();//used for finding the total number of links with anchor ('a')tag name
		System.out.println("Numbers of links presents in facebooks are:"+linkNum);
		String Beauty="Beauty";
		for(WebElement link :fb_links) 
		{
			String linkTexts=link.getText();
			System.out.println(linkTexts);
		
			
			if(linkTexts.equalsIgnoreCase(Beauty)) //Clicking on a particular link which has link text as "Electronics"
			{
				link.click();
				break;
			}
		
		
	} 
	}
}


