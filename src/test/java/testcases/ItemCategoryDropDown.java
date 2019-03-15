package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testpages.Header;

import java.util.ArrayList;
import java.util.List;

public class ItemCategoryDropDown extends BaseTest {

	@Test
	public List<String> getItemCategoryDropDown() {

		Header header = new Header(driver);

		List<WebElement> itemCatDdl = header.getItemCategories();
		List<String> stringItemCatDdl = new ArrayList<>();

		for (WebElement itemDdl : itemCatDdl) {
			stringItemCatDdl.add(itemDdl.getText());
		}

		/*
		 for (int i = 0; i < itemCatDdl.size(); i++) {
		 stringItemCatDdl.add(itemCatDdl.get(i).getText()); }
		 */
		return stringItemCatDdl;
	}
}
