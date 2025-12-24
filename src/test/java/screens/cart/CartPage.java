package screens.cart;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@Feature("UI Cart form")
public class CartPage {
    public SelenideElement quantity = $("span.quantity");
    private SelenideElement checkoutLink = $("#cart > a.link");

    @Step("Click on Checkout link")
    public void clickOnCheckoutLink() {
        checkoutLink.click();
    }
}
