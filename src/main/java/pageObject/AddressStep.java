package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressStep {
    private WebDriver webDriver;

    public AddressStep(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@id='center_column']/h1")
    private WebElement pageTitle;
    public void checkIfAddressStep() {
        Assert.assertEquals("ADDRESSES",pageTitle.getText());
    }
    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//button")
    private WebElement proceedToCheckoutButton;
    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
    @FindBy(xpath = "//*[@class='address_add submit']//a")
    private WebElement addANewAddressButton;
    public void clickAddANewAddressButton(){
        addANewAddressButton.click();
    }
    @FindBy(id="id_address_delivery")
    private WebElement addressSelect;
    public void selectAddress(String text){
        Select select=new Select(addressSelect);
        select.selectByVisibleText(text);
    }
    @FindBy(xpath = "//*[@id='address_delivery']//a")
    private WebElement updateAddressButton;
    public void clickUpdateAddressButton(){
        updateAddressButton.click();
    }
}
