package ui_automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.AssertDataConstants;

public class LogIn extends BaseTest {


    @Test
    public void LogInAsAdmin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logInUrl();
        Assert.assertEquals(loginPage.driver.getTitle(), AssertDataConstants.SIGN_IN_PAGE_TITLE);
        loginPage.logIn("admin", "admin");
        Assert.assertEquals(loginPage.driver.getTitle(), AssertDataConstants.MAIN_PAGE_TITLE);
    }
}
