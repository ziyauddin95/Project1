package SeleniumLecture;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        
        JavascriptExecutor js=(JavascriptExecutor)driver; //convert the driver into jasvaciptexecutor
        
        //to scroll down the page         X  Y  Pixel
        js.executeScript("window.scrollBy(0,600 )");
        Thread.sleep(2000);
        
        //to scroll up on page
        js.executeScript("window.scrollBy(0,-350 )");
        Thread.sleep(2000);
        
        //to scroll left on page
        js.executeScript("window.scrollBy(-600,0 )");
        Thread.sleep(2000);
          
        //to scroll right on page
        js.executeScript("window.scrollBy(600,0 )");
        Thread.sleep(2000);
        
       
       
         //This will scroll the page till the element is found 
        WebElement a=driver.findElement(By.xpath(""));
              js.executeScript("arguments[0].scrollIntoView();", a);
              
              a.click();
}
}
