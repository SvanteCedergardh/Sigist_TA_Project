package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sponsorships {

    WebDriver browser;

    By mainSponsor = By.xpath("//*[@id=\"page-119\"]/div/div/div/div/h3[1]/strong");
    By conferenceSponsor = By.xpath("//*[@id=\"page-119\"]/div/div/div/div/h3[2]/strong");
    By supportiveSponsor = By.xpath("//*[@id=\"page-119\"]/div/div/div/div/h3[3]/strong");
    By webSponsor = By.xpath("//*[@id=\"page-119\"]/div/div/div/div/h3[4]/strong");


    public Sponsorships(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyMainSponsorTitle() {

        return browser.findElement(mainSponsor).getText();
    }
    public String verifyConferenceSponsorTitle() {

        return browser.findElement(conferenceSponsor).getText();
    }
    public String verifySupportiveSponsorTitle() {

        return browser.findElement(supportiveSponsor).getText();
    }
    public String verifyWebSponsorTitle() {

        return browser.findElement(webSponsor).getText();
    }
    public String verifyPage() {

        Assert.assertEquals("Main Sponsor", verifyMainSponsorTitle());
        Assert.assertEquals("Conference Sponsor", verifyConferenceSponsorTitle());
        Assert.assertEquals("Supportive Sponsor", verifySupportiveSponsorTitle());
        Assert.assertEquals("Web Sponsor", verifyWebSponsorTitle());

        return browser.getTitle();
    }
}
