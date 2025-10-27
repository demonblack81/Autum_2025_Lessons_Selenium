package tests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.category.SubcategoryPage;
import screens.main.MenuPage;
import tests.testbase.TestBase;

import static com.codeborne.selenide.Condition.text;

public class CategoryTests extends TestBase {

    @Test
    public void openSubcategoryTest() {
        MenuPage menuPage = new MenuPage();
        menuPage.clickOnSubcategory();

        SubcategoryPage subcategoryPage = new SubcategoryPage();
        subcategoryPage.titleSubcategory.shouldHave(text("Subcategory"));
    }
}
