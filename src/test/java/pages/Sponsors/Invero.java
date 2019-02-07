package pages.Sponsors;

import org.openqa.selenium.WebDriver;

public class Invero {

    WebDriver browser;

    public Invero(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
