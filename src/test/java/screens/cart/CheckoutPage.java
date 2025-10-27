package screens.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private By sumLocator = By.cssSelector("td.sum");

    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSumInCheckout() {
        return driver.findElement(sumLocator).getText();
    }
}
