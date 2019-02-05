package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class UpcomingEvents {

    WebDriver browser;

    public UpcomingEvents(WebDriver driver) {

        this.browser = driver;
    }
    public void verifyPage() {

        Assert.assertEquals("Upcoming – SIGIST Sweden", browser.getTitle());
    }
}
