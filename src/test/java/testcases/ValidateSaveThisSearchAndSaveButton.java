package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testpages.Header;
import testpages.ItemsReturned;
import testpages.ObjectRepo;

public class ValidateSaveThisSearchAndSaveButton extends BaseTest {

    @Test
    @Parameters({"item"})
    public void validateSaveThisSearch(String item) {
        ItemsReturned itemsReturned = new ItemsReturned(driver);
        Header header = new Header(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        header.getSearchBox().sendKeys(item);
        header.getSearchButton().click();

        wait.until(ExpectedConditions.visibilityOf(itemsReturned.getSaveThisSearch()));
        if (itemsReturned.getSaveThisSearch().isEnabled() && itemsReturned.getSaveThisSearch().isDisplayed()) {
            System.out.println(ObjectRepo.saveThisSearchPass);
        } else {
            System.out.println(ObjectRepo.saveThisSearchFail);
        }
    }
}