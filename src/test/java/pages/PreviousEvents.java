package pages;

import org.openqa.selenium.WebDriver;

public class PreviousEvents {

    WebDriver browser;

    public PreviousEvents(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getTitle();
    }
}
