package pages.SocialMediaLinkPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Twitter {

    WebDriver browser;

    public Twitter(WebDriver driver) {

        this.browser = driver;
    }
    public void verifyPage() {

        Assert.assertEquals("Twitter page",browser.getCurrentUrl());
    }

}

