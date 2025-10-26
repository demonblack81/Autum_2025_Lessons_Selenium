package tests.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import static tests.testbase.Browser.*;

public class TestBase {
    Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
    protected WebDriver driver;

    protected final String baseUrl = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    public void setUp() {
        driver = switch(browser) {
            case chrome -> new ChromeDriver();
            case firefox -> new FirefoxDriver();
            case safari -> new SafariDriver();
            case edge -> new EdgeDriver();
        };
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
