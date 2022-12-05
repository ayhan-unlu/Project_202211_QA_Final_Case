package patika.practicum;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.id("addToCartBtn");
   // By showCartButtonLocator = By.id("btnShowCart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);

    }

    public void addToCart() {

        driver.findElement(By.xpath("//cx-page-layout[1]/cx-page-slot[1]/eb-add-to-cart[1]/form[1]/button[1]")).click();

    //    find(addToCartButtonLocator).click();

      //  click(addToCartButtonLocator);
    }

    public void goToCart() {
  //      click(showCartButtonLocator);
    }

}
