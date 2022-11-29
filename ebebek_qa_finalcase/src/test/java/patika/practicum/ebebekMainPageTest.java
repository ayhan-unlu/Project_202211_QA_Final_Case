package patika.practicum;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class ebebekMainPageTest {

    private static  WebDriver driver = null;//for driver initilisation or creating a driver object in java

    public static void main(String[] args) {
        
        ebebekMainPage();


System.out.println("TEST completed succesfully");
    }

    private static void ebebekMainPage() {
      ebebekMainPage.settingConfiguration();
    //  ebebekMainPage.openingebebekHomePage();
 //       String baseUrl = "https://www.e-bebek.com";
 //       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");//mentioning the driver we use and indicating its location

        //webdriver error solved with adding jar file source 
  //      driver = new ChromeDriver();//for driver initilisation or creating a driver object in java
        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;
 //       driver.get(baseUrl);//to indicate where you want to go https:// must be included

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

    /**
     * Rigorous Test :-)
     */
    // @Ignore
    @Test
    public void shouldAnswerWithTrue() {

        assertTrue(true);
    }
    public static void settingConfiguration() {
      String baseUrl = "https://www.e-bebek.com";
      System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");//mentioning the driver we use and indicating its location
      driver = new ChromeDriver();//for driver initilisation or creating a driver object in java
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  }
}
