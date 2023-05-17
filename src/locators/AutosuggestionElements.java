package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionElements {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mi");
		Thread.sleep(2000);
		List<WebElement> Allsuggestions=driver.findElements(By.id("nav-flyout-searchAjax"));
		System.out.println(Allsuggestions.size());
		for(WebElement suggest:Allsuggestions)
		{
			String option=suggest.getText();
			System.out.println(option);
			if(option.contains("xer"));
			{
			suggest.click();
		}
		
	}

}
}
