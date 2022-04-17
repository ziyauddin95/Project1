package SeleniumLecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown2 {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
        
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        
      /*.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("(//a[@text='Mumbai (BOM)'])[2]")).click(); */
        
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
}
}
