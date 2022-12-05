package patika.practicum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * Test_Add_Product_To_Cart
 * 
 * source : https://www.youtube.com/watch?v=2naKQHbFQpY
 */
public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage;
    ProductDetailPage productDetailPage;
    SearchResultPage searchResultPage;
    CartPage cartPage;
    ForcedLoginPage forcedLoginPage;

    @Test
    @Order(1)
    public void searchAProduct() {
        homePage = new HomePage(driver);

        searchResultPage = new SearchResultPage(driver);
        homePage.search("kaşık maması");

        // Assertions.assertTrue(productsPage.isOnProductsPage(), "Not on the Product
        // Page");

    }

    @Test
    @Order(2)
    public void clickLastProduct() {
        // searchResultPage = new SearchResultPage(driver);
        searchResultPage.selectProduct();
        // Assertions.assertTrue(searchResultPage.isOnSearchResultPage(),"Not on the
        // Product Page");
    }

    @Test
    @Order(3)
    public void addToCart() {
        productDetailPage = new ProductDetailPage(driver);

        productDetailPage.addToCart();

    }

    @Test
    @Order(4)
    public void browseCart() {
        cartPage = new CartPage(driver);
        productDetailPage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(), "Product was not added to cart");
    }

    @Test
    @Order(5)
    public void clickFinishShopping() {
        cartPage.finishShopping();

    }

    @Test
    @Order(6)
    public void verifyForcedLoginPage() {
        forcedLoginPage = new ForcedLoginPage(driver);

        Assertions.assertTrue(forcedLoginPage.isOnForcedLoginPage(), "The forced login page did not open!");

    }

}