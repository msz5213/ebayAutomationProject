package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import testpages.Header;
import testpages.ObjectRepo;
import testpages.ShoppingCart;

public class ValidateCartPage extends BaseTest {

    @Test
    public void validateCartPage() {
        Header hd = new Header(driver);
        ShoppingCart shoppingCart = new ShoppingCart(driver);

        hd.getCartButton().click();
        try {
            Assert.assertEquals(shoppingCart.getShoppingCartPageText().getText(), ObjectRepo.cartText);
            System.out.println(ObjectRepo.cartPageValPass);
        } catch (Exception e) {
            System.out.println(ObjectRepo.cartPageValFail);
        }
    }
}