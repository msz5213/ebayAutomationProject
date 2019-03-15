package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemsReturned extends BasePage {

    @FindBy(css = "a.s-item__link > h3.s-item__title")
    private List<WebElement> returnedItems;
    @FindBy(xpath = "//div[@class='clearfix']")
    private WebElement saveThisSearch;
    @FindBy(xpath = "//button[@class='faux-link']")
    private WebElement saved;

    public ItemsReturned(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getReturnedItems() {
        return returnedItems;
    }

    public WebElement getSaveThisSearch() {
        return saveThisSearch;
    }

    public WebElement getSaved() {
        return saved;
    }
}