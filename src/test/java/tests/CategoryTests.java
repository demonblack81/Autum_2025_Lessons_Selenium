package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.category.SubcategoryPage;
import screens.main.MenuPage;
import tests.testbase.TestBase;

public class CategoryTests extends TestBase {

    @Test
    public void openSubcategoryTest() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickOnSubcategory();

        SubcategoryPage subcategoryPage = new SubcategoryPage(driver);
        String subcategoryText = subcategoryPage.getSubcategoryText();

        Assert.assertEquals(subcategoryText, "Subcategory");
    }
}
