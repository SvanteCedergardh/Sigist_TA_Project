package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {

    WebDriver browser;

    By viewConferenceLinkPath = By.xpath("//*[@id=\"page\"]/section[1]/div/div/div/div/div/div/a");
    By signUpHereLinkPath = By.xpath("//*[@id=\"page\"]/section[2]/div/div/div[2]/div[2]/span/p[2]/a/img");
    By seeAgendaLinkPath = By.xpath("//*[@id=\"page\"]/section[2]/div/div/div[2]/div[3]/a");

    By speaker1LinkPath = By.xpath("//*[@id=\"page\"]/section[3]/div/div/div/div/div[2]/div/div[1]/div[2]/div/a");
    By speaker2LinkPath = By.xpath("//*[@id=\"page\"]/section[3]/div/div/div/div/div[2]/div/div[2]/div[2]/div/a");
    By speaker3LinkPath = By.xpath("//*[@id=\"page\"]/section[3]/div/div/div/div/div[2]/div/div[3]/div[2]/div/a");
    By speaker4LinkPath = By.xpath("//*[@id=\"page\"]/section[3]/div/div/div/div/div[2]/div/div[4]/div[2]/div/a");

    By sponsorLinkPath = By.xpath("//*[@id=\"page\"]/section[4]/div/div/div/div[2]/a");
    By allProductsLinkPath = By.xpath("//*[@id=\"page\"]/section[6]/div/div/div/div[2]/a");

    public HomePage(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyTitle() {

        return browser.getTitle();
    }
    public UpcomingEvents viewConference() {

        browser.findElement(viewConferenceLinkPath).click();

        return new UpcomingEvents(browser);
    }
    public SignUp goToSignUpPage(){

        browser.findElement(signUpHereLinkPath).click();

        return new SignUp(browser);

    }
    public UpcomingEvents seeAgenda() {

        browser.findElement(seeAgendaLinkPath).click();

        return new UpcomingEvents(browser);
    }
    public UpcomingEvents goToPresentingSpeaker(int speaker) {

        switch (speaker) {

            case 1: {
                browser.findElement(speaker1LinkPath).click();
            }
            break;

            case 2: {
                browser.findElement(speaker2LinkPath).click();
            }
            break;

            case 3: {
                browser.findElement(speaker3LinkPath).click();
            }
            break;

            case 4: {
                browser.findElement(speaker4LinkPath).click();
            }
            break;
        }

        return new UpcomingEvents(browser);
    }
    public Sponsorships goToBeASponsor() {

        browser.findElement(sponsorLinkPath).click();

        return new Sponsorships(browser);
    }
    public Events goToViewAllProducts() {

        browser.findElement(allProductsLinkPath).click();

        return new Events(browser);
    }
}
