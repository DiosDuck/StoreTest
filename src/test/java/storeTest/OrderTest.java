package storeTest;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.OrderHistoryPage;
import pageObject.OrderSummaryPage;

public class OrderTest extends BaseTest {
    @Test
    public void addItemToCart() throws InterruptedException {
        //homePage.hoverImageItem();
        homePage.clickMoreDetailItemButton();
        itemPage.checkIfItemPage();
        itemPage.increaseQuantity();
        itemPage.decreaseQuantity();
        itemPage.selectSize(2);
        itemPage.setBlue();
        itemPage.clickAddToCartButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
    }
    @Test
    public void addItemToCartQuick() throws InterruptedException {
        //homePage.hoverImageItem();
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
    }
    @Test
    public void deleteItemFromCart() throws InterruptedException {
        //homePage.hoverImageItem();
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickContinueShoppingButton();
        homePage.clickRemoveItemFromCartButton();
        Thread.sleep(3000);
        homePage.checkIfCartEmpty();
    }

    @Test
    public void searchForAnItem(){
        homePage.insertIntoSearchInput("Faded Short Sleeve T-shirts");
        homePage.clickSearchButton();
        searchResultPage.checkIfSearchPage();
        searchResultPage.checkSearchResultText("1 result has been found.");
    }

    @Test
    public void searchForAnNonexistentItem(){
        homePage.insertIntoSearchInput("banana");
        homePage.clickSearchButton();
        searchResultPage.checkIfSearchPage();
        searchResultPage.checkSearchResultText("0 results have been found.");
    }

    @Test
    public void orderByBankWire() throws InterruptedException {
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        signInStep.checkIfSignInStep();
        signInStep.insertIntoLoginEmail("tapucovidiu@gmail.com");
        signInStep.insertIntoLoginPasswd("parola123");
        signInStep.clickLoginButton();
        addressStep.checkIfAddressStep();
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickBankWireButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfBankWire();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkTitleMessage("Your order on My Store is complete.");
    }

    @Test
    public void orderByCheck() throws InterruptedException {
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        signInStep.checkIfSignInStep();
        signInStep.insertIntoLoginEmail("tapucovidiu@gmail.com");
        signInStep.insertIntoLoginPasswd("parola123");
        signInStep.clickLoginButton();
        addressStep.checkIfAddressStep();
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickCheckButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfCheck();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkNotifMessage("Your order on My Store is complete.");
    }

