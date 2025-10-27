package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.login.LoginPage;
import tests.testbase.TestBase;

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
