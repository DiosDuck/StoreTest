package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
    private WebElement imageItem;
    private void hoverImageItem(){
        Actions builder = new Actions(webDriver);
        Actions hoverOverRegistrar = builder.moveToElement(imageItem);
        hoverOverRegistrar.perform();
    }

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]")
    private WebElement moreDetailItemButton;

    public void clickMoreDetailItemButton(){
        hoverImageItem();
        moreDetailItemButton.click();
    }

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartItemButton;
    public void clickAddToCartItemButton(){
        hoverImageItem();
        addToCartItemButton.click();
    }

    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a")
    private WebElement removeItemFromCartButton;
    public void clickRemoveItemFromCartButton(){
        hoverShoppingCartIcon();
        removeItemFromCartButton.click();
    }

    @FindBy(xpath = "//*[@class='shopping_cart']/a")
    private WebElement shoppingCartIcon;
    private void hoverShoppingCartIcon(){
        Actions builder = new Actions(webDriver);
        Actions hoverOverRegistrar = builder.moveToElement(shoppingCartIcon);
        hoverOverRegistrar.perform();
    }

    @FindBy(xpath = "//*[@class='ajax_cart_no_product']")
    private WebElement emptyCartText;
    public void checkIfCartEmpty(){
        Assert.assertEquals("display: inline-block;",emptyCartText.getAttribute("style"));
    }
    public void checkIfCartNotEmpty(){
        Assert.assertEquals("display: none;",emptyCartText.getAttribute("style"));
    }

    @FindBy(id="search_query_top")
    private WebElement searchInput;
    public void insertIntoSearchInput(String text){
        searchInput.sendKeys(text);
    }
    @FindBy(xpath = "//*[@id='searchbox']/button")
    private WebElement searchButton;
    public void clickSearchButton(){
        searchButton.click();
    }
}
