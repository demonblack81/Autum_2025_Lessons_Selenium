package tests.logintests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.login.LoginPage;
import tests.testbase.TestBase;

import java.time.Duration;

public class LoginTests extends TestBase {

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.attemptLogin("ilya.charnitcki@gmail.com", "B8D121981");
        String noticeText = loginPage.getSuccessNoticeText();
        Assert.assertEquals(noticeText,"You are now logged in as ilya charnitski.");
    }

    @Test
    public void wrongLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.attemptLogin("ilya.charnitcki@gmail.com", "djkbldkssdlf");
        String noticeText = loginPage.getWrongNoticeText();
        Assert.assertEquals(noticeText,"Wrong password or the account is disabled, or does not exist");
    }


}
