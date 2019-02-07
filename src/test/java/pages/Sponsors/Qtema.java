package pages.Sponsors;

import org.openqa.selenium.WebDriver;

public class Qtema {

    WebDriver browser;

    public Qtema(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
