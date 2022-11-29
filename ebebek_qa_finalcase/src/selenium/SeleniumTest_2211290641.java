// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SeleniumTest_2211290641 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void SeleniumTest_2211290641() {
    // Test name: 221129_0641
    // Step # | name | target | value
    // 1 | open | https://www.e-bebek.com/ | 
    driver.get("https://www.e-bebek.com/");
    // 2 | setWindowSize | 1382x744 | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | click | id=txtSearchBox | 
    driver.findElement(By.id("txtSearchBox")).click();
    // 4 | type | id=txtSearchBox | kaşık maması
    driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması");
    // 5 | sendKeys | id=txtSearchBox | ${KEY_ENTER}
    driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
    // 6 | runScript | window.scrollTo(0,900) | 
    js.executeScript("window.scrollTo(0,900)");
    // 7 | runScript | window.scrollTo(0,1800) | 
    js.executeScript("window.scrollTo(0,1800)");
    // 8 | runScript | window.scrollTo(0,3046) | 
    js.executeScript("window.scrollTo(0,3046)");
    // 9 | click | css=.col-6:nth-child(43) .product-item-anchor > .product-item-anchor | 
    driver.findElement(By.cssSelector(".col-6:nth-child(43) .product-item-anchor > .product-item-anchor")).click();
    // 10 | click | id=addToCartBtn | 
    driver.findElement(By.id("addToCartBtn")).click();
    // 11 | click | id=btnShowCart | 
    driver.findElement(By.id("btnShowCart")).click();
    // 12 | click | css=#btnGoToShippingAddress > .ng-star-inserted | 
    driver.findElement(By.cssSelector("#btnGoToShippingAddress > .ng-star-inserted")).click();
    // 13 | close |  | 
    driver.close();
  }
}