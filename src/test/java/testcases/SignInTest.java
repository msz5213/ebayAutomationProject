package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testpages.LoginPage;
import testpages.ObjectRepo;

public class SignInTest extends BaseTest {

    @DataProvider(name = "Authentication")
    public static Object[][] getCredential() {
        Object[][] objects = {{"shiblee_1986@outlook.com", "123$abcZY"}, {"Test_user@ebay.com", "12345678"}};
        return objects;
    }

    @Test
    public void testSignIn(String userName, String passWord) {
        LoginPage lp = new LoginPage(driver);
        driver.navigate().to(ObjectRepo.expectedURL);
        lp.getUserName().sendKeys(userName);
        lp.getPassWord().sendKeys(passWord);
        lp.getSignInButton().click();
    }
}