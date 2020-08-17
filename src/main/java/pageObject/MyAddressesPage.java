package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressesPage {
    private WebDriver webDriver;

    public MyAddressesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;
    public void checkIfMyAddressesPage(){
        Assert.assertEquals("MY ADDRESSES",pageTitle.getText());
    }
    @FindBy(xpath = "//*[@class='last_item item box']//a[2]")
    private WebElement lastAddressDeleteButton;
    public void deleteLastAddress(){
        lastAddressDeleteButton.click();
        webDriver.switchTo().alert().accept();
    }
    @FindBy(xpath = "//*[@class='icon-home']")
    private WebElement homeButton;
    public void clickHomeButton(){
        homeButton.click();
    }
}
