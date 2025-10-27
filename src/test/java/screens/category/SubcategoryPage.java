package screens.category;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class SubcategoryPage {
    public SelenideElement titleSubcategory = $("h1.title");

    public String getSubcategoryText() {
        return titleSubcategory.getText();
    }
}
