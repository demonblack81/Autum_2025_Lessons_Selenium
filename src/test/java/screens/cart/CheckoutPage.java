package screens.cart;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    public SelenideElement sum = $("td.sum");

    public String getSumInCheckout() {
        return sum.getText();
    }
}
