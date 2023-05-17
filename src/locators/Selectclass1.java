package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass1 {

	public static void main(String[] args)throws  InterruptedException {
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
		
		WebElement day_list = driver.findElement(By.id("day"));
		WebElement month_list = driver.findElement(By.id("month"));
		WebElement year_list = driver.findElement(By.id("year"));
		
//.getOptions()-This method is used to retrive all the items present in the select Dropdown. return type of this method is List
		//<WebElement>
//Firstly,select class needs to called and an object of it has to be created.
//Then create a List<WebElement>,give a reference variable name
//and using the object of select class , call the getOption()method
//To print all the Element in the console, use FOR EACH  LOOP.
//In this first give the data type, then a variable name, followed by a colon:,and pass the List Variable		
		Select sel1 = new Select(day_list);
		List<WebElement>day_options=sel1.getOptions();
		System.out.println(day_options.size());
		
		for(WebElement str:day_options) 
		{
			System.out.println(str.getText());
		}
		Select sel2 = new Select(month_list);
		List<WebElement>month_options=sel2.getOptions();
		
		for(WebElement mon:month_options) 
		{ 
		System.out.println(mon.getText());
			
		}
		Select sel3 = new Select (year_list);
		List<WebElement>year_menu=sel3.getOptions();
		for(WebElement allyears:year_menu) { 
		System.out.println(allyears.getText());
			
		}
	}

}
