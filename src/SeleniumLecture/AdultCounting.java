package SeleniumLecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdultCounting {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
        
       WebElement a=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
       a.click();
       a.getText();	
       Thread.sleep(3000);
       
       WebElement b= driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
         
	   for ( int i =0; i<(9-1); i++ ) {			//9-1-----printing nine times
        b.click(); 
       
        }
	
	   
	   
	   
	   
	   
	   
}
}
