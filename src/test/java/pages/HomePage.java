package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigistStartPage {

    WebDriver driver;

    By signInLink = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By emailLink = By.id("email");
    By passwordLink = By.id("passwd");
    String mailAddress = "slask@apa.se";
    String password = "slask";
    By signInButtonLink = By.xpath("//*[@id=\"SubmitLogin\"]/span");

    public SigistStartPage(WebDriver browser) {

        this.driver = browser;

    }
    public AutomationPracticeSignInPage goToSignInPage(){

        driver.findElement(signInLink).click();

        return new AutomationPracticeSignInPage(driver);
    }
    public String getNameOfSignInPage() {

        return driver.findElement(signInLink).getText();
    }
    public void logIn(){

        driver.findElement(emailLink).sendKeys(mailAddress);
        driver.findElement(passwordLink).sendKeys(password);
        driver.findElement(signInButtonLink).click();
    }
}
