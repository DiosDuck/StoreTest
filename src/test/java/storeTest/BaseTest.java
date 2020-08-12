package storeTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.AuthenticationPage;
import pageObject.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver webDriver;
    public HomePage homePage;
    public AuthenticationPage authenticationPage;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage= PageFactory.initElements(webDriver,HomePage.class);
        authenticationPage=PageFactory.initElements(webDriver,AuthenticationPage.class);
    }
    @After
    public void after(){
        //webDriver.quit();
    }
}
