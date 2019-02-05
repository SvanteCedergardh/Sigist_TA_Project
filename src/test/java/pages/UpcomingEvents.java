package pages;

import org.openqa.selenium.WebDriver;

public class UpcomingEvents {

    WebDriver browser;

    public UpcomingEvents(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getTitle();
    }
}
