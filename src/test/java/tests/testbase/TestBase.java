package tests.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
    protected WebDriver driver;

    protected final String baseUrl = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
