package screens.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
    private By menuRubberDucksLocator = By.cssSelector("#site-menu > ul > li.category-1");
    private By menuSubcategoryLocator = By.xpath("//li[@class='category-2']");

    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSubcategory() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(menuRubberDucksLocator)).perform();
        driver.findElement(menuSubcategoryLocator).click();
    }

}
