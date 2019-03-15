package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testpages.Header;
import testpages.ItemsReturned;
import testpages.ObjectRepo;

import java.util.ArrayList;
import java.util.List;

public class ValidateSearching extends BaseTest {

	@Test
	@Parameters({ "item" })
	protected void validateSearchFunctionality(String item) {

		Header header = new Header(driver);
		ItemsReturned itemsReturned = new ItemsReturned(driver);

		header.getSearchBox().sendKeys(item);
		header.getSearchButton().click();

		List<WebElement> returnedItems = itemsReturned.getReturnedItems();
		List<String> resultOfSearchedItems = new ArrayList<>();

		for (WebElement itemsReturnedfromSearch : returnedItems) {
			resultOfSearchedItems.add(itemsReturnedfromSearch.getText());
		}

		for (String lookThroughItems : resultOfSearchedItems) {
			if (lookThroughItems.contains(ObjectRepo.specificItem)) {
				System.out.println(ObjectRepo.itemValPass);
			} else {
				System.out.println(ObjectRepo.itemValFail);
			}
		}
		/*
		 * for (int i = 0; i < resultOfSearchedItems.size(); i++) { if
		 * (resultOfSearchedItems.get(i).contains(ObjectRepo.specificItem)) { } else {
		 * System.out.println(ObjectRepo.itemValFail);
		 */
	}
}
