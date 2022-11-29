package patika.practicum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class ebebekMainPage {
    private static  WebDriver driver = null;//for driver initilisation or creating a driver object in java

    private static WebElement element= null;
    static String baseUrl = "https://www.e-bebek.com";

    public static void settingConfiguration() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumProject\\src\\drivers\\chromedriver.exe");//mentioning the driver we use and indicating its location
        driver = new ChromeDriver();//for driver initilisation or creating a driver object in java
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public static void openingebebekHomePage() {
        System.out.println(baseUrl);
        driver.get(baseUrl);//to indicate where you want to go https:// must be included       
    }
    public static WebElement findingSearchBox(WebDriver driver) {
        
        element = driver.findElement(By.id("txtSearchBox"));
        return element;
        
    }

    public static void searchingDesiredWords(WebDriver driver) {

        driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması",Keys.ENTER);

    }
     
}
