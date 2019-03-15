package testcases;

import org.testng.annotations.Test;
import testpages.Header;
import testpages.ObjectRepo;

public class ValidateSearchBox extends BaseTest {

    @Test
    public void validateSearchBox(){

        Header header = new Header(driver);

        if(header.getSearchBox().isEnabled() && header.getSearchBox().isDisplayed()){
            System.out.println(ObjectRepo.searchBoxPass);
        }else{
            System.out.println(ObjectRepo.searchButtonFail);
        }
    }
}