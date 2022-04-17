package SeleniumLecture;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Static_and_Dynamic_Wait {
        
         public static void main(String[] args) {
          
         
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          
          //implicit wait--This will be applicable globally
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          
          driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         
          driver.findElement(By.xpath("//button[@id='openwindow']")).click(); //seconds
          
          driver.findElement(By.xpath("//input[@id='alertbtn']")).click();  //5 seconds
          
          

          //Explict wait==This will be applicable for specefic  elements
          WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='opentab']")));  //5+10 seconds
          
          
          driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();  //5 seconds
          
          
         
        //application condition---
          
          //100 test cases--
         // 50 stable and 50 testcases--within 10 seconds--implicit
          // 95 stable and  5 testcases --not fixxed --10,15,-explict
          // unstable--you will go with combination both
          
          
          /*Fluent Wait Fluent Wait in Selenium is used to define maximum for the web
           driver to wait for a condition, as well as the frequency with which we want
           to check the condition before throwing an "ElementNotVisibleException"
           exception. It checks for the web element at regular intervals until the
           object is found or timeout happens.*/
          
     /*     FluentWait wait1 = new FluentWait(driver); 
          
           wait1.withTimeout(Duration.ofSeconds(30));         //Specify the timout of the wait 
           wait1.pollingEvery(Duration.ofSeconds(6));         //Sepcify polling time 
           
           
           wait.ignoring(NoSuchElementException.class) ;     //Specify what exceptions to ignore
           
           //This is how we specify the condition to wait on. 
           wait.until(ExpectedConditions.alertIsPresent());    */
          
           
         /*  0th
           
           6th
           
           12th---
           
           18th
           
           24th
           
           30th*/
           
          
           
           //Total 30 seconds-
           
         /*  0th -   heat--element is visble--no elements
           
           5th seoncs-heat--element is visible---no elements-
           
           
           10 seonds---heat--elements is visble-- 
           
           
           15 seonds--heat--e
      
           30 seoncs--*/
          
}
}
