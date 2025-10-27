package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.cart.CartPage;
import screens.cart.CheckoutPage;
import screens.category.CategoryPage;
import screens.main.HomePage;
import tests.testbase.TestBase;

import static com.codeborne.selenide.Condition.text;

public class CartTests extends TestBase {


    @Test
    public void addDuckInCart() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnBlueDuckInMostPopular();

        CategoryPage categoryPage = new CategoryPage();
        categoryPage.clickOnButtonAddToCart();

        CartPage cartPage = new CartPage();
        cartPage.quantity.shouldHave(text("1"));
    }

    @Test
    public void checkSumInCheckOutPage() {
        HomePage homePage = new HomePage();
        homePage.clickOnBlueDuckInMostPopular();

        CategoryPage categoryPage = new CategoryPage();
        categoryPage.clickOnButtonAddToCart();

        CartPage cartPage = new CartPage();
        cartPage.quantity.shouldHave(text("1"));
        cartPage.clickOnCheckoutLink();

        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.sum.shouldHave(text("$20.00"));

    }

}
