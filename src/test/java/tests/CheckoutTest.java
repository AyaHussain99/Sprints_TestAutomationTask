package tests;

import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.CheckoutPage;
import pages.ProductsPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        ProductsPage productPage = new ProductsPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        productPage.searchForProduct("Hoodies and sweatshirt for men hemp material");
        addToCartPage.addProductToTheCart();
        checkoutPage.clickShoppingCartButton();
        checkoutPage.proceedToCheckout();
        checkoutPage.enterEmailAddress("aya.hussain231@gmail.com");
        checkoutPage.enterPassword("AyaHussain231");
        checkoutPage.clickLoginButton();
        checkoutPage.clickNextButton();
        checkoutPage.clickPlaceOrderButton();
    }
}
