package patika.practicum;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 * "The best functions are those with no parameters" Robert Cecil Martin
 *
 */

public class SingleClassFinalCaseQATest {
  static Logger logger = LogManager.getLogger(SingleClassFinalCaseQATest.class);

  public static void main(String[] args) throws Exception {

    String baseUrl = "https://www.e-bebek.com";
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");
    // Mentioning the driver we use and indicating its location

    // webdriver error solved with adding jar file source
    WebDriver driver = new ChromeDriver();// for driver initilisation or creating a driver object in java
    JavascriptExecutor js;
    js = (JavascriptExecutor) driver;
    driver.get(baseUrl);// to indicate where you want to go https:// must be included

    // source : https://www.youtube.com/watch?v=sxmwGdZbV-Y&t=3s

    // System.out.println(driver.getTitle());//for printing website title

    driver.manage().window().maximize();// maximize the window
    // Thread.sleep(1000);// waits for 1 second to go to next line of code

    WebElement mainPageLogoElement = driver.findElement(By.xpath("//img[@alt='Ebebek Logo Banner']"));
    Assert.assertTrue(mainPageLogoElement.isDisplayed());

    // driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması",
    // Keys.ENTER);

    // Thread.sleep(1000);// waits for 1 second to go to next line of code

    // driver.get("https://www.e-bebek.com/");
    // Thread.sleep(2000);// waits for 2 second to go to next line of code

    driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması");
    Thread.sleep(2000);// waits for 2 second to go to next line of code
    driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);// waits for 2 second to go to next line of code

    js.executeScript("window.scrollTo(0,1163)");
    Thread.sleep(2000);// waits for 2 second to go to next line of code
    js.executeScript("window.scrollTo(0,2594)");
    Thread.sleep(2000);// waits for 2 second to go to next line of code
    js.executeScript("window.scrollTo(0,4062)");
    Thread.sleep(2000);// waits for 2 second to go to next line of code
    js.executeScript("window.scrollTo(0,5530)");
    Thread.sleep(2000);// waits for 2 second to go to next line of code
        
    String nameOfLastItemOnTheSearchPage = driver.findElement(By.xpath("//img[@alt='OiOi Mama Kaşığı 2’li Aqua Green- Mellow'] ")).getAccessibleName();


    driver.findElement(By.xpath("//img[@alt='OiOi Mama Kaşığı 2’li Aqua Green- Mellow'] ")).click();


    Thread.sleep(2000);// waits for 2 second to go to next line of code

    System.out.println("ürün sayfasında bulunan isim");
  


    // js.executeScript("window.scrollTo(0,2875)");

    // Thread.sleep(2000);//waits for 2 second to go to next line of code
    js.executeScript("window.scrollTo(0,0)");

    Thread.sleep(2000);// waits for 2 second to go to next line of code
    driver.findElement(By.id("addToCartBtn")).click();

    Thread.sleep(2000);// waits for 2 second to go to next line of code
    driver.findElement(By.xpath("//a[@id='btnShowCart']")).click();

    Thread.sleep(2000);// waits for 1 second to go to next line of code
    // js.executeScript("window.scrollTo(0,1377)");

    // Thread.sleep(2000);//waits for 2 second to go to next line of code
    driver.findElement(By.id("btnGoToShippingAddress")).click();

    Thread.sleep(2000);// waits for 2 second to go to next line of code
    // js.executeScript("window.scrollTo(0,550)");

    // Thread.sleep(2000);//waits for 2 second to go to next line of code

    // Thread.sleep(2000);//waits for 1 second to go to next line of code

    // Thread.sleep(2000);//waits for 2 second to go to next line of code

    // driver.get("https://www.e-bebek.com");//to indicate where you want to go
    // https:// must be included

    System.out.println(driver.getTitle());// for printing website title

    Thread.sleep(2000);// waits for 2 second to go to next line of code

    // driver.quit();//for leaving the website

  }
}
