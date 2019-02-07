package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Sponsors.*;

public class SponsorLinks {

    WebDriver browser;

    By redmindLinkPath = By.xpath("//*[@id=\"page\"]/section[4]/div/div/div/div[1]/div[2]/div/div[1]/div[1]/a/img") ;
    By qtemaLinkPath = By.xpath("//*[@id=\"page\"]/section[4]/div/div/div/div[1]/div[2]/div/div[2]/div[1]/a/img");
    By inveroLinkPath = By.xpath("//*[@id=\"page\"]/section[4]/div/div/div/div[1]/div[2]/div/div[3]/div[1]/a/img");
    By qualityPointLinkPath = By.xpath("//*[@id=\"page\"]/section[4]/div/div/div/div[1]/div[2]/div/div[4]/div[1]/a/img");
    By sqsLinkPath = By.xpath("//*[@id=\"page\"]/section[4]/div/div/div/div[1]/div[2]/div/div[5]/div[1]/a/img");
    By brejnLinkPath = By.xpath("//*[@id=\"page\"]/section[4]/div/div/div/div[1]/div[2]/div/div[6]/div[1]/a/img");

    public SponsorLinks(WebDriver driver) {

        this.browser = driver;
    }
    public Redmind visitRedmind() {

        browser.findElement(redmindLinkPath).click();

        return new Redmind(browser);
    }
    public Qtema visitQtema() {

        browser.findElement(qtemaLinkPath).click();

        return new Qtema(browser);
    }
    public Invero visitInvero() {

        browser.findElement(inveroLinkPath).click();

        return new Invero(browser);
    }
    public QualityPoint visitQualityPoint() {

        browser.findElement(qualityPointLinkPath).click();

        return new QualityPoint(browser);
    }
    public Sqs visitSqs() {

        browser.findElement(sqsLinkPath).click();

        return new Sqs(browser);
    }
    public Brejn visitBrejn() {

        browser.findElement(brejnLinkPath).click();

        return new Brejn(browser);
    }
}
