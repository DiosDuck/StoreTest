package storeTest;

import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void shouldLogin(){
        homePage.clickSignInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
    }

    //Enter username
    //Enter password
    //Click login/sign in
    //Verify page title
    //Verify login is made with correct email/username
}
