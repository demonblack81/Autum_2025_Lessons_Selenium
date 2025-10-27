package screens.category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

    private By addToCartButton = By.cssSelector("button[name='add_cart_product']");


    private WebDriver driver;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButtonAddToCart() {
        driver.findElement(addToCartButton).click();
    }
}
