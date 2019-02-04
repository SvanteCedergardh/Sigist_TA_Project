package test.SIGIST;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LinkPages.Facebook;
import pages.LinkPages.GooglePlus;
import pages.LinkPages.LinkedIn;
import pages.LinkPages.Twitter;
import pages.SocialMediaLinksPage;

import java.util.concurrent.TimeUnit;

public class SeleniumTests {

    WebDriver browser;

    private String sigistTitle = "SIGIST Sweden – Special Interest Group In Software Testing";

    @Before
    public void setUp() {

        browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get("https://www.sigist.se/");
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){

        browser.quit();
    }
    @Test
    public void verifyTitle(){

        Assert.assertEquals(sigistTitle, new HomePage(browser).getSigistTitle());
    }
    @Test
    public void checkGooglePlusLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        GooglePlus googlePlusPage = newPage.visitGooglePlus();

        Assert.assertEquals("Google plus page",googlePlusPage.verifyPage());
    }

    @Test
    public void checkTwitterLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        Twitter twitterPage = newPage.visitTwitter();

        Assert.assertEquals("Twitter page",twitterPage.verifyPage());
    }
    @Test
    public void checkFacebookLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        Facebook facebookPage = newPage.visitFacebook();

        Assert.assertEquals("https://www.facebook.com/sigistsweden/", facebookPage.verifyPage());
    }
    @Test
    public void checkLinkedInLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        LinkedIn linkedInPage = newPage.visitLinkedIn();

        Assert.assertEquals("LinkedIn: Log In or Sign Up", linkedInPage.verifyPage());
    }
}
