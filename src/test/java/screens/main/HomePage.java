package screens.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By blueDuckMostPapularLocator = By.cssSelector("img[alt='Blue Duck']");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnBlueDuckInMostPopular() {
        driver.findElement(blueDuckMostPapularLocator).click();
    }

}
