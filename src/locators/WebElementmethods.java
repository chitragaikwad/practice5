package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementmethods {

	public static void main(String[] args) throws  InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//web Elements Methods
		//.click()Method:Used to click on any elements on the Web Pages
		//WebElement intro =driver.findElement(By.xpath("//button[@type='submit']"));
	//	intro.click();
		driver.findElement(By.xpath("u_0_0"));
		 //.sendKeys Methods:used to either enter String of characters  or certain Keys of the Keyboard.
		//Keys.chord is used when multiple keys have to be entered together
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Algorithm");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tech");
		driver.findElement(By.xpath("//input[@name='reg_email']")).sendKeys("Support@algorithmtech.in");
		
		
		//driver.findElement(By.xpath("//input[@name='reg_email_']")).sendKeys(Keys.TAB);
		// driver.findElements(By.xpath("//button[@name=\'websubmit\']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@name='reg-email_']")).sendKeys(Keys.chord(Keys.CONTROL,"A"));//ctrl+a for select all
		//driver.findElement(By.xpath("//input[@name='reg-email_']")).sendKeys(Keys.chord(Keys.CONTROL,"C"));//ctrl_c for copying
		//driver.findElement(By.xpath("//input[@name=\'reg_email_confirmatiion_\']")).sendKeys(Keys.chord(Keys.CONTROL,"V"));//CTRL+V FOR PASTING
		
		
		
		//.CLEAR() Method:used for clearing the input text field
		//driver.findElement(By.xpath("//input[@name=\'reg_email']")).clear();
		
		
		//.getText() method: Used to get the text associated with any Web element,Return type is string only 
		//String create_page=driver.findElement(By.xpath("//div[@id=\'\']")).getText();
		//System.out.println(create_page);
		
		//1.isDislpayed--used to check if some web element is present in the web page and it is being displayed
		//2.isEnabled--used to check if webElement is enabled or not. like  some elements might be present on the DOM
		 //Structure but the developer chose to disable it then you can use this  command to check its enabled status .
		//3.isSelected--used to check if certain input web items like radio button , check boxes or select menu ar selected  or not.
		//NOTE: All these methods return type is boolean only,that is true or false.
		
		//boolean check=driver.findElement(By.xpath("//input[@class=\'_8ice']")).isDisplayed();
		//if (check==true)
		//{
			//System.out.println("Facebook Text is visible");
		//}
		//else
			//System.out. println("Element is not present");
// In case  of not finding the element, it will mostly throw no such  elementException or sometimes when that element is present but hidden then only
		//it will return false value
		//driver.findElement(By.xpath("//a[contains(@id,\"u_0_0]")).click();
		//Thread.sleep(1000);
		//boolean select_check =driver.findElement(By.xpath("//input[@class=\'_8ice\'])[1]")).isSelected();
		//if(select_check==true) 
	//	{
			//System.out.println("Radio button  for female is selected");
		//}
		//else
		//	System.out.println("Radio button is not selected");
		
		//.getTagname():used to get the  TagName associated associated with the webElement
		//driver.findElement(By.name("email")).getTagName();
		
		//.getAttribute(String)method :used to get the attribute of a particular WebElement
		//String attributes="";
		//driver.findElement(By.name("pass")).getAttribute(attributes);
//.submit() method:used to submit the button. similar to click	 element but major	used with forms filling and submitting.
	//	driver.findElement(By.xpath("/button[@name=\'login\']")).submit();
			
	}

}
