package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LinkPages.Facebook;
import pages.LinkPages.GooglePlus;

public class SocialMediaLinksPage {

    WebDriver browser;

    By googlePlusPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[1]/a");
    By twitterPath = By.id("twitter");
    By facebookButtonPath = By.xpath("//*[@id=\"site-header\"]/div/div[1]/div[2]/div/ul/li[3]/a");
    By linkedInPath = By.id("linkedin");

    public SocialMediaLinksPage(WebDriver driver) {

        this.browser = driver;
    }
    public GooglePlus visitGooglePlus() {

        WebElement link = browser.findElement(googlePlusPath);
        String googleHref = link.getAttribute("href");
        browser.get(googleHref);

        return new GooglePlus(browser);
    }

    public Facebook visitFacebook() {

        WebElement link = browser.findElement(facebookButtonPath);
        String fbHref = link.getAttribute("href");
        browser.get(fbHref);

        return new Facebook(browser);
    }
}
