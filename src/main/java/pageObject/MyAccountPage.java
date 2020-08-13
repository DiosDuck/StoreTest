package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
    private WebDriver webDriver;

    public MyAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;

    public void checkIfMyAccountPage() {
        Assert.assertEquals("MY ACCOUNT", pageTitle.getText());
    }

    @FindBy(xpath = "//*[@class='account']")
    private WebElement accountButton;

    public void checkUser(String expectedText) {

        Assert.assertEquals(expectedText, accountButton.getText());
    }


}
