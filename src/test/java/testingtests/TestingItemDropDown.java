package testingtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testpages.ObjectRepo;

import java.util.ArrayList;
import java.util.List;

public class TestingItemDropDown {

    public static void main(String[] args) {

        String os = System.getProperty(ObjectRepo.osName).toLowerCase();
        String userDir = System.getProperty(ObjectRepo.userDir);
        String macPath = userDir + ObjectRepo.chromeMacDriver;
        String winPath = userDir + ObjectRepo.chromeWinDriver;

        if (os.contains(ObjectRepo.os)) {
            System.setProperty(ObjectRepo.webChrome, macPath);
        } else {
            System.setProperty(ObjectRepo.webChrome, winPath);
        }

        WebDriver driver = new ChromeDriver();

        driver.navigate().to(ObjectRepo.expectedURL);

        WebElement userName = driver.findElement(By.cssSelector("#userid"));
        WebElement passWord = driver.findElement(By.cssSelector("#pass"));
        WebElement signInButton = driver.findElement(By.cssSelector("#sgnBt"));

        userName.sendKeys("shiblee_1986@outlook.com");
        passWord.sendKeys("123$abcZY");
        signInButton.click();

        List<WebElement> itemsInDropDown = driver.findElements(By.cssSelector("#gh-cat"));

        List<String> stringItemsInDropDown = new ArrayList<String>();

        for(WebElement w : itemsInDropDown){
            stringItemsInDropDown.add(w.getText());
        }
        for(String s : stringItemsInDropDown){
            System.out.println(s);
        }

    }
}