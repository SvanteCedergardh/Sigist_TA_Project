package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LinkPages.Facebook;
import pages.LinkPages.GooglePlus;
import pages.LinkPages.LinkedIn;
import pages.LinkPages.Twitter;

public class SocialMediaLinksPage {

    WebDriver browser;

    By googlePlusPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[1]/a");
    By twitterPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[2]/a");
    By facebookButtonPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[3]/a");
    By linkedInPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[4]/a");

    public SocialMediaLinksPage(WebDriver driver) {

        this.browser = driver;
    }
    public GooglePlus visitGooglePlus() {

        WebElement link = browser.findElement(googlePlusPath);
        String googleHref = link.getAttribute("href");
        browser.get(googleHref);

        return new GooglePlus(browser);
    }
    public Twitter visitTwitter() {

        WebElement link = browser.findElement(twitterPath);
        String twitterHref = link.getAttribute("href");
        browser.get(twitterHref);

        return new Twitter(browser);
    }

    public Facebook visitFacebook() {

        WebElement link = browser.findElement(facebookButtonPath);
        String fbHref = link.getAttribute("href");
        browser.get(fbHref);

        return new Facebook(browser);
    }
    public LinkedIn visitLinkedIn() {

        WebElement link = browser.findElement(linkedInPath);
        String linkedInHref = link.getAttribute("href");
        browser.get(linkedInHref);

        return new LinkedIn(browser);
    }
}
