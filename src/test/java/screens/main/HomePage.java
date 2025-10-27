package screens.main;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement blueDuckMostPapular = $("img[alt='Blue Duck']");

    public void clickOnBlueDuckInMostPopular() { blueDuckMostPapular.click(); }
}
