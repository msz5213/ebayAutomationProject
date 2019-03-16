package testcases;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import testpages.LoginPage;
import testpages.ObjectRepo;

import static testpages.ObjectRepo.*;


public class BaseTest {

	public WebDriver driver;
	
	public ExtentReports report;
	public ExtentTest logger;
	public static ExtentHtmlReporter htmlReporter;

	@BeforeClass
	public void getSetup() {

		htmlReporter = new ExtentHtmlReporter(userDir + extentReport);

		htmlReporter.config().setTheme(Theme.DARK);

		htmlReporter.config().setDocumentTitle("ebayDocument");

		htmlReporter.config().setReportName("ebayReport");

		report = new ExtentReports();

		report.attachReporter(htmlReporter);

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
		
		logger = report.createTest("Passing Test");

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
