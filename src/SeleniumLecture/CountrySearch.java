package SeleniumLecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountrySearch {
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
       
       driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Ind");
       Thread.sleep(3000);
     
       
       
       
}
}