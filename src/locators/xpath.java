package locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//rerlative Xpath by Attribute
		//tagname[@attributeName='value']
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("rohit");
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("Thkur");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type'submit']")).click();
		
		
		
		//relative xpath by tagname indexing
		//tagname[index]
		driver.findElement(By.xpath("(input[@name='username']")).sendKeys("chitra");
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("Gaikwad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		//reative Xpath by contains for handling Dynamic Attributers or for handling Attributers values with long names
		// tagname [contains(@attribute,'Attibute value which is same throught')]
	driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rohan");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='Lastname']")).sendKeys("Thakur");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@='reg_email_']")).sendKeys("rohanthakur12@gmail.com");
	Thread.sleep(1000);driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rohan");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='Lastname']")).sendKeys("Thakur");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@='reg_email_']")).sendKeys("rohanthakur12@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\'password_step_input\']")).sendKeys("rohan@123");
	
	
	
		
		
		
		
		
	}

}
