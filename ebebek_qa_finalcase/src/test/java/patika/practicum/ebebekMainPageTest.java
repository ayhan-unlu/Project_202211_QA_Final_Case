/*
package patika.practicum;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;


  Unit test for simple App.
public class ebebekMainPageTest {

    private static  WebDriver driver = null;//for driver initilisation or creating a driver object in java
  //  static Logger logger = LogManager.getLogger(ebebekMainPageTest.class);
  static String baseUrl = "https://www.e-bebek.com";

  public static void main(String[] args) {
        
        ebebekMainPageTest1();


System.out.println("TEST completed succesfully");
    }

    private static void ebebekMainPageTest1() {
      settingConfigurationTest();
      openingebebekHomePageTest();
      findingSearchBoxTest(driver);
      searchingDesiredWordsTest(driver);
 //       String baseUrl = "https://www.e-bebek.com";
 //       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");//mentioning the driver we use and indicating its location

        

        // source : https://www.youtube.com/watch?v=sxmwGdZbV-Y&t=3s


        //System.out.println(driver.getTitle());//for printing website title


  //     driver.manage().window().maximize();//maximize the window
       // Thread.sleep(1000);//waits for 1 second to go to next line of code

       // driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması",Keys.ENTER);
        ebebekMainPage.findingSearchBox(driver).sendKeys("kaşık maması", Keys.ENTER);
    //    Thread.sleep(1000);//waits for 1 second to go to next line of code


   //     driver.get("https://www.e-bebek.com/");
     //   Thread.sleep(2000);//waits for 1 second to go to next line of code
   //     driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması");
      //  Thread.sleep(2000);//waits for 1 second to go to next line of code
    //    driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
      //  Thread.sleep(2000);//waits for 1 second to go to next line of code
    }
 Rigorous Test :-)
    // @Ignore
    @Test
    public void shouldAnswerWithTrue() {

        assertTrue(true);
    }
    public static void settingConfigurationTest() {
      
      System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");//mentioning the driver we use and indicating its location
      driver = new ChromeDriver();//for driver initilisation or creating a driver object in java
      driver.manage().window().maximize();
    
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      System.out.println("Driver settings are configured properly");

   //   WebElement blankBrowserBody = driver.findElement(By.xpath("/html/body"));
  //    WebElement blankBrowserBody2 = driver.findElement(By.name("null"));

 //   if (blankBrowserBody2.isDisplayed()){
 //     System.out.println("Driver settings are configured properly");
 //     }
 //     Assert.assertTrue(blankBrowserBody2.isDisplayed());
    
      
  }
  public static void openingebebekHomePageTest() {
    System.out.println(baseUrl);
    driver.get(baseUrl);//to indicate where you want to go https:// must be included
    
    String expectedUrl="https://www.e-bebek.com";
    String actualUrl= driver.getCurrentUrl();
    Assert.assertEquals(expectedUrl,actualUrl);
}

public static WebElement findingSearchBoxTest(WebDriver driver) {
        
  WebElement element = driver.findElement(By.id("txtSearchBox"));
  return element;
  
}
public static void searchingDesiredWordsTest(WebDriver driver) {

  driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması",Keys.ENTER);

  WebElement searchElement= driver.findElement(By.xpath("//h1[text()=' kaşık maması ']"));
  Assert.assertTrue(searchElement.isDisplayed());

}
}
*/