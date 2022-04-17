package SeleniumLecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com/");     //to launch the browser 
            
            driver.getCurrentUrl();
            System.out.println(driver.getCurrentUrl());
            
            driver.getTitle();
            System.out.println(driver.getTitle());
            
            driver.navigate().back();
            Thread.sleep(5000);            //to add 5sec in between backward & forward movement
            driver.navigate().forward();
            driver.navigate().refresh();
            Thread.sleep(5000);               //to add 5sec in between open & close movement
            driver.close();                   // use to currently/recently open browser
            driver.quit();                     // to close all open browser
            
	}

}
