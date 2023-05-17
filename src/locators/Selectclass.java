package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args)  throws  InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id, \"u_0_0\")]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Algorithm");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tech");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("support@algorithmtech.in");	
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("support@algorithmtech.in");
		driver.findElement(By.id("password_step_input")).sendKeys("algo@12345");
		
		//WebElement day_list = driver.findElement(By.id("day"));
		WebElement month_list = driver.findElement(By.id("month"));
		WebElement year_list = driver.findElement(By.id("year"));
		
		// To handle List box /Drop down/Select box/Menu,we have to import the select class.
		//Then to select any item we have 3 methods.
		//    a.selectByValue("String value")
		//    b.selectByVisibleText("String")
		//    c.selectByIndex(int)
		
		Select sel1 = new Select(driver.findElement(By.id("day")));//Either you can pass the WebElement variable 
		                                                            //  or directly use driver.findElement(by.)inside the select
		sel1.selectByIndex(4);
        sel1.selectByValue("5");
		sel1.selectByVisibleText("19");
	
//		
//		Select sel2 = new Select(month_list);
//		sel2.selectByVisibleText("Apr");
//		
//		Select sel3 = new Select (year_list);
//		sel3.selectByValue("2000");
		
		
		
		
	}



	}


