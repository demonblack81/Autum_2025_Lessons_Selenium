package tests;

import io.qameta.allure.Story;
import org.testng.annotations.Test;
import screens.cart.CartPage;
import screens.cart.CheckoutPage;
import screens.category.CategoryPage;
import screens.main.HomePage;
import tests.testbase.TestBase;

import static com.codeborne.selenide.Condition.text;

public class CartTests extends TestBase {

    @Story("On Home page click on duck and check in cart added one item")
    @Test(description = "Add Duck in Cart")
    public void addDuckInCart() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnBlueDuckInMostPopular();

        CategoryPage categoryPage = new CategoryPage();
        categoryPage.clickOnButtonAddToCart();

        CartPage cartPage = new CartPage();
        cartPage.quantity.shouldHave(text("1"));
    }

    @Story("On Home page click on duck, click on checkout link and check sum on checkout page")
    @Test(description = "Add Duck in basket and check sum in checkout page")
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
