package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Configuration {
    public static String IP = "http://20.169.202.27";
    public static String LOGIN_URL = IP + "/login";
    public static String ADMIN_URL = IP + "/wp-admin";
    public static String BLOG_URL = IP + "/wordpress";
    // Se agrego en el ejercicio 3.11. Acciones Basicas
    public static String USER = "user";
    public static String PASS = "Password123";

    public static String DRIVER_DIR = System.getProperty("user.dir")
            + File.separator
            + "drivers"
            + File.separator;

    public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";
    public static String GECKO_DRIVER_PATH = DRIVER_DIR + "geckodriver";

    public static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver",
                modifyIfWindows(CHROME_DRIVER_PATH));
        return new ChromeDriver();
    }

    public static WebDriver createGeckoDriver() {
        System.setProperty("webdriver.gecko.driver",
                modifyIfWindows(GECKO_DRIVER_PATH));
        return new FirefoxDriver();
    }
    public static String modifyIfWindows(String inPath) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            return inPath + ".exe";
        } else {
            return inPath;
        }
    }
}

