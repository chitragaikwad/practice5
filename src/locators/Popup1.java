package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		//handling alert pop-up
		Alert alt=driver.switchTo().alert();//driver.switchTo().alert().accept();====direct method without using Alert class
		Thread.sleep(2000);
		
		alt.accept(); //To press OK
		alt.dismiss();//To press Cancel
		
		String popupText=alt.getText();  // To get the text of the Pop -up
		System.out.println(popupText);
		
		alt.sendKeys("Algotech");      //To send some value in the text box of pop-up
		Thread.sleep(2000);
		alt.accept();
		
		
	}

}
