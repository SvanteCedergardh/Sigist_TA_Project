package test.SIGIST;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AutomationPracticeStartPage;

import java.util.concurrent.TimeUnit;

public class SeleniumTests {

    WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){

        driver.quit();
    }

    @Test
    public void goToSignInPage(){

        AutomationPracticeStartPage startPage = new AutomationPracticeStartPage(driver);

        startPage.goToSignInPage();

        Assert.assertEquals("Sign in",startPage.getNameOfSignInPage());
    }
    @Test
    public void signIn(){

        AutomationPracticeStartPage startPage = new AutomationPracticeStartPage(driver);
        startPage.goToSignInPage();
        startPage.logIn();
    }
    /*
    @Test
    public void firstLogIn(){

        driver.findElement(By.id("email")).sendKeys("slask@apa.se");
        driver.findElement(By.id("passwd")).sendKeys("slask");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();


    }
    @Test
    public void goToDresses() {

        WebElement dressesLink = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));

        dressesLink.click();

        WebElement buyPrintedChiffonDress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span"));
        buyPrintedChiffonDress.click();

        WebElement proceedToCheckoutFromCategories = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        proceedToCheckoutFromCategories.click();

        WebElement proceedToCheckoutFromShoppingCartSummary = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
        proceedToCheckoutFromShoppingCartSummary.click();

        //logIn();

        WebElement addressProceedToCheckout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
        addressProceedToCheckout.click();

        WebElement termsOfService = driver.findElement(By.id("cgv"));
        termsOfService.click();

        WebElement addressProceedToCheckout1 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
        addressProceedToCheckout1.click();

        WebElement addressProceedToCheckout2 = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a\n"));
        addressProceedToCheckout2.click();

        WebElement addressProceedToCheckout3 = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
        addressProceedToCheckout3.click();

    }
    */
}
