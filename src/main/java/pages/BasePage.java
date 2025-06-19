package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import static org.testng.Assert.assertTrue;


public class BasePage {
    public static WebDriver driver;
    public  static WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));

    }

    public static void waitForElementToBeClickables(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        assertTrue(element.isDisplayed(), "Element should be visible: " + element);
    }
    public static void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        assertTrue(element.isDisplayed(), "Element should be visible: " + element);
    }

    }





