package screens.category;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@Feature("UI Category Page")
public class CategoryPage {

    private SelenideElement addToCartButton = $("button[name='add_cart_product']");

    @Step("Click on button 'Add to Cart'")
    public void clickOnButtonAddToCart() { addToCartButton.click(); }
}
