package pages;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver browser;

    public HomePage(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyTitle() {

        return browser.getTitle();
    }
    public void clickOnViewConference() {


    }
}
