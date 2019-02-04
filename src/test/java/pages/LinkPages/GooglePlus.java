package pages.LinkPages;

import org.openqa.selenium.WebDriver;

public class GooglePlus {

    WebDriver browser;

    public GooglePlus(WebDriver driver) {

        this.browser = driver;
    }

    public String verifypage() {

        return browser.getCurrentUrl();
    }
}
