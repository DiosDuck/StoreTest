package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryStepPage {
    private WebDriver webDriver;

    public SummaryStepPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(id="cart_title")
    private WebElement pageTitle;
    public void checkIfSummaryStepPage(){
        Assert.assertEquals("SHOPPING-CART SUMMARY",pageTitle.getText().split("\n")[0]);
    }
    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//span")
    private WebElement proceedToCheckoutButton;
    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
    @FindBy(xpath = "//*[@id='product_1_1_0_0']//*[@class='icon-trash']")
    private WebElement deleteProductButton;
    public void clickDeleteProductButton(){
        deleteProductButton.click();
    }
    @FindBy(xpath = "//*[@class='alert alert-warning']")
    private WebElement warningMessage;
    public void checkWarningMessage(String expectedText){
        Assert.assertEquals(expectedText,warningMessage.getText());
    }
}
