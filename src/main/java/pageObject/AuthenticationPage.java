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

    public void checkIfAuthenticationPage() {
        Assert.assertEquals("AUTHENTICATION", pageTitle.getText());
    }

    @FindBy(id = "email")
    private WebElement loginEmail;

    public void insertIntoLoginEmail(String text) {
        loginEmail.sendKeys(text);
    }

    @FindBy(id = "passwd")
    private WebElement loginPasswd;

    public void insertIntoLoginPasswd(String text) {
        loginPasswd.sendKeys(text);
    }

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    public void clickLoginButton() {
        loginButton.click();
    }

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    private WebElement errorMessageLogin;

    public void checkErrorMessageLogin(String expectedText) {
        Assert.assertEquals(expectedText, errorMessageLogin.getText());
    }

    @FindBy(xpath = "//*[@class='lost_password form-group']/a")
    private WebElement forgotYourPasswordButton;

    public void clickForgotYourPasswordButton() {
        forgotYourPasswordButton.click();
    }

    @FindBy(id = "email_create")
    private WebElement registerEmail;

    public void insertIntoRegisterEmail(String text) {
        registerEmail.sendKeys(text);
    }

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    public void clickCreateAnAccountButton() {
        createAnAccountButton.click();
    }

    @FindBy(id = "create_account_error")
    private WebElement errorMessageCreate;

    public void checkErrorMessageCreate(String expectedText) {
        Assert.assertEquals(expectedText, errorMessageCreate.getText());
    }

}
