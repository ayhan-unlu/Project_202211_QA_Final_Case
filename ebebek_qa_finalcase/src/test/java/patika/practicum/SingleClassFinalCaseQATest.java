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
 //   Thread.sleep(1000);// waits for 1 second to go to next line of code

    WebElement mainPageLogoElement = driver.findElement(By.xpath("//img[@alt='Ebebek Logo Banner']"));
    Assert.assertTrue(mainPageLogoElement.isDisplayed());



//    driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması", Keys.ENTER);

//   Thread.sleep(1000);// waits for 1 second to go to next line of code

//    driver.get("https://www.e-bebek.com/");
//    Thread.sleep(2000);// waits for 2 second to go to next line of code
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

    String nameOfLastItemOnTheSearchPage =  driver.findElement(By.xpath("//img[@alt='OiOi Mama Kaşığı 2’li Aqua Green- Mellow'] ")).getAccessibleName();
    //driver.findElement(By.cssSelector(".col-6:nth-child(43) .is-initialized > .ng-star-inserted")).getText();
   

    System.out.println(nameOfLastItemOnTheSearchPage);
    System.out.println(nameOfLastItemOnTheSearchPage);
    System.out.println(nameOfLastItemOnTheSearchPage);
    System.out.println(nameOfLastItemOnTheSearchPage);
    System.out.println(nameOfLastItemOnTheSearchPage);
    System.out.println(nameOfLastItemOnTheSearchPage);
    System.out.println(nameOfLastItemOnTheSearchPage);

    driver.findElement(By.cssSelector(".col-6:nth-child(43) .is-initialized > .ng-star-inserted")).click();

 //alternative way with xpath 
 //driver.findElement(By.xpath("//img[@alt='OiOi Mama Kaşığı 2’li Aqua Green- Mellow'] ")).click();

    Thread.sleep(2000);// waits for 2 second to go to next line of code

    String nameOfLastItemOnProductPage = driver.findElement(By.xpath("//b[@id='txtProductTitle']")).getAccessibleName();

    System.out.println(nameOfLastItemOnProductPage);
    System.out.println(nameOfLastItemOnProductPage);
    System.out.println(nameOfLastItemOnProductPage);
    System.out.println(nameOfLastItemOnProductPage);
    System.out.println(nameOfLastItemOnProductPage);

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
    // driver.findElement(By.cssSelector("body.has-searchbox-results.scroll-up:nth-child(7)
    // cx-storefront.stop-navigating.SearchResultsListPageTemplate:nth-child(1)
    // main.mouse-focus:nth-child(6)
    // cx-page-layout.SearchResultsListPageTemplate.ng-star-inserted:nth-child(2)
    // cx-page-slot.SearchResultsListSlot.has-components.ng-star-inserted
    // eb-product-list.ng-star-inserted div.cx-page.ng-star-inserted
    // section.cx-page-section div.container.p-0 div.row.pl-sm-3.pr-sm-1.pr-0.pl-0
    // div.col-12.col-lg-12.pl-sm-3.pr-sm-3.pr-0.pl-0.ng-star-inserted
    // div.cx-product-container.row.ng-star-inserted div.row.product-list
    // eb-product-list-item.col-6.col-lg-4.col-md-4.col-xl-3.prod-item-col.ng-star-inserted:nth-child(43)
    // div.product-item eb-generic-link.product-item-anchor:nth-child(1)
    // a.product-item-anchor.ng-star-inserted
    // figure.product-item__img.grid-view.ng-star-inserted >
    // cx-media.is-initialized"));

    // driver.findElement(By.xpath("body.has-searchbox-results.scroll-up:nth-child(7)
    // cx-storefront.stop-navigating.SearchResultsListPageTemplate:nth-child(1)
    // main.mouse-focus:nth-child(6)
    // cx-page-layout.SearchResultsListPageTemplate.ng-star-inserted:nth-child(2)
    // cx-page-slot.SearchResultsListSlot.has-components.ng-star-inserted
    // eb-product-list.ng-star-inserted div.cx-page.ng-star-inserted
    // section.cx-page-section div.container.p-0 div.row.pl-sm-3.pr-sm-1.pr-0.pl-0
    // div.col-12.col-lg-12.pl-sm-3.pr-sm-3.pr-0.pl-0.ng-star-inserted
    // div.cx-product-container.row.ng-star-inserted div.row.product-list
    // eb-product-list-item.col-6.col-lg-4.col-md-4.col-xl-3.prod-item-col.ng-star-inserted:nth-child(43)
    // div.product-item eb-generic-link.product-item-anchor:nth-child(1)
    // a.product-item-anchor.ng-star-inserted
    // figure.product-item__img.grid-view.ng-star-inserted >
    // cx-media.is-initialized")).click();

    // body/app-root[1]/cx-storefront[1]/main[1]/cx-page-layout[1]/cx-page-slot[3]/eb-product-list[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/eb-product-scroll[1]/div[1]/div[1]/eb-product-list-item[1]/div[1]/eb-generic-link[1]/a[1]/figure[1]/cx-media[1]/img[1]

    // Thread.sleep(2000);//waits for 1 second to go to next line of code

    // Thread.sleep(2000);//waits for 2 second to go to next line of code

    // driver.get("https://www.e-bebek.com");//to indicate where you want to go
    // https:// must be included

    System.out.println(driver.getTitle());// for printing website title
    Thread.sleep(2000);// waits for 2 second to go to next line of code
    // driver.quit();//for leaving the website

  }
}
