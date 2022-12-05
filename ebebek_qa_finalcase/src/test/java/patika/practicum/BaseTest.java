package patika.practicum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
// source : https://www.youtube.com/watch?v=2naKQHbFQpY
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {
    WebDriver driver;
    String baseUrl = "https://www.e-bebek.com";

    
    @BeforeAll
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);// to indicate where you want to go https:// must be included
        driver.manage().window().maximize();// maximize the window
            
    }
/*
    @AfterAll
     public void tearDown() {
        driver.quit();// to close the browser
    }
 */
}
