package pages.LinkPages;

import org.openqa.selenium.WebDriver;

public class Twitter {

    WebDriver browser;

    public Twitter(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }

}

