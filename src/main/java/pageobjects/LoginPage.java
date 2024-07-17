package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By emailTextBox = By.id("user_login");
    private By passwordTextBox = By.id("user_pass");
    private By loginBtn = By.id("wp-submit");
    private By errorMsgTxt = By.id("login_error");
    private By lostYourPasswordLink = By.linkText("Lost your password?");
    private By logOutMsg = By.cssSelector("#login > p.message");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getLoginPageTitle() {
        String pageTitle = driver.getTitle();
        return pageTitle;
    }

    public LostPasswordPage clickOnLostYourPassword() {
        click(lostYourPasswordLink);
        return new LostPasswordPage(driver);
    }

    public DashboardPage with(String username, String password) {
        type(emailTextBox, username);
        type(passwordTextBox, password);
        click(loginBtn);
        return new DashboardPage(driver);
    }

    public String getLogOutMessage() {
        return getText(logOutMsg);
    }
    public String getErrorMessage() {
        return getText(errorMsgTxt);
    }
}

