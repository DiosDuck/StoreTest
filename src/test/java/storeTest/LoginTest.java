package storeTest;

import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLogin() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("tapucovidiu@gmail.com");
        authenticationPage.insertIntoLoginPasswd("wwyHVsMUv256iht");
        authenticationPage.clickLoginButton();
        myAccountPage.checkIfMyAccountPage();
        myAccountPage.checkUser("Tapuc Ovidiu");
    }

    @Test
    public void unsuccessfulLoginWrongPassword() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("tapucovidiu@gmail.com");
        authenticationPage.insertIntoLoginPasswd("anaadwdawdaw");
        authenticationPage.clickLoginButton();
        authenticationPage.checkErrorMessageLogin("There is 1 error\nAuthentication failed.");
    }

    @Test
    public void unsuccessfulLoginUnusedEmail() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("tapcovidiu@gmail.com");
        authenticationPage.insertIntoLoginPasswd("anaqwdqwd");
        authenticationPage.clickLoginButton();
        authenticationPage.checkErrorMessageLogin("There is 1 error\nAuthentication failed.");
    }

    @Test
    public void unsuccessfulLoginInvalidEmail() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("tapucovidiu@gmailcom");
        authenticationPage.insertIntoLoginPasswd("anawqdqd");
        authenticationPage.clickLoginButton();
        authenticationPage.checkErrorMessageLogin("There is 1 error\nInvalid email address.");
    }

    @Test
    public void unsuccessfulLoginInvalidPassword() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("tapucovidiu@gmail.com");
        authenticationPage.insertIntoLoginPasswd("ana");
        authenticationPage.clickLoginButton();
        authenticationPage.checkErrorMessageLogin("There is 1 error\nInvalid password.");
    }

    @Test
    public void unsuccessfulLoginBlankEmail() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("");
        authenticationPage.insertIntoLoginPasswd("anadajshk");
        authenticationPage.clickLoginButton();
        authenticationPage.checkErrorMessageLogin("There is 1 error\nAn email address required.");
    }

    @Test
    public void unsuccessfulLoginBlankPassword() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.insertIntoLoginEmail("tapucovidiu@gmail.com");
        authenticationPage.insertIntoLoginPasswd("");
        authenticationPage.clickLoginButton();
        authenticationPage.checkErrorMessageLogin("There is 1 error\nPassword is required.");
    }

    @Test
    public void successfulForgotYourPassword() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.clickForgotYourPasswordButton();
        forgotYourPasswordPage.checkIfForgotYouPasswordPage();
        forgotYourPasswordPage.insertIntoEmailInput("tapucovidiu@gmail.com");
        forgotYourPasswordPage.clickRetrievePasswordButton();
        forgotYourPasswordPage.checkIfSuccessful("tapucovidiu@gmail.com");
    }

    @Test
    public void unsuccessfulForgotYourPasswordUnusedEmail() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.clickForgotYourPasswordButton();
        forgotYourPasswordPage.checkIfForgotYouPasswordPage();
        forgotYourPasswordPage.insertIntoEmailInput("tapcovidiu@gmail.com");
        forgotYourPasswordPage.clickRetrievePasswordButton();
        forgotYourPasswordPage.checkErrorMessage("There is 1 error\nThere is no account registered for this email address.");
    }

    @Test
    public void unsuccessfulForgotYourPasswordInvalidEmail() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.clickForgotYourPasswordButton();
        forgotYourPasswordPage.checkIfForgotYouPasswordPage();
        forgotYourPasswordPage.insertIntoEmailInput("tapcovidiu@gmailcom");
        forgotYourPasswordPage.clickRetrievePasswordButton();
        forgotYourPasswordPage.checkErrorMessage("There is 1 error\nInvalid email address.");
    }

    @Test
    public void unsuccessfulForgotYourPasswordBlankEmail() {
        homePage.clickSignInButton();
        authenticationPage.checkIfAuthenticationPage();
        authenticationPage.clickForgotYourPasswordButton();
        forgotYourPasswordPage.checkIfForgotYouPasswordPage();
        forgotYourPasswordPage.clickRetrievePasswordButton();
        forgotYourPasswordPage.checkErrorMessage("There is 1 error\nInvalid email address.");
    }

    //Enter username
    //Enter password
    //Click login/sign in
    //Verify page title
    //Verify login is made with correct email/username
}
