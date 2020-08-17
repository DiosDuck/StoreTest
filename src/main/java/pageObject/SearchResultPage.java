package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {
    private WebDriver webDriver;

    public SearchResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
    private WebElement pageTitle;
    public void checkIfSearchPage(){
        Assert.assertEquals("Search",pageTitle.getText());
    }
    @FindBy(xpath = "//*[@class='heading-counter']")
    private WebElement searchResultText;
    public void checkSearchResultText(String expectedText){
        Assert.assertEquals(expectedText,searchResultText.getText());
    }

}
