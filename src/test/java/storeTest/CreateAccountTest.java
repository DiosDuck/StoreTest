package storeTest;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class CreateAccountTest extends BaseTest {

    @Test
    public void successfulCreateAnAccount() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email2@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(4000);
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
        myAccountPage.checkIfMyAccountPage();
        myAccountPage.checkUser("John Mazare");
    }

    @Test
    public void unsuccessfulCreateAccountUsedEmail() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email2@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        authenticationPage.checkErrorMessageCreate("An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test
    public void unsuccessfulCreateAccountInvalidEmail() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email2@emailcom");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        authenticationPage.checkErrorMessageCreate("Invalid email address.");
    }

    @Test
    public void unsuccessfulCreateAccountBlankEmail() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        authenticationPage.checkErrorMessageCreate("Invalid email address.");
    }

    @Test
    public void unsuccessfulCreateAccountUsedEmailInCreateAccountPage() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("tapucovidiu@gmail.com");
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
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nAn account using this email address has already been registered.");
    }

    @Test
    public void unsuccessfulCreateAccountInvalidEmailInCreateAccountPage() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("tapucovidiu@gmailcom");
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
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nemail is invalid.");
    }

    @Test
    public void unsuccessfulCreateAccountBlankEmailInCreateAccountPage() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("");
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
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nemail is required.");
    }

    @Test
    public void unsuccessfulCreateAccountDoesntFillTheRequiredFields() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email3@email.com");
        registerPage.insertIntoPasswd("parola123");
        registerPage.selectDay("1");
        registerPage.selectMonth("2");
        registerPage.selectYear("1987");
        registerPage.selectNewsletter();
        registerPage.selectOptin();
        registerPage.insertIntoAddressCompany("Cherestea");
        //this time doesnt fill the address
        //registerPage.insertIntoAddressAddress1("Nice Street, 1234");
        registerPage.insertIntoAddressCity("Florida");
        registerPage.selectState("Florida");
        registerPage.insertIntoAddressZipcode("12345");
        registerPage.selectCountry("United States");
        registerPage.insertIntoAddressOther("A durat ceva");
        registerPage.insertIntoAddressHomePhone("0712345678");
        registerPage.insertIntoAddressMobilePhone("0787654321");
        registerPage.insertIntoAddressAlias("My fucking address");
        registerPage.clickSubmitAccountButton();
        registerPage.checkErrorMessageCreateAccount("There is 1 error\naddress1 is required.");
    }

    @Test
    public void unsuccessfulCreateAccountPasswordShorter() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email3@email.com");
        registerPage.insertIntoPasswd("123");
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
        registerPage.checkErrorMessageCreateAccount("There is 1 error\npasswd is invalid.");
    }

    @Test
    public void unsuccessfulCreateAccountLettersInNumberFields() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email3@email.com");
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
        registerPage.insertIntoAddressHomePhone("07a2345678");
        registerPage.insertIntoAddressMobilePhone("0787654321");
        registerPage.insertIntoAddressAlias("My fucking address");
        registerPage.clickSubmitAccountButton();
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nphone is invalid.");
    }

    @Test
    public void unsuccessfulCreateAccountNumbersInOnlyLetterFields() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John1");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email6@email.com");
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
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nfirstname is invalid.");
    }

    @Test
    public void unsuccessfulCreateAccountInvalidAddress() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email7@email.com");
        registerPage.insertIntoPasswd("parola123");
        registerPage.selectDay("1");
        registerPage.selectMonth("2");
        registerPage.selectYear("1987");
        registerPage.selectNewsletter();
        registerPage.selectOptin();
        registerPage.insertIntoAddressCompany("Cherestea");
        registerPage.insertIntoAddressAddress1("a");
        registerPage.insertIntoAddressCity("Florida");
        registerPage.selectState("Florida");
        registerPage.insertIntoAddressZipcode("12345");
        registerPage.selectCountry("United States");
        registerPage.insertIntoAddressOther("A durat ceva");
        registerPage.insertIntoAddressHomePhone("0712345678");
        registerPage.insertIntoAddressMobilePhone("0787654321");
        registerPage.insertIntoAddressAlias("My fucking address");
        registerPage.clickSubmitAccountButton();
        registerPage.checkErrorMessageCreateAccount("There is 1 error\naddress1 is invalid.");
    }
    @Test
    public void unsuccessfulCreateAccountInvalidDate() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email8@email.com");
        registerPage.insertIntoPasswd("parola123");
        registerPage.selectDay("31");
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
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nInvalid date of birth");
    }

    @Test
    public void unsuccessfulCreateAccountInvalidZipcode() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email3@email.com");
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
        registerPage.insertIntoAddressZipcode("123456");
        registerPage.selectCountry("United States");
        registerPage.insertIntoAddressOther("A durat ceva");
        registerPage.insertIntoAddressHomePhone("0712345678");
        registerPage.insertIntoAddressMobilePhone("0787654321");
        registerPage.insertIntoAddressAlias("My fucking address");
        registerPage.clickSubmitAccountButton();
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nThe Zip/Postal code you've entered is invalid. It must follow this format: 00000");
    }

    @Test
    public void unsuccessfulCreateAccountInvalidPhone() throws InterruptedException {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoRegisterEmail("valid_email3@email.com");
        authenticationPage.clickCreateAnAccountButton();
        Thread.sleep(3000);
        registerPage.checkIfRegisterPage();
        registerPage.setTitleMr();
        registerPage.insertIntoCustomerFirstName("John");
        registerPage.insertIntoCustomerLastName("Mazare");
        registerPage.insertIntoEmail("valid_email5@email.com");
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
        registerPage.insertIntoAddressHomePhone("07");
        registerPage.insertIntoAddressMobilePhone("0787654321");
        registerPage.insertIntoAddressAlias("My fucking address");
        registerPage.clickSubmitAccountButton();
        registerPage.checkErrorMessageCreateAccount("There is 1 error\nphone is invalid.");
    }


}
