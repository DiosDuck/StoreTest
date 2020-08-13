package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver webDriver;

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@id='noSlide']//h1")
    private WebElement pageTitle;

    public void checkIfRegisterPage() {
        Assert.assertEquals("CREATE AN ACCOUNT", pageTitle.getText());
    }

    @FindBy(id = "id_gender1")
    private WebElement radioTitleMr;

    public void setTitleMr() {
        radioTitleMr.click();
    }

    @FindBy(id = "id_gender2")
    private WebElement radioTitleMrs;

    public void setTitleMrs() {
        radioTitleMrs.click();
    }

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    public void insertIntoCustomerFirstName(String text) {
        customerFirstName.sendKeys(text);
    }

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    public void insertIntoCustomerLastName(String text) {
        customerLastName.sendKeys(text);
    }

    @FindBy(id = "email")
    private WebElement email;

    public void insertIntoEmail(String text) {
        email.clear();
        email.sendKeys(text);
    }

    @FindBy(id = "passwd")
    private WebElement passwd;

    public void insertIntoPasswd(String text) {
        passwd.sendKeys(text);
    }

    @FindBy(id = "days")
    private WebElement daySelect;

    public void selectDay(String value) {
        Select select = new Select(daySelect);
        select.selectByValue(value);
    }

    @FindBy(id = "months")
    private WebElement monthSelect;

    public void selectMonth(String value) {
        Select select = new Select(monthSelect);
        select.selectByValue(value);
    }

    @FindBy(id = "years")
    private WebElement yearSelect;

    public void selectYear(String value) {
        Select select = new Select(yearSelect);
        select.selectByValue(value);
    }

    @FindBy(id = "newsletter")
    private WebElement newsletter;

    public void selectNewsletter() {
        newsletter.click();
    }

    @FindBy(id = "optin")
    private WebElement optin;

    public void selectOptin() {
        optin.click();
    }

    @FindBy(id = "firstname")
    private WebElement addressFirstName;

    public void insertIntoAddressFirstName(String text) {
        addressFirstName.sendKeys(text);
    }

    @FindBy(id = "lastname")
    private WebElement addressLastName;

    public void insertIntoAddressLastName(String text) {
        addressLastName.sendKeys(text);
    }

    @FindBy(id = "company")
    private WebElement addressCompany;

    public void insertIntoAddressCompany(String text) {
        addressCompany.sendKeys(text);
    }

    @FindBy(id = "address1")
    private WebElement addressAddress1;

    public void insertIntoAddressAddress1(String text) {
        addressAddress1.sendKeys(text);
    }

    @FindBy(id = "address2")
    private WebElement addressAddress2;

    public void insertIntoAddressAddress2(String text) {
        addressAddress2.sendKeys(text);
    }

    @FindBy(id = "city")
    private WebElement addressCity;

    public void insertIntoAddressCity(String text) {
        addressCity.sendKeys(text);
    }

    @FindBy(id = "id_state")
    private WebElement addressState;

    public void selectState(String text) {
        Select select = new Select(addressState);
        select.selectByVisibleText(text);
    }

    @FindBy(id = "postcode")
    private WebElement addressZipcode;

    public void insertIntoAddressZipcode(String text) {
        addressZipcode.sendKeys(text);
    }

    @FindBy(id = "id_country")
    private WebElement addressCountry;

    public void selectCountry(String text) {
        Select select = new Select(addressCountry);
        select.selectByVisibleText(text);
    }

    @FindBy(id = "other")
    private WebElement addressOther;

    public void insertIntoAddressOther(String text) {
        addressOther.sendKeys(text);
    }

    @FindBy(id = "phone")
    private WebElement addressHomePhone;

    public void insertIntoAddressHomePhone(String text) {
        addressHomePhone.sendKeys(text);
    }

    @FindBy(id = "phone_mobile")
    private WebElement addressMobilePhone;

    public void insertIntoAddressMobilePhone(String text) {
        addressMobilePhone.sendKeys(text);
    }

    @FindBy(id = "alias")
    private WebElement addressAlias;

    public void insertIntoAddressAlias(String text) {
        addressAlias.clear();
        addressAlias.sendKeys(text);
    }

    @FindBy(id = "submitAccount")
    private WebElement submitAccountButton;

    public void clickSubmitAccountButton() {
        submitAccountButton.click();
    }

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    private WebElement errorMessageCreateAccount;

    public void checkErrorMessageCreateAccount(String expectedText) {
        Assert.assertEquals(expectedText, errorMessageCreateAccount.getText());
    }
}
