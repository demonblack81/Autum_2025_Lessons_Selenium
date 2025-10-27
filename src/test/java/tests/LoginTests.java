package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.login.LoginPage;
import tests.testbase.TestBase;

import static com.codeborne.selenide.Condition.text;

public class LoginTests extends TestBase {

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.attemptLogin("ilya.charnitcki@gmail.com", "B8D121981");
        loginPage.noticeSuccess.shouldHave(text("You are now logged in as ilya charnitski."));
    }

    @Test
    public void wrongLoginTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.attemptLogin("ilya.charnitcki@gmail.com", "djkbldkssdlf");
        loginPage.noticeWrong.shouldHave(text("Wrong password or the account is disabled, or does not exist"));
    }


}
