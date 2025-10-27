package screens.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private By quantityLocator = By.cssSelector("span.quantity");
    private By checkoutLink = By.cssSelector("#cart > a.link");

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getQuantityInCart(String newQuantity) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.textToBe(quantityLocator, newQuantity));
        return driver.findElement(quantityLocator).getText();
    }

    public void clickOnCheckoutLink() {
        driver.findElement(checkoutLink).click();
    }
}
