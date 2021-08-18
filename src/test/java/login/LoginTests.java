package login;

import base.BaseTests;
import base.BaseTestsEventsListeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTests {
    @Test
    public void testSuccessFullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();

        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");


        SecureAreaPage secureAreaPageLogOut = loginPage.clickLogOutButton();
        System.out.println(secureAreaPageLogOut.getAlertText());
    }
}
