package tests.testbase;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://litecart.stqa.ru/en/";
        Configuration.browser = CHROME;
        Configuration.pageLoadTimeout = 8000L;
        Configuration.browserSize = "1920X1080";

        open(Configuration.baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
