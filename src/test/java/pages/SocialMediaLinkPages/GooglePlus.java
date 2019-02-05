package pages.SocialMediaLinkPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GooglePlus {

    WebDriver browser;

    public GooglePlus(WebDriver driver) {

        this.browser = driver;
    }
    public void verifyPage() {

        Assert.assertEquals("Google plus page",browser.getCurrentUrl());
    }
}
