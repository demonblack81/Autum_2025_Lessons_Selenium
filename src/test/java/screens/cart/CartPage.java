package screens.cart;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement quantity = $("span.quantity");
    private SelenideElement checkoutLink = $("#cart > a.link");

    public void clickOnCheckoutLink() {
        checkoutLink.click();
    }
}
