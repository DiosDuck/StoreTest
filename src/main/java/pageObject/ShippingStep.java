package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingStep {
    private WebDriver webDriver;

    public ShippingStep(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;
    public void checkIfShippingStep(){
        Assert.assertEquals("SHIPPING",pageTitle.getText());
    }
    @FindBy(id="cgv")
    private WebElement agreeTermBox;
    public void clickAgreeTermBox(){
        agreeTermBox.click();
    }
    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//button")
    private WebElement proceedToCheckoutButton;
    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
    @FindBy(xpath = "//*[@class='fancybox-error']")
    private WebElement errorPopout;
    public void checkIfErrorPopout(){
        Assert.assertEquals("You must agree to the terms of service before continuing.",errorPopout.getText());
    }
    @FindBy(xpath = "//*[@class='fancybox-item fancybox-close']")
    private WebElement closeErrorPopout;
    public void clickCloseErrorPopout(){
        closeErrorPopout.click();
    }

}
