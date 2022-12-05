package patika.practicum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void type(By locator, String text) {
        find(locator).sendKeys(text, Keys.ENTER);
    }

    public void pressEnter(By locator) {
        find(locator).sendKeys(Keys.ENTER);
    }

    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    public void waitForTwoSeconds() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
