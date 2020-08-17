package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ItemPage {
    private WebDriver webDriver;

    public ItemPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@id='columns']//h1")
    private WebElement pageTitle;

    public void checkIfItemPage(){
        Assert.assertEquals("Faded Short Sleeve T-shirts",pageTitle.getText());
    }

    @FindBy(xpath = "//*[@class='icon-minus']")
    private WebElement lessQuantityButton;
    public void decreaseQuantity(){
        lessQuantityButton.click();
    }
    @FindBy(xpath = "//*[@class='icon-plus']")
    private WebElement moreQuantityButton;
    public void increaseQuantity(){
        moreQuantityButton.click();
    }
    @FindBy(id="group_1")
    private WebElement sizeSelect;
    public void selectSize(int index){
        Select select=new Select(sizeSelect);
        select.selectByIndex(index);
    }
    @FindBy(id="color_13")
    private WebElement orangeColorButton;
    public void setOrange(){
        orangeColorButton.click();
    }
    @FindBy(id="color_14")
    private WebElement blueColorButton;
    public void setBlue(){
        blueColorButton.click();
    }
    @FindBy(xpath = "//*[@id='add_to_cart']//span")
    private WebElement addToCartButton;
    public void clickAddToCartButton(){
        addToCartButton.click();
    }
}
