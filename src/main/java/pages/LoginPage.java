package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UrlFactoryConstants;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public static final String USERNAME_LOCATOR = "username";
    public static final String PASSWORD_LOCATOR = "password";
    public static final String SIGN_IN_BTN_LOCATOR = "submit-button";


    @FindBy(id = USERNAME_LOCATOR)
    public WebElement username;
    @FindBy(id = PASSWORD_LOCATOR)
    public WebElement password;
    @FindBy(id = SIGN_IN_BTN_LOCATOR)
    public WebElement signInBtn;


    public void logInUrl() {
        driver.get(UrlFactoryConstants.LOGIN_PAGE_URL);
    }

    public void logIn(String userName, String pwd) {
        username.sendKeys(userName);
        password.sendKeys(pwd);
        signInBtn.click();

    }
}
