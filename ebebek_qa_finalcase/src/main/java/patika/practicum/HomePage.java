package patika.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        driver.findElement(By.id("txtSearchBox")).sendKeys(text);
        driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
    }

}
