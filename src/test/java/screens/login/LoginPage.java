package screens.login;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Epic("Autorization and Autificztion")
@Feature("UI Login form")
public class LoginPage {

    private SelenideElement userNameInput = $(By.name("email"));
    private SelenideElement passwordInput = $(By.name("password"));
    private SelenideElement loginButton = $(By.name("login"));
    public SelenideElement noticeSuccess = $(By.cssSelector(".notice.success"));
    public SelenideElement noticeWrong = $(By.cssSelector(".notice.errors"));

    @Step("Attempt to Login with credentials")
    public void attemptLogin(String username, String password) {
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    @Step("Get Success Notice Text")
    public String getSuccessNoticeText() {
        return noticeSuccess.getText();
    }

    @Step("Get Wrong Notice Text")
    public String getWrongNoticeText() {
        return noticeWrong.getText();
    }

}
