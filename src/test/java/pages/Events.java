package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Events {

    WebDriver browser;

    By upcomingEventsLinkPath = By.xpath("/html/body/div[1]/p/a");
    By previousEventsLinkPath = By.xpath("/html/body/div[1]/p/a") ;

    public Events(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getTitle();
    }

    public PreviousEvents goToPreviusEvents() {

        browser.findElement(previousEventsLinkPath).click();

        return new PreviousEvents(browser);
    }
    public UpcomingEvents goToUpcomingEvents() {

        browser.findElement(upcomingEventsLinkPath).click();

        return new UpcomingEvents(browser);
    }
}
