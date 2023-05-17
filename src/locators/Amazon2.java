package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args)throws  InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");  
        driver.manage().window().maximize();
        
       driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();      //logo
    	Thread.sleep(1000);
    	driver.navigate().back();
    
        
        WebElement AMlogo=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));   //search 
	       AMlogo.sendKeys("watch");
	       Thread.sleep(500);
	       
	       
        
    driver.findElement(By.xpath("//a[@data-csa-c-slot-id='HamburgerMenuDesktop']")).click();     //all
 	   Thread.sleep(500);
 	   driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
 	  Thread.sleep(500);
 	  
     driver.findElement(By.xpath("//a[@class='nav-a  ']")).click();     //best sellers
      Thread.sleep(500);
      driver.navigate().back();
      
       driver.findElement(By.linkText("Today's Deals")).click();         //  todays deals
       Thread.sleep(500);
       driver.navigate().back();
   
     
      driver.findElement(By.linkText("Mobiles")).click();   //mobiles
       Thread.sleep(500);
       driver.navigate().back(); 
       
       driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']")).click();      // customer service
       driver.navigate().back(); 
       Thread.sleep(500);
       
       
       
     driver.findElement(By.linkText("Electronics")).click();    //electronics
       Thread.sleep(500);
	    driver.navigate().back(); 
	    
	    
       
      driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']")).click();      //books
        Thread.sleep(500);
	   driver.navigate().back(); 
       
       driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_6']")).click();      // fashion 
       driver.navigate().back(); 
      Thread.sleep(500);
       
       driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_home']")).click();      // home&kitchen
        driver.navigate().back(); 
        Thread.sleep(500); 
       
       driver.findElement(By.id("nav-link-amazonprime")).click();      // prime
       driver.navigate().back(); 
       Thread.sleep(500); 
       
    driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_newreleases']")).click();      // new release
       driver.navigate().back(); 
       Thread.sleep(500); 
       
      driver.findElement(By.linkText("Computers")).click();      // computer
       driver.navigate().back(); 
      Thread.sleep(500);  
      
       
       driver.findElement(By.xpath("//a[@data-csa-c-id='71ebk1-o65kr6-7kyonp-2zeq9e']")).click();      // amazon pay
       driver.navigate().back(); 
       Thread.sleep(500);   
	}

}
