package patika.practicum;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebebekMamaResultPageTest {

    private static  WebDriver driver = null;//for driver initilisation or creating a driver object in java

    public static void main(String[] args) {
        
        ebebekMamaResultPage();


System.out.println("TEST completed succesfully");
    }

    private static void ebebekMamaResultPage() {
        String baseUrl = "https://www.e-bebek.com";
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");//mentioning the driver we use and indicating its location

        //webdriver error solved with adding jar file source 
        driver = new ChromeDriver();//for driver initilisation or creating a driver object in java
        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;
        driver.get(baseUrl);//to indicate where you want to go https:// must be included

        // source : https://www.youtube.com/watch?v=sxmwGdZbV-Y&t=3s


        //System.out.println(driver.getTitle());//for printing website title


        driver.manage().window().maximize();//maximize the window
       // Thread.sleep(1000);//waits for 1 second to go to next line of code

       // driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması",Keys.ENTER);
        ebebekMainPage.findingSearchBox(driver).sendKeys("kaşık maması", Keys.ENTER);
    //    Thread.sleep(1000);//waits for 1 second to go to next line of code
           js.executeScript("window.scrollTo(0,1163)");


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
}
