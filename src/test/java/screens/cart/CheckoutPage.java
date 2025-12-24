package screens.cart;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@Feature("UI Checkout form")
public class CheckoutPage {

    public SelenideElement sum = $("td.sum");

    @Step("Get Payment Due On Checkout Page")
    public String getSumInCheckout() {
        return sum.getText();
    }
}
