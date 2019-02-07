package test.SIGIST;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import pages.SocialMediaLinkPages.*;
import pages.Sponsors.*;

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
    public void clickOnViewConferenceOnHomePage(){

        HomePage newPage = new HomePage(browser);
        UpcomingEvents upcomingEventsPage = newPage.viewConference();

        upcomingEventsPage.verifyPage();
    }
    @Test
    public void clickOnSignUpHereOnHomePage() {

        HomePage newPage = new HomePage(browser);
        SignUp signUpPage = newPage.goToSignUpPage();

        signUpPage.verifyPage();
    }
    @Test
    public void clickOnSeeAgendaOnHomePage() {

        HomePage newPage = new HomePage(browser);
        UpcomingEvents seeAgenda = newPage.seeAgenda();

        seeAgenda.verifyPage();
    }
    @Test
    public void goToSpeaker1FromHomepage() {

        HomePage newPage = new HomePage(browser);
        UpcomingEvents clickedSpeaker = newPage.goToPresentingSpeaker(1);

        Assert.assertEquals("Törbjörn Ryberg", clickedSpeaker.getSpeakerName(1));
    }
    @Test
    public void goToSpeaker2FromHomepage() {

        HomePage newPage = new HomePage(browser);
        UpcomingEvents clickedSpeaker = newPage.goToPresentingSpeaker(2);

        Assert.assertEquals("Erik Kieffer, King.com", clickedSpeaker.getSpeakerName(2));

    }
    @Test
    public void goToSpeaker3FromHomepage() {

        HomePage newPage = new HomePage(browser);
        UpcomingEvents clickedSpeaker = newPage.goToPresentingSpeaker(3);

        Assert.assertEquals("Ola Frykheden", clickedSpeaker.getSpeakerName(3));

    }
    @Test
    public void goToSpeaker4FromHomepage() {

        HomePage newPage = new HomePage(browser);
        UpcomingEvents clickedSpeaker = newPage.goToPresentingSpeaker(4);

        Assert.assertEquals("Andy Redwood, Redwood Associates", clickedSpeaker.getSpeakerName(4));
    }
    @Test
    public void visitRedMind() {

        SponsorLinks sponsor = new SponsorLinks(browser);
        Redmind redmindPage = sponsor.visitRedmind();

        Assert.assertEquals("https://redmind.se/", redmindPage.verifyPage());
    }
    @Test
    public void visitQtema() {

        SponsorLinks sponsor = new SponsorLinks(browser);
        Qtema qtemaPage = sponsor.visitQtema();

        Assert.assertEquals("https://www.qtema.se/", qtemaPage.verifyPage());
    }
    @Test
    public void visitInvero() {

        SponsorLinks sponsor = new SponsorLinks(browser);
        Invero inveroPage = sponsor.visitInvero();

        Assert.assertEquals("http://www.invero.se/", inveroPage.verifyPage());
    }
    @Test
    public void visitQualityPoint() {

        SponsorLinks sponsor = new SponsorLinks(browser);
        QualityPoint qualityPointPage = sponsor.visitQualityPoint();

        Assert.assertEquals("http://www.qualitypoint.se/", qualityPointPage.verifyPage());
    }
    @Test
    public void visitSqs() {

        SponsorLinks sponsor = new SponsorLinks(browser);
        Sqs sqsPage = sponsor.visitSqs();

        Assert.assertEquals("https://www.sqs.com/se/index.php", sqsPage.verifyPage());
    }
    @Test
    public void visitBrejn() {

        SponsorLinks sponsor = new SponsorLinks(browser);
        Brejn brejnPage = sponsor.visitBrejn();

        Assert.assertEquals("http://brejn.com/", brejnPage.verifyPage());
    }
    @Test
    public void goToBeASponsor() {

        HomePage page = new HomePage(browser);
        Sponsorships sponsorshipPage = page.goToBeASponsor();

        Assert.assertEquals("Sponsors – SIGIST Sweden", sponsorshipPage.verifyPage());
    }
    @Test
    public void viewAllProductsOnHomepage() {

        HomePage page = new HomePage(browser);
        Events clickOnAllProducts = page.goToViewAllProducts();

        Assert.assertEquals("Events – SIGIST Sweden", clickOnAllProducts.verifyPage());

    }
}
