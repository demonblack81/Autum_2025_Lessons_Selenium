package screens.main;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

@Feature("UI Menu form")
public class MenuPage {
    private SelenideElement menuRubberDucks = $("#site-menu > ul > li.category-1");
    private SelenideElement menuSubcategory = $x("//li[@class='category-2']");

    @Step("Click on link Subcategory in menu")
    public void clickOnSubcategory() {
        actions().moveToElement(menuRubberDucks).perform();
        menuSubcategory.click();
    }

}
