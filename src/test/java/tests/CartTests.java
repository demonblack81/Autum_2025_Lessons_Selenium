package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.cart.CartPage;
import screens.cart.CheckoutPage;
import screens.category.CategoryPage;
import screens.main.HomePage;
import tests.testbase.TestBase;

public class CartTests extends TestBase {

    @Test
    public void addDuckInCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBlueDuckInMostPopular();

        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.clickOnButtonAddToCart();

        CartPage cartPage = new CartPage(driver);
        String quantityInCartInt = cartPage.getQuantityInCart("1");

        Assert.assertEquals(quantityInCartInt, "1");
    }

    @Test
    public void checkSumInCheckOutPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBlueDuckInMostPopular();

        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.clickOnButtonAddToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.getQuantityInCart("1");
        cartPage.clickOnCheckoutLink();


        CheckoutPage checkoutPage = new CheckoutPage(driver);
        String sumInCheckotText =  checkoutPage.getSumInCheckout();

        Assert.assertEquals(sumInCheckotText, "$20.00");

    }

}
