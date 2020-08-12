package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class HomePage {
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriver.get("http://automationpractice.com");
    }

    @FindBy(xpath = "//*[@class='login']")
    private WebElement signInButton;

    public void clickSignInButton() {
        signInButton.click();
    }
}
