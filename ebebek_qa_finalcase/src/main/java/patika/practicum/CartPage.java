package patika.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By finishShoppingButtonLocator = By.id("btnGoToShippingAddress");
    By cartProductCountLocator = By.tagName("h1");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public Boolean checkIfProductAdded() {

        return getCartProductCount() > 0;
    }

    public void finishShopping() {
        click(finishShoppingButtonLocator);

    }

    private int getCartProductCount() {
        String count = find(cartProductCountLocator).getText();
        return Integer.parseInt(count);
    }

}
