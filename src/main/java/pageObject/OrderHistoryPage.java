package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage {
    private WebDriver webDriver;

    public OrderHistoryPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@class='page-heading bottom-indent']")
    private WebElement pageTitle;
    public void checkIfOrderHistoryPage(){
        Assert.assertEquals("ORDER HISTORY",pageTitle.getText());
    }
}
