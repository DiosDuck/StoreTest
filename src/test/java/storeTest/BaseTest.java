package storeTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver webDriver;
    public HomePage homePage;
    public AuthenticationPage authenticationPage;
    public MyAccountPage myAccountPage;
    public ForgotYourPasswordPage forgotYourPasswordPage;
    public RegisterPage registerPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        webDriver = new ChromeDriver();
        //half right
        webDriver.manage().window().setSize(new Dimension(779, 829));
        webDriver.manage().window().setPosition(new Point(761, 0));
        //full screen
        //webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        authenticationPage = PageFactory.initElements(webDriver, AuthenticationPage.class);
        myAccountPage = PageFactory.initElements(webDriver, MyAccountPage.class);
        forgotYourPasswordPage = PageFactory.initElements(webDriver, ForgotYourPasswordPage.class);
        registerPage = PageFactory.initElements(webDriver, RegisterPage.class);
    }

    @After
    public void after() {
        //webDriver.quit();
    }
}
