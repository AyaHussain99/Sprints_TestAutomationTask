package tests;

import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.ProductsPage;

public class AddToCartTest extends BaseTest{

    @Test //second test case
    public void  addProductToTheCart() {
        ProductsPage productPage = new ProductsPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        productPage.searchForProduct("Hoodies and sweatshirt for men hemp material");
       addToCartPage.addProductToTheCart();


    }
}

