package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {
    private WebDriver webDriver;

    public AuthenticationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;

    public void checkPageTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle, pageTitle.getText());
    }
}
