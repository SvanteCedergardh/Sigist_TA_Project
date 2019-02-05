package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SocialMediaLinkPages.Facebook;
import pages.SocialMediaLinkPages.GooglePlus;
import pages.SocialMediaLinkPages.LinkedIn;
import pages.SocialMediaLinkPages.Twitter;

public class SocialMediaLinksPage {

    WebDriver browser;

    By googlePlusButtonTopPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[1]/a");
    By googlePlusButtonBottomPath = By.xpath("//*[@id=\"one_social_widget-1\"]/div/ul/li[1]/a");
    By twitterButtonTopPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[2]/a");
    By twitterButtonBottomPath = By.xpath("//*[@id=\"one_social_widget-1\"]/div/ul/li[2]/a");
    By facebookButtonTopPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[3]/a");
    By facebookButtonBottomPath = By.xpath("//*[@id=\"one_social_widget-1\"]/div/ul/li[3]/a");
    By linkedInButtonTopPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[4]/a");
    By linkedInButtonBottomPath = By.xpath("//*[@id=\"one_social_widget-1\"]/div/ul/li[4]/a");

    public SocialMediaLinksPage(WebDriver driver) {

        this.browser = driver;
    }
    public GooglePlus visitGooglePlusThroughTopLink() {

        WebElement link = browser.findElement(googlePlusButtonTopPath);
        String googleHref = link.getAttribute("href");
        browser.get(googleHref);

        return new GooglePlus(browser);
    }
    public GooglePlus visitGooglePlusThroughBottomLink() {

        WebElement link = browser.findElement(googlePlusButtonBottomPath);
        String googleHref = link.getAttribute("href");
        browser.get(googleHref);

        return new GooglePlus(browser);
    }

    public Twitter visitTwitterThroughTopLink() {

        WebElement link = browser.findElement(twitterButtonTopPath);
        String twitterHref = link.getAttribute("href");
        browser.get(twitterHref);

        return new Twitter(browser);
    }
    public Twitter visitTwitterThroughBottomLink() {

        WebElement link = browser.findElement(twitterButtonBottomPath);
        String twitterHref = link.getAttribute("href");
        browser.get(twitterHref);

        return new Twitter(browser);
    }
    public Facebook visitFacebookThroughTopLink() {

        WebElement link = browser.findElement(facebookButtonTopPath);
        String fbHref = link.getAttribute("href");
        browser.get(fbHref);

        return new Facebook(browser);
    }
    public Facebook visitFacebookThroughBottomLink() {

        WebElement link = browser.findElement(facebookButtonBottomPath);
        String fbHref = link.getAttribute("href");
        browser.get(fbHref);

        return new Facebook(browser);
    }
    public LinkedIn visitLinkedInThroughTopLink() {

        WebElement link = browser.findElement(linkedInButtonTopPath);
        String linkedInHref = link.getAttribute("href");
        browser.get(linkedInHref);

        return new LinkedIn(browser);
    }
    public LinkedIn visitLinkedInThroughBottomLink() {

        WebElement link = browser.findElement(linkedInButtonBottomPath);
        String linkedInHref = link.getAttribute("href");
        browser.get(linkedInHref);

        return new LinkedIn(browser);
    }
}
