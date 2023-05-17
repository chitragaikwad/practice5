package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass2 {

	public static void main(String[] args)throws  InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chitra\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.software");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement multi =driver.findElement(By.xpath(""));
		Select s= new Select(multi);
//The following methods only work for multi_select Drop down
		
//1  .isMultiple()-used to check 	the of drop down menu ,that is,
// if the drop down is multi_select or single select.
//Return type is boolean(true or false)
		if(s.isMultiple()) 
		{
			System.out.println("It is A multi select drop down");
		}
		else
			System.out.println("Not a multiselect menu");
		
//2   .getAllSelectedOption()-used to get list of all the menu items which are selected by default.
//   		               Return type is <WebElement>
		

//3    .deselect()-used to deselect various previously selected values. Just like.selectby methods, it has 4 methods
//            a.deselectByValue("String value")	
//            b.deselectByVisibleText("String")	
//		      c.deselectByIndex(int)
//            d.deselectAll()-deselect all the entries,no need to mention the WebElement value or text
		
            s.deselectByValue("msperformance");
            Thread.sleep(2000);
            s.deselectByVisibleText("Selenium");
            Thread.sleep(2000);
            s.deselectAll();
            
            
            
 //  .getFirstSelectedOption()==Retrieves the first element which is selected in the drop down menu.  
 //                              Please note that it will only get the first "selected" WebElement,
 //                             it won get the first item present in the drop down.
 //                             Return type is WebElement.
            
          WebElement firstSel =s.getFirstSelectedOption();
          System.out.println(firstSel.getText());
            
            
            
            
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
