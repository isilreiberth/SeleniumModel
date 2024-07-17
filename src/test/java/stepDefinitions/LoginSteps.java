package stepDefinitions;

import base.TestBaseSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps extends TestBaseSetup {
    LoginPage login;
    DashboardPage dashboard;

    String username;
    String password;

    @Before
    public void Setup(){
        initializeTestBaseSetup();
    }
    @After
    public void cleanUp(){
        getDriver().quit();
    }

    @Dado("que me encuentro en la pagina de inicio de sesion")
    public void queMeEncuentroEnLaPaginaDeInicioDeSesion() {
        login = new LoginPage(getDriver());
    }

    @Cuando("ingres el usuario {string}")
    public void ingresElUsuario(String arg0) {
        username = arg0;
    }

    @Y("ingrese el password {string}")
    public void ingreseElPassword(String arg0) {
        password = arg0;
    }

    @Y("active la opcion Login")
    public void activeLaOpcionLogin() {
        dashboard = login.with(username, password);
    }

    @Entonces("deberia acceder al Dashboard de Wordpress")
    public void deberiaAccederAlDashboardDeWordpress() {
        assertTrue(dashboard.title().contains("Dashboard"));
    }
}
