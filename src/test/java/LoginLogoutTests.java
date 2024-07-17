import base.TestBaseSetup;
import common.Configuration;
import org.junit.jupiter.api.Test;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginLogoutTests extends TestBaseSetup {
    LoginPage login;
    DashboardPage dashboard;

    @Test
    void testLoginLogoutSuccess() throws  InterruptedException{
        login = new LoginPage(getDriver());
        dashboard = login.with(Configuration.USER, Configuration.PASS);
        assertTrue(dashboard.title().contains("Dashboard"));
        login = dashboard.logOut();
        assertTrue(login.getLogOutMessage().contains("logged out."));
    }
}
