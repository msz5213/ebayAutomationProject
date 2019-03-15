package testcases;

import static testpages.ObjectRepo.osName;
import static testpages.ObjectRepo.testSegregation;
import static testpages.ObjectRepo.urlValidationFailed;
import static testpages.ObjectRepo.urlValidationPassed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import testpages.LoginPage;
import testpages.ObjectRepo;

public class BaseTest {

	public WebDriver driver;

	@BeforeClass
	public void getSetup() {

		String os = System.getProperty(osName).toLowerCase();

		String userDir = System.getProperty(ObjectRepo.userDir);

		String macPath = userDir + ObjectRepo.chromeMacDriver;

		String winPath = userDir + ObjectRepo.chromeWinDriver;

		if (os.contains(ObjectRepo.os)) {
			System.setProperty(ObjectRepo.webChrome, macPath);
		} else {
			System.setProperty(ObjectRepo.webChrome, winPath);
		}

		driver = new ChromeDriver();

	}

	@BeforeMethod
	@Parameters({ "userName", "passWord" })
	public void getBrowserAndLogin(String userName, String passWord) {

		driver.navigate().to(ObjectRepo.expectedURL);
		String actualURL = driver.getCurrentUrl();
		try {
			Assert.assertEquals(ObjectRepo.expectedURL, actualURL);
			System.out.println(urlValidationPassed);
		} catch (Exception e) {
			System.out.println(urlValidationFailed);
		}

		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys(userName);
		lp.getPassWord().sendKeys(passWord);
		lp.getSignInButton().click();
	}

	@AfterMethod
	public void segregateTests() {
		System.out.println(testSegregation);
	}

	@AfterClass
	public void endTestCases() {
		driver.close();
		driver.quit();
	}
}
