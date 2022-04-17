package SeleniumLecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropDown {
public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise//");

        WebElement a=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
        Select s=new Select(a);
        
        s.selectByIndex(0);
        System.out.println(s.getFirstSelectedOption().getText());
        
        s.selectByValue("USD");
        System.out.println(s.getFirstSelectedOption().getText());
        
        s.selectByVisibleText("AED");
        System.out.println(s.getFirstSelectedOption().getText()); 
        
}        
}
