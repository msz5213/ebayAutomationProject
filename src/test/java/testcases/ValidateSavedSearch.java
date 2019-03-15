package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testpages.Header;
import testpages.ItemsReturned;
import testpages.ObjectRepo;

public class ValidateSavedSearch extends BaseTest {

    @Test
    @Parameters({"item"})
    public void validateSaveSearch(String item){

        Header header = new Header(driver);
        ItemsReturned itemsReturned = new ItemsReturned(driver);

        header.getSearchBox().sendKeys(item);
        header.getSearchButton().click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(itemsReturned.getSaveThisSearch()));
        itemsReturned.getSaveThisSearch().click();

        wait.until(ExpectedConditions.visibilityOf(itemsReturned.getSaved()));

        if(itemsReturned.getSaved().isDisplayed() && itemsReturned.getSaved().isEnabled()){
            System.out.println(ObjectRepo.savedTextPass);
        }else{
            System.out.println(ObjectRepo.savedTextFail);
        }
    }
}