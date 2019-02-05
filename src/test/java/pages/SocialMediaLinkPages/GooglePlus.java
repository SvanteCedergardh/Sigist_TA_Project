package pages.SocialMediaLinkPages;

import org.openqa.selenium.WebDriver;

public class GooglePlus {

    WebDriver browser;

    public GooglePlus(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
