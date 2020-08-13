package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotYourPasswordPage {
    private WebDriver webDriver;

    public ForgotYourPasswordPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@class='page-subheading']")
    private WebElement pageTitle;

    public void checkIfForgotYouPasswordPage() {
        Assert.assertEquals("FORGOT YOUR PASSWORD?", pageTitle.getText());
    }

    @FindBy(xpath = "//*[@class='form-control']")
    private WebElement emailInput;

    public void insertIntoEmailInput(String text) {
        emailInput.sendKeys(text);
    }

    @FindBy(xpath = " //*[@id='form_forgotpassword']//button")
    private WebElement retrievePasswordButton;

    public void clickRetrievePasswordButton() {
        retrievePasswordButton.submit();
    }

    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement successfulMessage;

    public void checkIfSuccessful(String expectedText) {
        Assert.assertEquals("A confirmation email has been sent to your address: " + expectedText, successfulMessage.getText());
    }

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    private WebElement errorMessage;

    public void checkErrorMessage(String expectedText) {
        Assert.assertEquals(expectedText, errorMessage.getText());
    }
}
