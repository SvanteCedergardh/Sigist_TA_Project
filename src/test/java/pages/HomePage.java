package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver browser;

    public HomePage(WebDriver driver) {

        this.browser = driver;
    }
    public String getSigistTitle() {

        return browser.getTitle();
    }
}
