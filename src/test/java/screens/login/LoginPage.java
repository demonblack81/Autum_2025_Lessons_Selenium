package screens.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By userNameInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.name("login");
    private By noticeSuccessLocator = By.cssSelector(".notice.success");
    private By noticeWrongLocator = By.cssSelector(".notice.errors");

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void attemptLogin(String username, String password) {
        driver.findElement(userNameInputLocator).sendKeys(username);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
    }

    public String getSuccessNoticeText() {
        return (new WebDriverWait(driver, Duration.ofSeconds(2))).until(
                ExpectedConditions.presenceOfElementLocated(noticeSuccessLocator)).getText();
    }

    public String getWrongNoticeText() {
        return (new WebDriverWait(driver, Duration.ofSeconds(5))).until(
                ExpectedConditions.presenceOfElementLocated(noticeWrongLocator)).getText();
    }

}
