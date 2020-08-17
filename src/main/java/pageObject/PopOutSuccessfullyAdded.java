package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopOutSuccessfullyAdded {
    private WebDriver webDriver;

    public PopOutSuccessfullyAdded(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    private WebElement popoutTitle;

    public void checkIfPopoutSuccessfullyAdded(){
        Assert.assertEquals("Product successfully added to your shopping cart",popoutTitle.getText());
    }
    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")
    private WebElement continueShoppingButton;
    public void clickContinueShoppingButton(){
        continueShoppingButton.click();
    }
    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    private WebElement proceedToCheckoutButton;
    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
}
