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
    public void checkGooglePlusTopLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        GooglePlus googlePlusPage = newPage.visitGooglePlusThroughTopLink();

        Assert.assertEquals("Google plus page",googlePlusPage.verifyPage());
    }
    @Test
    public void checkGooglePlusBottomLink() {

        SocialMediaLinksPage page = new SocialMediaLinksPage(browser);
        GooglePlus googlePlusPage = page.visitGooglePlusThroughBottomLink();

        Assert.assertEquals("Google Plus Page", googlePlusPage.verifyPage());
    }
    @Test
    public void checkTwitterTopLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        Twitter twitterPage = newPage.visitTwitterThroughTopLink();

        Assert.assertEquals("Twitter page",twitterPage.verifyPage());
    }
    @Test
    public void checkTwitterBottomLink() {

        SocialMediaLinksPage page = new SocialMediaLinksPage(browser);
        Twitter twitterPage = page.visitTwitterThroughBottomLink();

        Assert.assertEquals("Twitter page",twitterPage.verifyPage());
    }
    @Test
    public void checkFacebookTopLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        Facebook facebookPage = newPage.visitFacebookThroughTopLink();

        Assert.assertEquals("https://www.facebook.com/sigistsweden/", facebookPage.verifyPage());
    }
    @Test
    public void checkFacebookBottomLink() {

        SocialMediaLinksPage page = new SocialMediaLinksPage(browser);
        Facebook facebookPage = page.visitFacebookThroughBottomLink();

        Assert.assertEquals("https://www.facebook.com/sigistsweden/",facebookPage.verifyPage());
    }
    @Test
    public void checkLinkedInTopLink() {

        SocialMediaLinksPage newPage = new SocialMediaLinksPage(browser);
        LinkedIn linkedInPage = newPage.visitLinkedInThroughTopLink();

        Assert.assertEquals("LinkedIn: Log In or Sign Up", linkedInPage.verifyPage());
    }
    @Test
    public void checkLinkedInBottomLink() {

        SocialMediaLinksPage page = new SocialMediaLinksPage(browser);
        LinkedIn linkedInPage = page.visitLinkedInThroughBottomLink();

        Assert.assertEquals("LinkedIn: Log In or Sign Up", linkedInPage.verifyPage());
    }
    
}
