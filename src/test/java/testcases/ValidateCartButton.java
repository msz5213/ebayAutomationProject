package testcases;

import org.testng.annotations.Test;
import testpages.Header;
import testpages.ObjectRepo;

public class ValidateCartButton extends BaseTest {

    @Test
    public void validateCartButton(){
        Header hd = new Header(driver);
        if(hd.getCartButton().isDisplayed() && hd.getCartButton().isEnabled()){
            System.out.println(ObjectRepo.cartValPass);
        }else{
            System.out.println(ObjectRepo.cartValFail);
        }
    }
}