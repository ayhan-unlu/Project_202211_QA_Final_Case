package patika.practicum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ebebekMainPage {
    private static WebElement element= null;
    public static WebElement findingSearchBox(WebDriver driver) {
        
        element = driver.findElement(By.id("txtSearchBox"));
        return element;
        
    }
/* ????????SHOULD BE ADDED OR NOT?
    public static void hittingSearchButton(WebDriver driver) {

        driver.findElement(By.id("txtSearchBox")).sendKeys("kaşık maması",Keys.ENTER);

    }
     */
}
