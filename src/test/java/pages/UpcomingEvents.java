package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class UpcomingEvents {

    WebDriver browser;

    By torbjornRyberg = By.xpath("//*[@id=\"page-49\"]/div/div/div/div/h2[1]");
    By erikKieffer = By.xpath("//*[@id=\"page-49\"]/div/div/div/div/h2[3]");
    By olaFrykheden = By.xpath("//*[@id=\"page-49\"]/div/div/div/div/h2[4]");
    By andyRedwood = By.xpath("//*[@id=\"page-49\"]/div/div/div/div/h2[5]");

    public UpcomingEvents(WebDriver driver) {

        this.browser = driver;
    }
    public void verifyPage() {

        Assert.assertEquals("Upcoming – SIGIST Sweden", browser.getTitle());
    }
    public String getSpeakerName(int currentSpeaker) {

        String currentName = "";

        switch (currentSpeaker) {

            case 1: {

                ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", browser.findElement((torbjornRyberg)));

                currentName = browser.findElement(torbjornRyberg).getText();
            }
            break;

            case 2: {

                ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", browser.findElement((erikKieffer)));

                currentName = browser.findElement(erikKieffer).getText();
            }
            break;

            case 3: {

                ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", browser.findElement((olaFrykheden)));

                currentName = browser.findElement(olaFrykheden).getText();
            }
            break;

            case 4: {

                ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", browser.findElement((andyRedwood)));


                currentName = browser.findElement(andyRedwood).getText();
            }
            break;
        }
        return currentName;
    }
}
