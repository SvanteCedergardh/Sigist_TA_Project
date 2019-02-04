package pages.LinkPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {

    WebDriver browser;

    /*
    This link is broken, try the solution from the stackOverflow
    */
    By facebookLogoPath = By.xpath("//*[@id=\"seo_h1_tag\"]/a/span");
    public Facebook(WebDriver driver) {

        this.browser = driver;
    }

    public String verifyPage() {

        return browser.getCurrentUrl();//browser.findElement(facebookLogoPath).getText();
    }
}
