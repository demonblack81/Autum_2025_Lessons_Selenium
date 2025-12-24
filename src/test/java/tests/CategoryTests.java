package tests;

import io.qameta.allure.Story;
import org.testng.annotations.Test;
import screens.category.SubcategoryPage;
import screens.main.MenuPage;
import tests.testbase.TestBase;

import static com.codeborne.selenide.Condition.text;

public class CategoryTests extends TestBase {

    @Story("On Home page in menu click on Subcategory and chek title subcategory")
    @Test(description = "Open Subcategory from Category form")
    public void openSubcategoryTest() {
        MenuPage menuPage = new MenuPage();
        menuPage.clickOnSubcategory();

        SubcategoryPage subcategoryPage = new SubcategoryPage();
        subcategoryPage.titleSubcategory.shouldHave(text("Subcategory"));
    }
}
