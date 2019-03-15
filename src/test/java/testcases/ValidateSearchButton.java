package testcases;

import org.testng.annotations.Test;
import testpages.Header;
import testpages.ObjectRepo;

public class ValidateSearchButton extends BaseTest {

    @Test
    public void validateSearchButton(){
        Header hd = new Header(driver);

        if(hd.getSearchButton().isEnabled() && hd.getSearchButton().isDisplayed()){
            System.out.println(ObjectRepo.searchButtonPass);
        }else{
            System.out.println(ObjectRepo.searchButtonFail);
        }
    }
}