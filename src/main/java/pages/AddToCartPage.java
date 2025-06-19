package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static pages.BasePage.driver;

public class AddToCartPage extends BasePage {

    // Constructor
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

   // Locators
    By productName = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a");
    By productSize = By.xpath("//*[@id=\"option-label-size-143-item-170\"]");
    By productColor = By.xpath("//*[@id=\"option-label-color-93-item-50\"]");
    By productQuantity = By.xpath("//*[@id=\"qty\"]");
    By addToCartButton = By.xpath("//*[@id=\"product-addtocart-button\"]/span");

    // methods
    public void addProductToTheCart() {
        waitForElementToBeClickables(driver.findElement(productName));
        driver.findElement(productName).click();
        driver.findElement(productSize).click();
        driver.findElement(productColor).click();
        driver.findElement(productQuantity).clear();
        driver.findElement(productQuantity).sendKeys("1");
        driver.findElement(addToCartButton).click();



    }


}
