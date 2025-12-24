package screens.main;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@Feature("UI Home Page")
public class HomePage {
    private SelenideElement blueDuckMostPapular = $("img[alt='Blue Duck']");

    @Step("Click on cart with blue duck in Most Popular category on Home page")
    public void clickOnBlueDuckInMostPopular() { blueDuckMostPapular.click(); }
}
