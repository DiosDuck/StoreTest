package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInStep {
    private WebDriver webDriver;

    public SignInStep(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;

    public void checkIfSignInStep() {
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

}