    @Test
    public void orderWhileLoggedIn() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("tapucovidiu@gmail.com");
        authenticationPage.insertIntoLoginPasswd("parola123");
        authenticationPage.clickLoginButton();
        myAccountPage.checkIfMyAccountPage();
        myAccountPage.checkUser("John Mazare");
        myAccountPage.clickHomeButton();
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        addressStep.checkIfAddressStep();
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickCheckButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfCheck();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkNotifMessage("Your order on My Store is complete.");

    }

    @Test
    public void orderWhileRegister() throws InterruptedException {
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        signInStep.checkIfSignInStep();
        signInStep.insertIntoRegisterEmail("valid_email2@email.com");
        signInStep.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoPasswd("parola123");
        registerPage.selectDay("1");
        registerPage.selectMonth("2");
        registerPage.selectYear("1987");
        registerPage.selectNewsletter();
        registerPage.selectOptin();
        registerPage.insertIntoAddressCompany("Cherestea");
        registerPage.insertIntoAddressAddress1("Nice Street, 1234");
        registerPage.insertIntoAddressCity("Florida");
        registerPage.selectState("Florida");
        registerPage.insertIntoAddressZipcode("12345");
        registerPage.selectCountry("United States");
        registerPage.insertIntoAddressOther("A durat ceva");
        registerPage.insertIntoAddressHomePhone("0712345678");
        registerPage.insertIntoAddressMobilePhone("0787654321");
        registerPage.insertIntoAddressAlias("My fucking address");
        registerPage.clickSubmitAccountButton();
        addressStep.checkIfAddressStep();
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickCheckButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfCheck();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkNotifMessage("Your order on My Store is complete.");
    }

    @Test
    public void orderOnANewAddress() throws InterruptedException {
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        signInStep.checkIfSignInStep();
        signInStep.insertIntoLoginEmail("tapucovidiu@gmail.com");
        signInStep.insertIntoLoginPasswd("parola123");
        signInStep.clickLoginButton();
        addressStep.checkIfAddressStep();
        addressStep.clickAddANewAddressButton();
        configAddressPage.checkIfConfigAddressPage();
        configAddressPage.insertIntoAddressCompany("Cherestea");
        configAddressPage.insertIntoAddressAddress1("Nice Street, 1234");
        configAddressPage.insertIntoAddressCity("Florida");
        configAddressPage.selectState("Florida");
        configAddressPage.insertIntoAddressZipcode("12345");
        configAddressPage.selectCountry("United States");
        configAddressPage.insertIntoAddressOther("A durat ceva");
        configAddressPage.insertIntoAddressHomePhone("0712345678");
        configAddressPage.insertIntoAddressMobilePhone("0787654321");
        configAddressPage.insertIntoAddressAlias("My fucking address 2");
        configAddressPage.clickSubmitAddressButton();
        addressStep.selectAddress("My fucking address 2");
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickCheckButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfCheck();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkNotifMessage("Your order on My Store is complete.");
    }

    @Test
    public void orderOnUpdatedAddress() throws InterruptedException {
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        signInStep.checkIfSignInStep();
        signInStep.insertIntoLoginEmail("tapucovidiu@gmail.com");
        signInStep.insertIntoLoginPasswd("parola123");
        signInStep.clickLoginButton();
        addressStep.checkIfAddressStep();
        addressStep.clickUpdateAddressButton();
        configAddressPage.checkIfConfigAddressPage();
        configAddressPage.insertIntoAddressZipcode("54541");
        configAddressPage.clickSubmitAddressButton();
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickCheckButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfCheck();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkNotifMessage("Your order on My Store is complete.");
    }

    @Test
    public void orderWhenTheUserDoesntHaveAnAddress() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("valid_email1@email.com");
        authenticationPage.insertIntoLoginPasswd("parola123");
        authenticationPage.clickLoginButton();
        myAccountPage.checkIfMyAccountPage();
        myAccountPage.checkUser("John Mazare");
        myAccountPage.clickMyAddressButton();
        myAddressesPage.checkIfMyAddressesPage();
        myAddressesPage.deleteLastAddress();
        myAddressesPage.clickHomeButton();
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        configAddressPage.checkIfConfigAddressPage();
        configAddressPage.insertIntoAddressCompany("Cherestea");
        configAddressPage.insertIntoAddressAddress1("Nice Street, 1234");
        configAddressPage.insertIntoAddressCity("Florida");
        configAddressPage.selectState("Florida");
        configAddressPage.insertIntoAddressZipcode("12345");
        configAddressPage.selectCountry("United States");
        configAddressPage.insertIntoAddressOther("A durat ceva");
        configAddressPage.insertIntoAddressHomePhone("0712345678");
        configAddressPage.insertIntoAddressMobilePhone("0787654321");
        configAddressPage.insertIntoAddressAlias("My fucking address");
        configAddressPage.clickSubmitAddressButton();
        addressStep.checkIfAddressStep();
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickCheckButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfCheck();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkNotifMessage("Your order on My Store is complete.");
    }

    @Test
    public void orderWithNoItems() throws InterruptedException {
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickDeleteProductButton();
        Thread.sleep(1000);
        summaryStepPage.checkWarningMessage("Your shopping cart is empty.");
    }

    @Test
    public void orderWhileDisagreeingTheTerms() throws InterruptedException {
        homePage.clickAddToCartItemButton();
        Thread.sleep(3000);
        popOutSuccessfullyAdded.checkIfPopoutSuccessfullyAdded();
        popOutSuccessfullyAdded.clickProceedToCheckoutButton();
        summaryStepPage.checkIfSummaryStepPage();
        summaryStepPage.clickProceedToCheckoutButton();
        signInStep.checkIfSignInStep();
        signInStep.insertIntoLoginEmail("tapucovidiu@gmail.com");
        signInStep.insertIntoLoginPasswd("parola123");
        signInStep.clickLoginButton();
        addressStep.checkIfAddressStep();
        addressStep.clickProceedToCheckoutButton();
        shippingStep.checkIfShippingStep();
        shippingStep.clickProceedToCheckoutButton();
        shippingStep.checkIfErrorPopout();
        shippingStep.clickCloseErrorPopout();
        shippingStep.clickAgreeTermBox();
        shippingStep.clickProceedToCheckoutButton();
        paymentMethodStep.checkIfPaymentMethofStep();
        paymentMethodStep.clickCheckButton();
        orderSummaryPage.checkIfOrderSummaryPage();
        orderSummaryPage.checkIfCheck();
        orderSummaryPage.clickProceedToCheckoutButton();
        orderSummaryPage.checkNotifMessage("Your order on My Store is complete.");
    }

    @Test
    public void checkOrderHistory(){
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("valid_email1@email.com");
        authenticationPage.insertIntoLoginPasswd("parola123");
        authenticationPage.clickLoginButton();
        myAccountPage.checkIfMyAccountPage();
        myAccountPage.checkUser("John Mazare");
        myAccountPage.clickOrderHistoryButton();
        orderHistoryPage.checkIfOrderHistoryPage();
    }
}
