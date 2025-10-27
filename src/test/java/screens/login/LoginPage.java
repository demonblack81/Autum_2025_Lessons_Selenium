package screens.login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement userNameInput = $(By.name("email"));
    private SelenideElement passwordInput = $(By.name("password"));
    private SelenideElement loginButton = $(By.name("login"));
    public SelenideElement noticeSuccess = $(By.cssSelector(".notice.success"));
    public SelenideElement noticeWrong = $(By.cssSelector(".notice.errors"));

    public void attemptLogin(String username, String password) {
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String getSuccessNoticeText() {
        return noticeSuccess.getText();
    }

    public String getWrongNoticeText() {
        return noticeWrong.getText();
    }

}
