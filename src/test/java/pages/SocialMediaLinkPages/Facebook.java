package pages.SocialMediaLinkPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Facebook {

    WebDriver browser;

    public Facebook(WebDriver driver) {

        this.browser = driver;
    }
    public void verifyPage() {

        Assert.assertEquals("https://www.facebook.com/sigistsweden/", browser.getCurrentUrl());
    }
}
