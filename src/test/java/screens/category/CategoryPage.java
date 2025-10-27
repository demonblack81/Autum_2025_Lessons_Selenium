package screens.category;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {

    private SelenideElement addToCartButton = $("button[name='add_cart_product']");


    public void clickOnButtonAddToCart() { addToCartButton.click(); }
}
