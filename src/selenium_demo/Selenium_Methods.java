package selenium_demo;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Methods {

	
		
		public static void main(String[] args) throws  InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.paytm.com");
		//	driver.get("https://www.amazon.com");
			//driver.manage().window().maximize();	//Maximizes the window
			Thread.sleep(1000);
			
			//driver.manage().window().minimize();	//Minimizes the window
			//Thread.sleep(3000);
			
			//driver.findElement(By.xpath("//Dive[@class=\"gb_e gb_f\"]//a[contains(text(),'Email')]")).click();
			String currentURL = driver.getCurrentUrl(); //It captures current URL in which the site is loaded
			System.out.println(currentURL);
			
			//.navigate() methods
			//1. to("")
			//2. back()
			//3. forward()
			//4. refrsh(e)https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&
			
			//Thread.sleep(2000);
			driver.navigate().to("http://www.amazon.in/");
			//Thread.sleep(2000);
			
			//driver.navigate().back();
		//	Thread.sleep(2000);
			//driver.navigate().forward();
			//Thread.sleep(2000);
			//System.out.println(driver.getCurrentUrl());
			//driver.navigate().refresh();
			//Thread.sleep(1000);
										  //width, height
			// Dimension dim = new Dimension (200, 200);
			//driver.manage().window().setSize(dim);
			
			//System.out.println(driver.manage().window().getSize());
			
			Point p = new Point(-200, -200);
			driver.manage().window().setPosition(p);
			
			System.out.println(driver.manage().window().getPosition());	
			
			
			
		}

	}


