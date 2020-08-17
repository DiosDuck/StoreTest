package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodStep {
    private WebDriver webDriver;

    public PaymentMethodStep(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;
    public void checkIfPaymentMethofStep(){
        Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD",pageTitle.getText());
    }
    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]//a")
    private WebElement bankWireButton;
    public void clickBankWireButton(){
        bankWireButton.click();
    }
    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[2]//a")
    private WebElement checkButton;
    public void clickCheckButton(){
        checkButton.click();
    }
}
