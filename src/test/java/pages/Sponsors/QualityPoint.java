package pages.Sponsors;

import org.openqa.selenium.WebDriver;

public class QualityPoint {

    WebDriver browser;

    public QualityPoint(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
