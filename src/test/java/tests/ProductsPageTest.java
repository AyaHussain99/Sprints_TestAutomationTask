package tests;

import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductsPageTest extends BaseTest {

    @Test //first test case
    public void searchForProduct() {
        ProductsPage productPage = new ProductsPage(driver);
        productPage.searchForProduct("Hoodies and sweatshirt for men hemp material");
    }

}
