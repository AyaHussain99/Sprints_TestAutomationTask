package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage {

    // Constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    By shoppingCartButton = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    By proceedToCheckout = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button/span");
    By emailAddress = By.xpath("//*[@id=\"customer-email\"]");
    By passwordField = By.xpath("//*[@id=\"customer-password\"]");
    By loginButton = By.xpath("//*[@id=\"customer-login\"]/div[2]/div[1]/button/span");
    By nextButton = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span");
    By placeOrderButton = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");

    // Methods
    public void clickShoppingCartButton() {
        WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(shoppingCartButton));
        cartButton.click();
    }

    public void proceedToCheckout() {
        driver.findElement(proceedToCheckout).click();
    }

    public void enterEmailAddress(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddress));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }

    public void clickNextButton() {
        WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextBtn.click();
    }

    public void clickPlaceOrderButton() {
        WebElement placeOrderBtn = wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        placeOrderBtn.click();
    }
}
