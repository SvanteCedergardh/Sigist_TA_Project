package test.SIGIST;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SocialMediaLinkPages.Facebook;
import pages.SocialMediaLinkPages.GooglePlus;
import pages.SocialMediaLinkPages.LinkedIn;
import pages.SocialMediaLinkPages.Twitter;
import pages.SocialMediaLinks;
import pages.UpcomingEvents;

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

        Assert.assertEquals(sigistTitle, new HomePage(browser).verifyTitle());
    }
    @Test
    public void checkGooglePlusTopLink() {

        SocialMediaLinks newPage = new SocialMediaLinks(browser);
        GooglePlus googlePlusPage = newPage.visitGooglePlusThroughTopLink();

        googlePlusPage.verifyPage();
    }
    @Test
    public void checkGooglePlusBottomLink() {

        SocialMediaLinks page = new SocialMediaLinks(browser);
        GooglePlus googlePlusPage = page.visitGooglePlusThroughBottomLink();

        googlePlusPage.verifyPage();
    }
    @Test
    public void checkTwitterTopLink() {

        SocialMediaLinks newPage = new SocialMediaLinks(browser);
        Twitter twitterPage = newPage.visitTwitterThroughTopLink();

        twitterPage.verifyPage();
    }
    @Test
    public void checkTwitterBottomLink() {

        SocialMediaLinks page = new SocialMediaLinks(browser);
        Twitter twitterPage = page.visitTwitterThroughBottomLink();

        twitterPage.verifyPage();
    }
    @Test
    public void checkFacebookTopLink() {

        SocialMediaLinks newPage = new SocialMediaLinks(browser);
        Facebook facebookPage = newPage.visitFacebookThroughTopLink();

        facebookPage.verifyPage();
    }
    @Test
    public void checkFacebookBottomLink() {

        SocialMediaLinks page = new SocialMediaLinks(browser);
        Facebook facebookPage = page.visitFacebookThroughBottomLink();

        facebookPage.verifyPage();
    }
    @Test
    public void checkLinkedInTopLink() {

        SocialMediaLinks newPage = new SocialMediaLinks(browser);
        LinkedIn linkedInPage = newPage.visitLinkedInThroughTopLink();

        linkedInPage.verifyPage();
    }
    @Test
    public void checkLinkedInBottomLink() {

        SocialMediaLinks page = new SocialMediaLinks(browser);
        LinkedIn linkedInPage = page.visitLinkedInThroughBottomLink();

        linkedInPage.verifyPage();
    }
    @Test
    public void clickOnViewConferenceLinkOnHomePage(){

        HomePage newPage = new HomePage(browser);
        UpcomingEvents upcomingEventsPage = newPage.viewConference();

        upcomingEventsPage.verifyPage();
    }
}
