package screens.category;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@Feature("UI Subcategory")
public class SubcategoryPage {
    public SelenideElement titleSubcategory = $("h1.title");

    @Step("Get Text in menu Subcategory")
    public String getSubcategoryText() {
        return titleSubcategory.getText();
    }
}
