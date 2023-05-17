 package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html/");
		
		
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK']"));
		
		WebElement dest = driver.findElement(By.xpath("//ol[@id=\'bank']"));
		
		Actions act =new Actions(driver);
		
		act. dragAndDrop(src,dest).build().perform();
		
	//Alternate method for drag and drop,by using moveElement,clickAndHold and release	
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
	//How do you hover any WebElement??
//Ans:By using actions class,and the method which will be used is moveToElement(WebElement)
	}

}
