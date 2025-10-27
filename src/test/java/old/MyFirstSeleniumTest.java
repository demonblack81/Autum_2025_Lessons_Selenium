package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MyFirstSeleniumTest {

    @Test
    public void clickOnTenLinkInTableTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");

        WebElement content  = driver.findElement(By.id("content"));
        List<WebElement> elements = content.findElements(By.tagName("a"));

        elements.get(9).click();

        WebElement elementAfterClick = driver.findElement(By.tagName("h3"));

        Assert.assertEquals(elementAfterClick.getText(), "Drag and Drop");

    }

    @Test
    public void clickOnTenLinkInPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");

        List<WebElement> elements = driver.findElements(By.tagName("a"));

        elements.get(9).click();

        WebElement elementAfterClick = driver.findElement(By.tagName("h3"));

        Assert.assertEquals(elementAfterClick.getText(), "Disappearing Elements");
    }

}
