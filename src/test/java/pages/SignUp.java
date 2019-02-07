package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignUp {

    WebDriver browser;

    public SignUp(WebDriver driver) {

        this.browser = driver;
    }
    public void verifyPage() {

        Assert.assertEquals("Sign Up – SIGIST Sweden", browser.getTitle());
    }

}
