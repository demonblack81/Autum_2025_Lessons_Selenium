package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestsForAcme {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
    }


    @Test
    public void clickOnHomeInMenuTest() {
        WebElement home = driver.findElement(By.cssSelector("i[class='fa fa-home']"));

        home.click();

        String title = driver.getTitle();

        Assert.assertEquals(title, "Online Store | My Store");
    }

    @Test
    public void clickOnSubcategoryTest() {
        WebElement menuRubberDucks = driver.findElement(By.cssSelector("#site-menu > ul > li.category-1"));
        WebElement menuSubcategory = driver.findElement(By.xpath("//li[@class='category-2']"));

        Actions builder = new Actions(driver);
        builder.moveToElement(menuRubberDucks).perform();

        menuSubcategory.click();

        WebElement titleSubcategory = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1.title")));

        String titleSubcategoryString = titleSubcategory.getText();

        Assert.assertEquals(titleSubcategoryString, "Subcategory");
    }
}
