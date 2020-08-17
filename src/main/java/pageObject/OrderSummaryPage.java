package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage {
    private WebDriver webDriver;

    public OrderSummaryPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;
    public void checkIfOrderSummaryPage(){
        Assert.assertEquals("ORDER SUMMARY",pageTitle.getText());
    }
    @FindBy(xpath = "//*[@class='page-subheading']")
    private WebElement pageSubtitle;
    public void checkIfBankWire(){
        Assert.assertEquals("BANK-WIRE PAYMENT.",pageSubtitle.getText());
    }
    public void checkIfCheck(){
        Assert.assertEquals("CHECK PAYMENT",pageSubtitle.getText());
    }

    @FindBy(xpath = "//*[@class='cheque-indent']")
    private WebElement titleMessage;
    public void checkTitleMessage(String expectedText){
        Assert.assertEquals(expectedText,titleMessage.getText());
    }
    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement notifMessage;
    public void checkNotifMessage(String expectedText){
        Assert.assertEquals(expectedText,notifMessage.getText());
    }
    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//button")
    private WebElement proceedToCheckoutButton;
    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
}
