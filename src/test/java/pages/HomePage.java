package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver browser;

    By viewConferenceLinkPath = By.xpath("//*[@id=\"page\"]/section[1]/div/div/div/div/div/div/a");

    public HomePage(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyTitle() {

        return browser.getTitle();
    }
    public UpcomingEvents viewConference() {

        browser.findElement(viewConferenceLinkPath).click();

        return new UpcomingEvents(browser);
    }
}
