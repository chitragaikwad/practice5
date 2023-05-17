package tataCliQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBar {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chitra\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.tatacliq.com/");
boolean searchbarPresence = driver.findElement(By.xpath("//input[@id='search-text-input']")).isDisplayed();
System.out.println(searchbarPresence);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='search-text-input']")).click();
//Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='search-text-input']")).sendKeys("sh");
List<WebElement> searchforproduct=driver.findElements(By.xpath("//input[@class='Input2__inputBox Input2__hidePlaceholder']"));
System.out.println(searchforproduct.size());
for(WebElement Topproduct :searchforproduct)
{
	String option=Topproduct.getText();
	System.out.println(option);
	if(option.contains("irt"));
	{
	Topproduct.click();
		
}

}
	
	}
}


