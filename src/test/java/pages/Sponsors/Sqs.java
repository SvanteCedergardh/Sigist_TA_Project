package pages.Sponsors;

import org.openqa.selenium.WebDriver;

public class Sqs {

    WebDriver browser;

    public Sqs(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
