package screens.main;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class MenuPage {
    private SelenideElement menuRubberDucks = $("#site-menu > ul > li.category-1");
    private SelenideElement menuSubcategory = $x("//li[@class='category-2']");


    public void clickOnSubcategory() {
        actions().moveToElement(menuRubberDucks).perform();
        menuSubcategory.click();
    }

}
