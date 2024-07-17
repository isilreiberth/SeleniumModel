package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    private By dashboardTitle = By.cssSelector("#wpbody-content > div.wrap > h1");
    private By logoutLink = By.xpath("//a[text()='Log Out']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String title() {
        return getText(dashboardTitle);
    }

    public LoginPage logOut() throws InterruptedException {
        visit(getAttribute(logoutLink, "href"));
        Thread.sleep(2000);
        return new LoginPage(driver);
    }
}

