package patika.practicum;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    WebDriver driver;
    String baseUrl = "https://www.e-bebek.com";

    
    @BeforeAll
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver.get(baseUrl);// to indicate where you want to go https:// must be included
        driver.manage().window().maximize();// maximize the window    
    }

    @AfterAll
    public void tearDown() {
        driver.quit();// to close the browser
    }
 
}
