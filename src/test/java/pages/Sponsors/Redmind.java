package pages.Sponsors;

import org.openqa.selenium.WebDriver;

public class Redmind {

    WebDriver browser;

    public Redmind(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
