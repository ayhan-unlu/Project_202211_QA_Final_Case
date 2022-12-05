package patika.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {

    By lastProductOnPageLocator = By.xpath("//img[@alt='OiOi Mama Kaşığı 2’li Aqua Green- Mellow']");



    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

 //   public Boolean isOnSearchResultPage() {
 //       return isDisplayed(addToCartButtonLocator);
 //  }

    public void selectProduct() {

        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;
        waitForTwoSeconds();// used extra for better scrolling down

        js.executeScript("window.scrollTo(0,1163)");
        waitForTwoSeconds();// used extra for better scrolling down
        
        js.executeScript("window.scrollTo(0,2594)");
        waitForTwoSeconds();
        js.executeScript("window.scrollTo(0,4062)");
        waitForTwoSeconds();
        js.executeScript("window.scrollTo(0,5530)");
        waitForTwoSeconds();


        find(lastProductOnPageLocator).click();

      //  getAllProducts().get(getAllProducts().size() - 1).click();
    }

}
