package pages.SocialMediaLinkPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LinkedIn {

    WebDriver browser;

    public LinkedIn(WebDriver driver) {

        this.browser = driver;
    }
    public void verifyPage() {

        Assert.assertEquals("LinkedIn: Log In or Sign Up", browser.getTitle());
    }
}
