package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.XMLFormatter;

public class ConfigAddressPage {
    private WebDriver webDriver;

    public ConfigAddressPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@class='page-subheading']")
    private WebElement pageTitle;
    public void checkIfConfigAddressPage(){
        Assert.assertEquals("YOUR ADDRESSES",pageTitle.getText());
    }
    @FindBy(id = "firstname")
    private WebElement addressFirstName;

    public void insertIntoAddressFirstName(String text) {
        addressFirstName.clear();
        addressFirstName.sendKeys(text);
    }

    @FindBy(id = "lastname")
    private WebElement addressLastName;

    public void insertIntoAddressLastName(String text) {
        addressLastName.clear();
        addressLastName.sendKeys(text);
    }

    @FindBy(id = "company")
    private WebElement addressCompany;

    public void insertIntoAddressCompany(String text) {
        addressCompany.clear();
        addressCompany.sendKeys(text);
    }

    @FindBy(id = "address1")
    private WebElement addressAddress1;

    public void insertIntoAddressAddress1(String text) {
        addressAddress1.clear();
        addressAddress1.sendKeys(text);
    }

    @FindBy(id = "address2")
    private WebElement addressAddress2;

    public void insertIntoAddressAddress2(String text) {
        addressAddress2.clear();
        addressAddress2.sendKeys(text);
    }

    @FindBy(id = "city")
    private WebElement addressCity;

    public void insertIntoAddressCity(String text) {
        addressCity.clear();
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
        addressZipcode.clear();
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
        addressOther.clear();
        addressOther.sendKeys(text);
    }

    @FindBy(id = "phone")
    private WebElement addressHomePhone;

    public void insertIntoAddressHomePhone(String text) {
        addressHomePhone.clear();
        addressHomePhone.sendKeys(text);
    }

    @FindBy(id = "phone_mobile")
    private WebElement addressMobilePhone;

    public void insertIntoAddressMobilePhone(String text) {
        addressMobilePhone.clear();
        addressMobilePhone.sendKeys(text);
    }

    @FindBy(id = "alias")
    private WebElement addressAlias;

    public void insertIntoAddressAlias(String text) {
        addressAlias.clear();
        addressAlias.sendKeys(text);
    }

    @FindBy(id = "submitAddress")
    private WebElement submitAddressButton;

    public void clickSubmitAddressButton() {
        submitAddressButton.click();
    }
}
