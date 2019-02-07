package pages.Sponsors;

import org.openqa.selenium.WebDriver;

public class Brejn {

    WebDriver browser;

    public Brejn(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
