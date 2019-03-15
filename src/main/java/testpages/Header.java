package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Header extends BasePage {

    public Header(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#gh-ac")
    private WebElement searchBox;
    @FindBy(css = "#gh-btn")
    private WebElement searchButton;
    @FindBy(css = "#gh-cart-i")
    private WebElement cartButton;
    @FindBy(css = "#gh-cat")
    private List<WebElement> itemCategories;
    @FindBy(xpath = "//h2[contains(text(),'Buy It Now')]")
    private WebElement buyItNowButton;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public List<WebElement> getItemCategories() {
        return itemCategories;
    }

    public WebElement getBuyItNowButton() {
        return buyItNowButton;
    }

}