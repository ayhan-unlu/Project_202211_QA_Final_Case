package patika.practicum;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    //Congigurations

    String baseUrl = "https://www.e-bebek.com";
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");
    // Mentioning the driver we use and indicating its location

    // webdriver error occured then solved with adding jar file
    WebDriver driver = new ChromeDriver();// for driver initilisation or creating a driver object in java
    JavascriptExecutor js;
    js = (JavascriptExecutor) driver;

    //Task 1. https://www.e-bebek.com/ website should be opened.

    driver.get(baseUrl);// to indicate where you want to go https:// must be included

    // source : https://www.youtube.com/watch?v=sxmwGdZbV-Y&t=3s

    // System.out.println(driver.getTitle());//for printing website title

    driver.manage().window().maximize();// maximize the window    
    Thread.sleep(2000);// waits for 2 second to go to next line of code


    //ebebek logo is controlled in the main page 
    WebElement mainPageLogoElement = driver.findElement(By.xpath("//img[@alt='Ebebek Logo Banner']"));
    Assert.assertTrue(mainPageLogoElement.isDisplayed());

    // Thread.sleep(2000);// waits for 2 second to go to next line of code

    //Task 2. Enter "kaşık mama"-"spoon baby food" in the search bar and the last product should be clicked from the results of the search, it should be verified that the opened product and the product clicked in the search result are the same.

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

   /* 
   String nameOfLastItemOnTheSearchPage = driver.findElement(By.xpath("//img[@alt='OiOi Mama Kaşığı 2’li Aqua Green- Mellow'] ")).getAccessibleName();
   System.out.println(nameOfLastItemOnTheSearchPage); 
   */

    driver.findElement(By.xpath("//img[@alt='OiOi Mama Kaşığı 2’li Aqua Green- Mellow'] ")).click();


    Thread.sleep(2000);// waits for 2 second to go to next line of code

    String expectedUrl = "https://www.e-bebek.com/oioi-mama-kasigi-2li-aqua-green--mellow-yellow-p-oioi-1060016";
    String actualUrl = driver.getCurrentUrl();
 
    Assert.assertEquals(expectedUrl, actualUrl); // Thread.sleep(2000);//waits for 2 second to go to next line of code

    Thread.sleep(2000);// waits for 2 second to go to next line of code

    //Task 3. The product should be added to the cart.
    
    driver.findElement(By.id("addToCartBtn")).click();
    Thread.sleep(2000);// waits for 2 second to go to next line of code

    WebElement showCartButton = driver.findElement(By.xpath("//a[@id='btnShowCart']"));
    Assert.assertTrue(showCartButton.isDisplayed());

    //Task 4. Click the view cart button from the right-handed mode-window.

    driver.findElement(By.xpath("//a[@id='btnShowCart']")).click();
    Thread.sleep(2000);// waits for 2 second to go to next line of code

    expectedUrl = "https://www.e-bebek.com/cart";
    actualUrl = driver.getCurrentUrl();
    Assert.assertEquals(expectedUrl, actualUrl); 
    Thread.sleep(2000);//waits for 2 second to go to next line of code
    
    //Task 5. Click the Complete Shopping button.

    driver.findElement(By.id("btnGoToShippingAddress")).click();
    Thread.sleep(2000);// waits for 2 second to go to next line of code

    //Task 6. It should be verified that the member login screen is on.

    expectedUrl = "https://www.e-bebek.com/login?forced=true";
    actualUrl = driver.getCurrentUrl();
    Assert.assertEquals(expectedUrl, actualUrl);

    Thread.sleep(2000);// waits for 2 second to go to next line of code

    driver.quit();// for leaving the website

  }
}
