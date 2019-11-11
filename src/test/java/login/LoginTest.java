package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPasssword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue (secureAreaPage.getAlertText().contains("You logged into a secure area!"), /*If failed message*/"Alert text is incorrect.");
    }

}
