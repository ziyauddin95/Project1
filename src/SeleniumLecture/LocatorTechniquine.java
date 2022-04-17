package SeleniumLecture;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//##Selenium Locator techniques---
//id
//classname
//name
//tagname
//xpath
//CSS
//link text
//partial link text

public class LocatorTechniquine {
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        
        //driver.findElement(By.id("username")).sendKeys("Test1");     
       // driver.findElement(By.id("password")).sendKeys("123xyz");
      //  driver.findElement(By.id("Login")).click();
     //   driver.findElement(By.linkText("User custm domain")).click();
    //    driver.findElement(By.partialLinkText("User custm")).click();
     
        
        
        //  x path------//tagname[@attribute='value']  
        
       // driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Test1");      //Using xpath     //Relative xpath
      //  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("T245");     //Using xpath
     //   driver.findElement(By.xpath("//input[@name='Login']")).click();                 //Using xpath    
        
      //  driver.findElement(By.xpath("(//div[@id='username_container']//input)[1]")).sendKeys("Test2");    //Absolute xpath-use to specialcases, Parent to child 
     //   driver.findElement(By.xpath("(//form[@name='login']//input)[21]")).sendKeys("234rdt");
         
     // driver.findElement(By.xpath("//div[@id='username_container']/parent::div")).sendKeys("Test2");    //xpath child to parent
         
 
                
        //CSS Selector------tagname[attribute='value'] 
                
         //  driver.findElement(By.xpath("input[id='username']")).sendKeys("Test1");      //Using CSS
        //   driver.findElement(By.xpath("input[type='password']")).sendKeys("T245");     //Using CSS
       //    driver.findElement(By.xpath("input[name='Login']")).click();                 //Using CSS   
       
     //   Parent CSS Selector        tagname of child     ---------------Parent to child
    //    tagname[Attribute='value'] input:nth-child(1)
        
          //Not possible----child to parent
        
        
         
}
}
