package SeleniumLecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown1 {

public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
        
        WebElement a=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")); 
        a.click(); 
         
        WebElement b= driver.findElement(By.xpath("//a[@text='Delhi (DEL)']")); 
        // WebElement selectingFromCityDropDownXpath= driver.findElement(By.xpath("//a[@value='DEL']")); 
        b.click(); 
        Thread.sleep(4000);    //to load the page and find the next element in 4000 sec. 
         
        //WebElement selectingToCityFromDropDownXpath=driver.findElement(By.xpath("(//a[@text='Pune (PNQ)'])[2]")); 
        WebElement c=driver.findElement(By.xpath("(//a[@text='Mumbai (BOM)'])[2]")); 
        c.click();
        
}	
}
