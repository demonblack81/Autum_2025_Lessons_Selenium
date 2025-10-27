package screens.category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SubcategoryPage {
    private By titleSubcategoryLocator = By.cssSelector("h1.title");

    private WebDriver driver;

    public SubcategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSubcategoryText() {
        return (new WebDriverWait(driver, Duration.ofSeconds(10))).until(
                ExpectedConditions.presenceOfElementLocated(titleSubcategoryLocator)).getText();
    }
}
