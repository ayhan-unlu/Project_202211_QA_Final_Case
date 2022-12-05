package patika.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForcedLoginPage extends BasePage {

    By submitLoginButtonLocator = By.id("btnSubmitLogin");

    public ForcedLoginPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isOnForcedLoginPage() {

        return isDisplayed(submitLoginButtonLocator);
    }

}
