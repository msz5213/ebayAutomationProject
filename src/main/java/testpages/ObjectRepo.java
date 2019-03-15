package testpages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectRepo {

	public static final String expectedURL;

	public static final String userDir;

	public static final String chromeWinDriver;

	public static final String chromeMacDriver;

	public static final String os;

	public static final String webChrome;

	public static final String urlValidationPassed;

	public static final String urlValidationFailed;

	public static final String testSegregation;

	public static final String osName;

	public static final String searchButtonPass;

	public static final String searchButtonFail;

	public static final String searchBoxPass;

	public static final String searchBoxFail;

	public static final List<String> createItemCatDdList() {

		List<String> itemCatDdStringList = new ArrayList<String>();

		itemCatDdStringList.addAll(Arrays.asList("All Categories", "Antiques", "Art", "Baby", "Books",
				"Business & Industrial", "Cameras & Photo", "Cell Phones & Accessories",
				"Clothing, Shoes & Accessories", "Coins & Paper Money", "Collectibles",
				"Computers/Tablets & Networking", "Consumer Electronics", "Crafts", "Dolls & Bears", "DVDs & Movies",
				"eBay Motors", "Entertainment Memorabilia", "Gift Cards & Coupons", "Health & Beauty", "Home & Garden",
				"Jewelry & Watches", "Music", "Musical Instruments & Gear", "Pet Supplies", "Pottery & Glass",
				"Real Estate", "Specialty Services", "Sporting Goods", "Sports Mem, Cards & Fan Shop", "Stamps",
				"Tickets & Experiences", "Toys & Hobbies", "Travel", "Video Games & Consoles", "Everything Else"));

		return itemCatDdStringList;
	}

	public static final String specificItem;

	public static final String itemValPass;

	public static final String itemValFail;

	public static final String listFileLocation;

	public static final String cartValPass;

	public static final String cartValFail;

	public static final String cartText;

	public static final String cartPageValPass;

	public static final String cartPageValFail;

	public static final String listCompPass;

	public static final String listCompFail;

	public static final String saveThisSearchPass;
	public static final String saveThisSearchFail;

	public static final String savedTextPass;

	public static final String savedTextFail;

	static {
		savedTextFail = "Saved Button did NOT appear. VERIFICATION FAILED!";
		savedTextPass = "Saved Button Appeared! VERIFICATION PASSED!";
		saveThisSearchFail = "Save this search button did NOT appear. VERIFICATION FAILED!";
		saveThisSearchPass = "Save this search button appears. VERIFICATION PASSED!";
		listCompFail = "Lists DO NOT match! Verification FAILED!";
		listCompPass = "Lists match. Dropdown Verification PASSED!";
		cartPageValFail = "Heading in Cart page do not match expected. Validation FAILED!";
		cartPageValPass = "Header in Cart page match expected. Validation PASSED!";
		cartText = "Shopping cart";
		cartValFail = "Cart Button is NOT displayed is NOT enabled. VERIFICATION FAILED!";
		cartValPass = "Cart Button is displayed and is enabled. VERIFICATION or VALIDATION PASSED!";
		listFileLocation = "/Files/itemCatDd.txt";
		itemValFail = "Search result did NOT return iPhone. Verification FAILED!";
		itemValPass = "Search result returned iPhone. Verification PASSED!";
		specificItem = "iPhone";
		searchBoxFail = "Search box is NOT displayed is NOT enabled. VERIFICATION FAILED!";
		searchBoxPass = "Search box is displayed and is enabled. VERIFICATION PASSED!";
		searchButtonFail = "Search Button is NOT displayed is NOT enabled. VERIFICATION FAILED!";
		searchButtonPass = "Search Button is displayed and is enabled. VERIFICATION PASSED!";
		osName = "os.name";
		testSegregation = "The test cases have run";
		urlValidationFailed = "Actual URL does NOT match expected URL. Validation FAILED!";
		urlValidationPassed = "Actual URL matches expected URL. Validation PASSED!";
		webChrome = "webdriver.chrome.driver";
		os = "mac";
		chromeMacDriver = "/Drivers/chromedriver";
		chromeWinDriver = "\\Drivers\\chromedriver.exe";
		expectedURL = "https://www.ebay.com/signin/";
		userDir = "user.dir";
	}

}