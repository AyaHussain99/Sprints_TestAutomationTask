package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @BeforeMethod
    public void openUrl(){
        driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html ");

    }
    @AfterClass
    public void tearDown() {
        // driver.quit();

    }
//@AfterMethod
    //public void deleteCookies() {
   // driver.manage().deleteAllCookies();
//}
}
